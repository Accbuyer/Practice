package pattern.strategy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Chief chief = new Chief();
        Builder builder = new Builder();
        Map<Integer, Building> buildings = new HashMap<>();
        buildings.put(1, new OneFloorBuilding());
        buildings.put(2, new TwoFloorsBuilding());
        buildings.put(3, new ManyFloorBuilding());

        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();

        if (id == 1) {
            chief.initOneFloorBuilding(buildings.get(1));
            builder.build(buildings.get(1));
        } else if (id == 2) {
            chief.initTwoFloorBuilding(buildings.get(2));
            builder.build(buildings.get(2));
        } else {
            chief.initManyFloorBuilding(buildings.get(3));
            builder.build(buildings.get(3));
        }
    }
}
