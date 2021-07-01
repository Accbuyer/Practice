package pattern.templateMethod;

public class PineFurtinute extends Furniture {

    public PineFurtinute() {
        super("Pine");
    }

    @Override
    Table createTable() {
        return new Table();
    }

    @Override
    Armchair createArmchair() {
        return new Armchair();
    }

    @Override
    Chair createChair() {
        return new Chair();
    }
}
