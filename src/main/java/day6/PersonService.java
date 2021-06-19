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
        return personList.stream().sorted(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        }).collect(Collectors.toList());
    }

    private List<Person> getSortedListBySurnames() {
        return personList.stream().sorted(Comparator.comparing(Person::getSurname)).collect(Collectors.toList());
    }

    private List<Person> getSortedListByAges() {
        return personList.stream().sorted(Comparator.comparing(Person::getAge)).collect(Collectors.toList());
    }

    private List<Person> getSortedListBySurnamesAndNames() {
        return personList.stream().sorted((o1, o2) -> {
            if (o1.getSurname().equals(o2.getSurname())) {
                return o1.getName().compareTo(o2.getName());
            } else {
                return o1.getSurname().compareTo(o2.getSurname());
            }
        }).collect(Collectors.toList());
    }

    private List<Person> getSortedListByNamesAndAges() {
        return personList.stream().sorted((o1, o2) -> {
            if (o1.getName().equals(o2.getName())) {
                return o1.getAge().compareTo(o2.getAge());
            } else {
                return o1.getName().compareTo(o2.getName());
            }
        }).collect(Collectors.toList());
    }

    private List<Person> getSortedListBySuramesAndAges() {
        return personList.stream().sorted(((Comparator<Person>) (o1, o2) -> {
            if (o1.getSurname().equals(o2.getSurname())) {
                return o1.getAge().compareTo(o2.getAge());
            } else {
                return o1.getSurname().compareTo(o2.getSurname());
            }
        }).reversed()).collect(Collectors.toList());
    }
}
