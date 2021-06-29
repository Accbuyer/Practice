package pattern.factory.furniture;

import pattern.factory.api.Armchair;
import pattern.factory.api.Chair;
import pattern.factory.api.Factory;
import pattern.factory.api.Table;
import pattern.factory.entity.BeechArmchair;
import pattern.factory.entity.BeechChair;
import pattern.factory.entity.BeechTable;


public class BeechFurniture implements Factory {
    @Override
    public Table createTable() {
        return new BeechTable();
    }

    @Override
    public Chair createChair() {
        return new BeechChair();
    }

    @Override
    public Armchair createArmchair() {
        return new BeechArmchair();
    }

    @Override
    public String getType() {
        return "Beech";
    }
}
