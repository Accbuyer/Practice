package pattern.singleton;

public class Test {
    public static void main(String[] args) {
        SomeClass someClass = SomeClass.getInstance();
        SomeClass someClass1 = SomeClass.getInstance();
        System.out.println(someClass == someClass1);
    }
}
