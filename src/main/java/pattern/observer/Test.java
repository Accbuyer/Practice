package pattern.observer;

public class Test {
    public static void main(String[] args) {
        CentralComputer cc = new CentralComputer();
        cc.update(100, 800, 3);
        Dashboard dashboard = new Dashboard();
        cc.addObserver(dashboard);
        System.out.println(cc);
        System.out.println(dashboard);
        cc.update(200, 1400, 1);
        System.out.println(cc);
        System.out.println(dashboard);
    }
}
