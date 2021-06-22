package final_day;

public class Person {
    private final String name;

    private final String surname;

    private final Integer age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + age;
    }
}