package pattern.templateMethod;

public class Test {
    public static void main(String[] args) {
        System.out.println(new OakFurtinute().createFurniture());
        System.out.println(new PineFurtinute().createFurniture());
        System.out.println(new BeechFurtinute().createFurniture());
    }
}
