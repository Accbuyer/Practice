package pattern.singleton;

import java.util.Objects;

public class SomeClass {
    private static SomeClass someClass;

    private SomeClass() {}

    public static synchronized SomeClass getInstance() {
        if (Objects.isNull(someClass)) {
            someClass = new SomeClass();
        }
        return someClass;
    }
}
