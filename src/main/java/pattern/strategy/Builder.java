package pattern.strategy;

public class Builder {
    public void build(Building building) {
        System.out.println(building.getFloorCount());
        System.out.println(building.getApartmentsCount());
        System.out.println(building.getHasElevator());
    }
}
