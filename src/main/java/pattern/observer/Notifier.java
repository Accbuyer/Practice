package pattern.observer;

public interface Notifier {

    void addObserver(Observer observer);

    void notifyObserver();
}
