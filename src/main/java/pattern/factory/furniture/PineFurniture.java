package pattern.factory.furniture;

import pattern.factory.api.Armchair;
import pattern.factory.api.Chair;
import pattern.factory.api.Factory;
import pattern.factory.api.Table;
import pattern.factory.entity.PineArmchair;
import pattern.factory.entity.PineChair;
import pattern.factory.entity.PineTable;

public class PineFurniture implements Factory {
    @Override
    public Table createTable() {
        return new PineTable();
    }

    @Override
    public Chair createChair() {
        return new PineChair();
    }

    @Override
    public Armchair createArmchair() {
        return new PineArmchair();
    }

    @Override
    public String getType() {
        return "Pine";
    }
}
