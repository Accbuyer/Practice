package day4;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PersonService {
    private final List<Person> person;

    public PersonService() {
        this.person = new ArrayList<>(List.of(new Person("Max", "White", 27L, Gender.MALE),
                new Person("Anna", "Brown", 34L, Gender.FEMALE), new Person("Kate", "Lance", 12L, Gender.FEMALE),
                new Person("Tom", "Brown", 33L, Gender.MALE), new Person("Lari", "Lowsen", 58L, Gender.MALE),
                new Person("John", "Black", 40L, Gender.MALE), new Person("Elly", "Nord", 25L, Gender.FEMALE),
                new Person("John", "White", 70L, Gender.MALE), new Person("Lora", "Hox", 38L, Gender.FEMALE),
                new Person("Kris", "Roger", 24L, Gender.MALE), new Person("Alex", "White", 27L, Gender.MALE),
                new Person("Anna", "Brown", 34L, Gender.FEMALE), new Person("Lorell", "Lance", 12L, Gender.FEMALE),
                new Person("Tom", "Brown", 32L, Gender.MALE), new Person("Peter", "Lowsen", 55L, Gender.MALE),
                new Person("John", "Black", 30L, Gender.MALE), new Person("Ella", "Nord", 23L, Gender.FEMALE),
                new Person("John", "White", 80L, Gender.MALE), new Person("Lira", "Hox", 39L, Gender.FEMALE),
                new Person("Kane", "Roger", 34L, Gender.MALE)));
    }

    public Map<Long, String> createMapOfName() {
        return person.stream()
                .collect(Collectors.toMap(Person::getId, x -> x.getFirstName() + " " + x.getLastName()));
    }

    public Map<Long, Person> createMapOfEntity() {
        return person.stream()
                .collect(Collectors.toMap(Person::getId, Function.identity()));
    }

    public Map<Long, Person> createMapOfMultipleId() {
        return person.stream()
                .filter(x -> x.getId() % 5 == 0)
                .collect(Collectors.toMap(Person::getId, Function.identity()));
    }

    public Map<Gender, List<Person>> createMapOfSex() {
        return person.stream()
                .collect(Collectors.groupingBy(Person::getSex, Collectors.toList()));
    }

    public Map<Gender, List<Person>> createMapOfSexOfMultipleId() {
        return person.stream()
                .filter(x -> x.getId() % 5 == 0)
                .collect(Collectors.groupingBy(Person::getSex, Collectors.toList()));
    }

    public void printAll() {
        print(createMapOfName());
        print(createMapOfEntity());
        print(createMapOfMultipleId());
        print(createMapOfSex());
        print(createMapOfSexOfMultipleId());
    }

    private void print(Map<?, ?> map) {
        System.out.println(map);
    }
}
