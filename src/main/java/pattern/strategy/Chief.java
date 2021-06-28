package pattern.strategy;

public class Chief {
    public void initOneFloorBuilding(Building oneFloor) {
        oneFloor.setFloorCount(1);
        oneFloor.setApartmentsCount(4);
        oneFloor.setHasElevator(false);
    }

    public void initTwoFloorBuilding(Building twoFloor) {
        twoFloor.setFloorCount(2);
        twoFloor.setApartmentsCount(8);
        twoFloor.setHasElevator(false);
    }

    public void initManyFloorBuilding(Building manyFloor) {
        manyFloor.setFloorCount(5);
        manyFloor.setApartmentsCount(20);
        manyFloor.setHasElevator(true);
    }
}
