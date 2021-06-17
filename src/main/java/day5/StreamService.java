package day5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamService {
    Random rnd;
    List<Integer> list;

    public StreamService() {
        rnd = new Random();
        list = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            list.add(rnd.nextInt());
        }
        //Можно так в конструкторе делать?
    }

    public void printAll() {
        getMax(list);
        getMin(list);
        printList(getLimitedList(list));
        printList(getSkippedList(list));
        getSum(list);
        printNumber(getSumWithStartingValueIsOne(list));
    //Это нормально, что я здесь по-разному вызываю принты?
    }

    private void getMax(List<Integer> list) {
        list.stream()
                .max(Integer::compare).ifPresent(this::printNumber);
    }

    private void getMin(List<Integer> list) {
        list.stream()
                .min(Integer::compare).ifPresent(this::printNumber);
    }

    private void printList(List<Integer> list) {
        System.out.println(list);
    }

    private List<Integer> getLimitedList(List<Integer> list) {
        return list.stream().limit(10).collect(Collectors.toList());
    }

    private List<Integer> getSkippedList(List<Integer> list) {
        return list.stream().skip(80).collect(Collectors.toList());
    }

    private void getSum(List<Integer> list) {
        list.stream()
                .reduce(Integer::sum)
                .ifPresent(this::printNumber);
    }

    private void printNumber(int number) {
        System.out.println(number);
    }

    private int getSumWithStartingValueIsOne(List<Integer> list) {
        return list.stream()
                .reduce(1, Integer::sum);
    }
}