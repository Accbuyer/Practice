package pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class CentralComputer implements Notifier {

    private Integer speed;

    private Integer rpm;

    private Integer petrolLevel;

    private final List<Observer> observers = new ArrayList<>();

    public void update(Integer speed, Integer rpm, Integer petrolLevel) {
        this.speed = speed;
        this.rpm = rpm;
        this.petrolLevel = petrolLevel;
        notifyObserver();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(speed, rpm, petrolLevel);
        }
    }

    @Override
    public String toString() {
        return "CentralComputer{" +
                "speed=" + speed +
                ", rpm=" + rpm +
                ", petrolLevel=" + petrolLevel +
                '}';
    }
}
