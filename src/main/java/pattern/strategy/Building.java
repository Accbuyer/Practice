package pattern.strategy;

public interface Building {
    Integer getFloorCount();

    Integer getApartmentsCount();

    boolean getHasElevator();

    void setFloorCount(Integer floorCount);

    void setApartmentsCount(Integer apartmentsCount);

    void setHasElevator(boolean hasElevator);
}
