package pattern.adapter;

public class IceRoadAdapter implements Road{
    IceRoad iceRoad = new IceRoad();

    @Override
    public void run() {
        iceRoad.walk();
    }
}
