/*
1) Создать список из 100 рандомных чисел в пределах 0 - 1000.
Путем операции filter() получить НОВЫЙ список из тех чисел, которые делятся на 5 без остатка
2) Используем все тот же созданный список. Отфильтровать его, чтобы там было только число 100. Попробовать достать любое из этих чисел = 100,
либо вывести в консоль "Число не найдено". Подсказка - операция findAny() возвращает Optional
3) Условие из задачи №2, но достать не любое, а первое (findFirst()), либо вывести все ту же запись. Операция так же возвращает Optional.
4) Создать список из 100 рандомных String, используя UUID.randomUUID(). Отфильтровать список по условию - в строке содержится символ "а".
5) Создать список из 100 рандомных Boolean (Random.nextBoolean()). Отфильтровать 'true' и вывести в консоль количество таковых
 */



import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.stream.Collectors;

public class day1 {


    public static void main(String[] args) {

    Random rnd = new Random();
    List<Integer> list = new ArrayList<>();

    for(int i = 0; i < 100; i++){

        list.add(rnd.nextInt(1001));


    }
        ///////////////////1///////////////////////
        System.out.println(list.stream().filter(x -> x % 5 == 0).collect(Collectors.toList()));


        ///////////////////2///////////////////////
        System.out.println(list.stream().map(Object::toString).filter(x -> x.equals("100")).findAny().orElse("Число не найдено"));


        ///////////////////3///////////////////////
        System.out.println(list.stream().map(Object::toString).filter(x -> x.equals("100")).findFirst().orElse("Число не найдено"));


        ///////////////////4///////////////////////
        List <String> listOfString = new ArrayList<>();

        for(int i = 0; i < 100; i ++){
            listOfString.add(UUID.randomUUID().toString());
        }


        listOfString.stream().filter(x -> x.indexOf('a') != -1).forEach(System.out::println);

        ///////////////////5///////////////////////

        List<Boolean> booleanList = new ArrayList<>();

        for(int i = 0; i < 100; i ++){

            booleanList.add(rnd.nextBoolean());
        }

        System.out.println(booleanList.stream().filter(x -> x).count());


 }

}
