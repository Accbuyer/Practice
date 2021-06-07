package day2;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>(List.of(new Person("Max", "White", 27L, Gender.MALE),
                new Person("Anna", "Brown", 34L, Gender.FEMALE), new Person("Kate", "Lance", 12L, Gender.FEMALE),
                new Person("Tom", "Brown", 33L, Gender.MALE), new Person("Lari", "Lowsen", 58L, Gender.MALE),
                new Person("John", "Black", 40L, Gender.MALE), new Person("Elly", "Nord", 25L, Gender.FEMALE),
                new Person("John", "White", 70L, Gender.MALE), new Person("Lora", "Hox", 38L, Gender.FEMALE),
                new Person("Kris", "Roger", 24L, Gender.MALE)));

        PersonService ps = new PersonService(personList);
        System.out.println(ps.splitList());
        System.out.println(ps.listOfNames());
        System.out.println(ps.splitAgeAndSex());

    }
}
