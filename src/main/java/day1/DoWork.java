/*
1) Создать список из 100 рандомных чисел в пределах 0 - 1000.
Путем операции filter() получить НОВЫЙ список из тех чисел, которые делятся на 5 без остатка
2) Используем все тот же созданный список. Отфильтровать его, чтобы там было только число 100. Попробовать достать любое из этих чисел = 100,
либо вывести в консоль "Число не найдено". Подсказка - операция findAny() возвращает Optional
3) Условие из задачи №2, но достать не любое, а первое (findFirst()), либо вывести все ту же запись. Операция так же возвращает Optional.
4) Создать список из 100 рандомных String, используя UUID.randomUUID(). Отфильтровать список по условию - в строке содержится символ "а".
5) Создать список из 100 рандомных Boolean (Random.nextBoolean()). Отфильтровать 'true' и вывести в консоль количество таковых
 */

package day1;

import java.util.*;
import java.util.stream.Collectors;

public class DoWork {
    public static List<Integer> doFirst(List<Integer> list) {

        return list.stream().filter(x -> x % 5 == 0).collect(Collectors.toList());
    }

    public static void doSecond(List<Integer> list) {

        Optional<Integer> optional = list.stream().filter(x -> x == 100).findAny();

        if (optional.isEmpty()) {
            System.out.println("Число не найдено");
        }
    }

    public static void doThird(List<Integer> list) {

        Optional<Integer> optional = list.stream().filter(x -> x == 100).findFirst();

        if (optional.isEmpty()) {
            System.out.println("Число не найдено");
        }

    }

    public static List<String> doFourth() {
        List<String> listOfString = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            listOfString.add(UUID.randomUUID().toString());
        }

        return listOfString.stream().filter(x -> x.contains("a")).collect(Collectors.toList());
    }

    public static int doFifth() {
        Random rnd = new Random();
        List<Boolean> booleanList = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            booleanList.add(rnd.nextBoolean());
        }

        return (int) booleanList.stream().filter(x -> x).count();

    }

    public static void main(String[] args) {

        Random rnd = new Random();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            list.add(rnd.nextInt(1001));
        }

        System.out.println(doFirst(list));
        doSecond(list);
        doThird(list);
        System.out.println(doFourth());
        System.out.println(doFifth());

    }

}
