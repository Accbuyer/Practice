package day6;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PersonService {
    private final List<Person> personList;

    public PersonService() {
        personList = List.of(new Person("Max", "Brown", 27), new Person("Anna", "Brown", 34),
                new Person("Bob", "Brown", 12), new Person("Tom", "Brown", 33),
                new Person("Lari", "Lowsen", 58), new Person("John", "Black", 40),
                new Person("Elly", "Nord", 25), new Person("John", "White", 70),
                new Person("Lora", "Hox", 38), new Person("Kris", "Roger", 24));
    }

    public void printAll() {
        print(getSortedListByNames());
        print(getSortedListBySurnames());
        print(getSortedListByAges());
        print(getSortedListBySurnamesAndNames());
        print(getSortedListByNamesAndAges());
        print(getSortedListBySuramesAndAges());
    }

    private void print(List<Person> list) {
        System.out.println(list);
    }

    private List<Person> getSortedListByNames() {
        Comparator<Person> comparator = Comparator.comparing(Person::getName);
        return personList.stream()
                .sorted(comparator)
                .collect(Collectors.toList());
    }

    private List<Person> getSortedListBySurnames() {
        Comparator<Person> comparator = Comparator.comparing(Person::getSurname);
        return personList.stream()
                .sorted(comparator)
                .collect(Collectors.toList());
    }

    private List<Person> getSortedListByAges() {
        Comparator<Person> comparator = Comparator.comparing(Person::getAge);
        return personList.stream()
                .sorted(comparator)
                .collect(Collectors.toList());
    }

    private List<Person> getSortedListBySurnamesAndNames() {
        Comparator<Person> firstComparator = Comparator.comparing(Person::getSurname);
        Comparator<Person> secondComparator = Comparator.comparing(Person::getName);
        return personList.stream()
                .sorted(secondComparator.thenComparing(firstComparator))
                .collect(Collectors.toList());
    }

    private List<Person> getSortedListByNamesAndAges() {
        Comparator<Person> firstComparator = Comparator.comparing(Person::getName);
        Comparator<Person> secondComparator = Comparator.comparing(Person::getAge);
        return personList.stream()
                .sorted(secondComparator.thenComparing(firstComparator))
                .collect(Collectors.toList());
    }

    private List<Person> getSortedListBySuramesAndAges() {
        Comparator<Person> firstComparator = Comparator.comparing(Person::getSurname);
        Comparator<Person> secondComparator = Comparator.comparing(Person::getAge);
        return personList.stream()
                .sorted(secondComparator.reversed().thenComparing(firstComparator.reversed()))
                .collect(Collectors.toList());
    }
}
