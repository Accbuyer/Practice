package pattern.factory.api;

public interface Factory {
    Table createTable();

    Chair createChair();

    Armchair createArmchair();

    String getType();
}
