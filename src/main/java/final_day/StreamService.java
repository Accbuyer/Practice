package final_day;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamService {
    private final List<List<String>> randomUuids;

    private final List<Person> people;

    public StreamService() {
        randomUuids = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            List<String> list = new ArrayList<>();
            for (int j = 0; j < 10; j++) {
                list.add(UUID.randomUUID().toString());
            }
            randomUuids.add(list);
        }

        people = List.of(new Person("Alex", "Brown", 27), new Person("Anna", "Brown", 34),
                new Person("Bob", "Brown", 12), new Person("Tom", "Brown", 33),
                new Person("Lari", "Lowsen", 58), new Person("John", "Black", 40),
                new Person("Elly", "Nord", 25), new Person("John", "White", 70),
                new Person("Lora", "Hox", 38), new Person("Alex", "Roger", 24),
                new Person("Max", "Brown", 27), new Person("Anna", "Brown", 34),
                new Person("Bob", "Brown", 12), new Person("Tom", "Brown", 33),
                new Person("Lari", "Lowsen", 58), new Person("John", "Black", 40),
                new Person("Elly", "Nord", 25), new Person("John", "White", 70),
                new Person("Lora", "Aron", 38), new Person("Kris", "Roger", 24));
    }

    public void printAll() {
        print(getFilteredMap());
        print(hasAgeOver18());
        print(getSortedListOfPerson());
    }

    private Map<String, String> getFilteredMap() {
        return randomUuids.stream()
                .flatMap(x -> x.stream().filter(y -> y.contains("a")))
                .collect(Collectors.toMap(Function.identity(), Function.identity()));
    }

    private void print(Map<String, String> map) {
        System.out.println(map);
    }

    private boolean hasAgeOver18() {
        return people.stream()
                .filter(x -> x.getName().charAt(0) == 'A')
                .allMatch(x -> x.getAge() > 18);
    }

    private void print(Boolean b) {
        System.out.println(b);
    }

    private List<Person> getSortedListOfPerson() {
        Comparator<Person> comparatorByName = Comparator.comparing(Person::getName);
        return people.stream()
                .filter(x -> x.getSurname().toLowerCase().contains("a"))
                .sorted(comparatorByName)
                .collect(Collectors.toList());
    }

    private void print(List<Person> people) {
        System.out.println(people);
    }
}
