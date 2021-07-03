package pattern.adapter;

public class Test {
    public static void main(String[] args) {
        IceRoadAdapter iceRoadAdapter = new IceRoadAdapter();
        Runner runner = new Runner(iceRoadAdapter);
        runner.runOnTheRoad();
    }
}
