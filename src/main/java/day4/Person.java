package day4;

public class Person {

    private static Long counter = 0L;

    private Long id;

    private String firstName;

    private String lastName;

    private Long age;

    private Gender sex;

    public Person(String firstName, String lastName, Long age, Gender sex) {
        id = ++counter;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
    }

    public Long getId() {
        return id;
    }

    public static Long getCounter() {
        return counter;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Long getAge() {
        return age;
    }

    public Gender getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

}
