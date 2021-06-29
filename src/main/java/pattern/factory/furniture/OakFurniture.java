package pattern.factory.furniture;

import pattern.factory.api.Armchair;
import pattern.factory.api.Chair;
import pattern.factory.api.Factory;
import pattern.factory.api.Table;
import pattern.factory.entity.OakArmchair;
import pattern.factory.entity.OakChair;
import pattern.factory.entity.OakTable;

public class OakFurniture implements Factory {
    @Override
    public Table createTable() {
        return new OakTable();
    }

    @Override
    public Chair createChair() {
        return new OakChair();
    }

    @Override
    public Armchair createArmchair() {
        return new OakArmchair();
    }

    @Override
    public String getType() {
        return "Oak";
    }
}
