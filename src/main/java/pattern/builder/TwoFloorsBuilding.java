package pattern.builder;

public class TwoFloorsBuilding implements Building{
    private Integer numberOfFloors;

    private Integer numberOfApartments;

    private boolean hasElevator;

    @Override
    public void setNumberOfFloors(int number) {
        numberOfFloors = number;
    }

    @Override
    public void setNumberOfApartments(int number) {
        numberOfApartments = number;
    }

    @Override
    public void setPresenceOfElevator(boolean b) {
        hasElevator = b;
    }
}
