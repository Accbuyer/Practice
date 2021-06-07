package day2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PersonService {

    private final List<Person> list;

    public PersonService(List<Person> list) {
        this.list = list;
    }

    public List<List<?>> splitList() {
        List<List<?>> listOfLists = new ArrayList<>();
        listOfLists.add(list.stream().map(Person::getId).collect(Collectors.toList()));
        listOfLists.add(list.stream().map(Person::getFirstName).collect(Collectors.toList()));
        listOfLists.add(list.stream().map(Person::getLastName).collect(Collectors.toList()));
        listOfLists.add(list.stream().map(Person::getAge).collect(Collectors.toList()));
        return listOfLists;
    }

    public List<String> listOfNames() {
        return list.stream().map(x -> x.getFirstName() + " " + x.getLastName()).collect(Collectors.toList());
    }

    public List<List<Long>> splitAgeAndSex() {
        List<List<Long>> listOfLists = new ArrayList<>();
        listOfLists.add(list.stream().filter(x -> x.getSex() == Gender.MALE).map(Person::getAge).collect(Collectors.toList()));
        listOfLists.add(list.stream().filter(x -> x.getSex() == Gender.FEMALE).map(Person::getAge).collect(Collectors.toList()));
        return listOfLists;
    }

}
