package day3;

public class Test {
    public static void main(String[] args) {
        CookService cs = new CookService();
        System.out.println(cs.showRestaurants());
        System.out.println(cs.showUniqueRestaurants());
        System.out.println(cs.showNamesOfRestaurants());
    }
}
