package pattern.observer;

public class Dashboard implements Observer {

    private Integer speed;

    private Integer rpm;

    private Integer petrolLevel;

    @Override
    public void update(Integer speed, Integer rpm, Integer petrolLevel) {
        this.speed = speed;
        this.rpm = rpm;
        this.petrolLevel = petrolLevel;
    }

    @Override
    public String toString() {
        return "Dashboard{" +
                "speed=" + speed +
                ", rpm=" + rpm +
                ", petrolLevel=" + petrolLevel +
                '}';
    }
}
