package org.example;
import java.util.*;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList();
        numbers.add(3);
        numbers.add(32);
        numbers.add(5);
        numbers.add(8);
        numbers.add(37);
        numbers.add(636);
        numbers.add(9);
        removeEvenNumber(numbers);
        System.out.println(numbers);
        List<String> strings = new ArrayList<>();
        strings.add("string");
        strings.add("40");
        strings.add("-5");
        strings.add("my_string");
        strings.add("-1045");
        removeIntegers(strings);
        System.out.println(strings); // [string, my_string]
    }

    static void removeEvenNumber(List<Integer> numbers) {
        // TODO: 31.03.2023 Удалить все четные элементы из списка
        numbers.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if (integer % 2 == 0) {
                    return true;
                }
                return false;
            }
        });
    }

    static void removeIntegers(List<String> strings) {
        // TODO: 31.03.2023 Удалить строки, которые являются целыми числами
       Iterator<String> iterator = strings.iterator();
       while (iterator.hasNext()){
           try {
               Integer.parseInt(iterator.next());
               iterator.remove();
// число
           } catch (NumberFormatException e) {
// не число
           }
       }

        }
}