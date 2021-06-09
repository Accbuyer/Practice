package day3;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CookService {
    private final List<Cook> listOfCook;

    {
        listOfCook = new ArrayList<>(List.of(new Cook("John", List.of(new Restaurant("Monro"), new Restaurant("Ciri"))),
                new Cook("Marc", List.of(new Restaurant("CityPizza"), new Restaurant("Flowers"))),
                new Cook("Kris", List.of(new Restaurant("April"), new Restaurant("SuperMeat"))),
                new Cook("Ella", List.of(new Restaurant("SushiHunter"), new Restaurant("Toxic"))),
                new Cook("Paul", List.of(new Restaurant("StreetFood"), new Restaurant("Harmony")))));
    }

    public List<Restaurant> showRestaurants() {
        return listOfCook.stream().flatMap(x -> x.getListOfRestaurants().stream()).collect(Collectors.toList());
    }

    public Set<Restaurant> showUniqueRestaurants() {
        updateList();
        //Здесь можно отступ?
        return listOfCook.stream().flatMap(x -> x.getListOfRestaurants().stream()).collect(Collectors.toSet());
    }

    public List<String> showNamesOfRestaurants() {
        return listOfCook.stream().flatMap(x -> x.getListOfRestaurants().stream().map(Restaurant::getName)).collect(Collectors.toList());
    }

    private void updateList() {
        listOfCook.get(0).addRestaurant(new Restaurant("CityPizza"));
        listOfCook.get(1).addRestaurant(new Restaurant("Monro"));
        listOfCook.get(2).addRestaurant(new Restaurant("Monro"));
        listOfCook.get(3).addRestaurant(new Restaurant("StreetFood"));
        listOfCook.get(4).addRestaurant(new Restaurant("Toxic"));
    }
}
