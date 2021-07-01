package pattern.templateMethod;

public class BeechFurtinute extends Furniture {

    public BeechFurtinute() {
        super("Beech");
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
