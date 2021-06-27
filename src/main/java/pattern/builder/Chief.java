package pattern.builder;

public class Chief {
    public void initOneFloorBuilding(Building oneFloor) {
        oneFloor.setNumberOfFloors(1);
        oneFloor.setNumberOfApartments(4);
        oneFloor.setPresenceOfElevator(false);
    }

    public void initTwoFloorBuilding(Building twoFloor) {
        twoFloor.setNumberOfFloors(2);
        twoFloor.setNumberOfApartments(8);
        twoFloor.setPresenceOfElevator(false);
    }

    public void initManyFloorBuilding(Building manyFloor) {
        manyFloor.setNumberOfFloors(5);
        manyFloor.setNumberOfApartments(20);
        manyFloor.setPresenceOfElevator(true);
    }
}
