package pattern.factory;

import pattern.factory.api.Armchair;
import pattern.factory.api.Chair;
import pattern.factory.api.Factory;
import pattern.factory.api.Table;

public class FactoryMethod {
    Factory factory;
    Table table;
    Chair chair;
    Armchair armchair;

    public FactoryMethod(Factory factory) {
        this.factory = factory;
        table = factory.createTable();
        chair = factory.createChair();
        armchair = factory.createArmchair();
    }

    @Override
    public String toString() {
        return "You ordered a table, a chair, and an armchair made of " + factory.getType();
    }
}
