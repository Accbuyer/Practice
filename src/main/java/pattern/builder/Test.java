package pattern.builder;

public class Test {
    public static void main(String[] args) {
        Chief chief = new Chief();
        chief.initOneFloorBuilding(new OneFloorBuilding());
        chief.initTwoFloorBuilding(new TwoFloorsBuilding());
        chief.initManyFloorBuilding(new ManyFloorBuilding());
    }
}
