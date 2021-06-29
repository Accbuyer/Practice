package pattern.factory;

import pattern.factory.furniture.BeechFurniture;
import pattern.factory.furniture.OakFurniture;
import pattern.factory.furniture.PineFurniture;

public class Test {
    public static void main(String[] args) {
        FactoryMethod factoryMethod = new FactoryMethod(new OakFurniture());
        System.out.println(factoryMethod);
        FactoryMethod factoryMethod1 = new FactoryMethod(new PineFurniture());
        System.out.println(factoryMethod1);
        FactoryMethod factoryMethod2 = new FactoryMethod(new BeechFurniture());
        System.out.println(factoryMethod2);
    }
}
