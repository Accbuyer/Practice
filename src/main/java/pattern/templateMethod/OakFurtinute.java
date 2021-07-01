package pattern.templateMethod;

public class OakFurtinute extends Furniture {

    public OakFurtinute() {
        super("Oak");
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
