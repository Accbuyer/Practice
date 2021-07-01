package pattern.templateMethod;

public abstract class Furniture {

    private final String type;

    public Furniture(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String createFurniture() {
        createTable();
        createArmchair();
        createChair();
        return "You ordered a table, a chair, and an armchair made of " + getType();
    }

    abstract Table createTable();

    abstract Armchair createArmchair();

    abstract Chair createChair();
}
