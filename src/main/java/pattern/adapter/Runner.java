package pattern.adapter;

public class Runner {
    Road road;

    public Runner(Road road) {
        this.road = road;
    }

    void runOnTheRoad() {
        road.run();
    }
}
