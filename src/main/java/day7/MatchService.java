package day7;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class MatchService {
    private final List<String> listOfString;

    public MatchService() {
        listOfString = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            listOfString.add(UUID.randomUUID().toString());
        }
    }

    public void printAll() {
        print(findLetter());
        print(findNumberMissing());
        print(findAnyStringWithWord());
    }

    private void print(Boolean b) {
        System.out.println(listOfString + "\n" + b);
    }

    private boolean findLetter() {
        return listOfString.stream()
                .allMatch(x -> x.contains("a"));
    }

    private boolean findNumberMissing() {
        return listOfString.stream()
                .noneMatch(x -> x.contains("1"));
    }

    private boolean findAnyStringWithWord() {
        return listOfString.stream()
                .anyMatch(x -> x.contains("ab"));
    }
}
