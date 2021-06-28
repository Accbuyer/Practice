package pattern.strategy;



public class ManyFloorBuilding implements Building {
    private Integer floorCount;

    private Integer apartmentsCount;

    private boolean hasElevator;

    @Override
    public void setFloorCount(Integer floorCount) {
        this.floorCount = floorCount;
    }

    @Override
    public void setApartmentsCount(Integer apartmentsCount) {
        this.apartmentsCount = apartmentsCount;
    }

    @Override
    public void setHasElevator(boolean hasElevator) {
        this.hasElevator = hasElevator;
    }

    @Override
    public Integer getFloorCount() {
        return floorCount;
    }

    @Override
    public Integer getApartmentsCount() {
        return apartmentsCount;
    }

    public boolean getHasElevator() {
        return hasElevator;
    }
}
