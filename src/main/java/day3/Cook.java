package day3;

import java.util.ArrayList;
import java.util.List;

public class Cook {
    private final String name;

    private final List<Restaurant> listOfRestaurants;

    public Cook(String name, List<Restaurant> listOfRestaurants) {
        this.name = name;
        this.listOfRestaurants = new ArrayList<>(listOfRestaurants);
    }

    public String getName() {
        return name;
    }

    public List<Restaurant> getListOfRestaurants() {
        return listOfRestaurants;
    }

    public void addRestaurant(Restaurant restaurant) {
        listOfRestaurants.add(restaurant);
    }
}
