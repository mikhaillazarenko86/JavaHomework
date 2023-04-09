package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> storage = new LinkedList<>();
        String message = "print - вывод введенны х значений в обратном порядке, revert - для удаления последней введенной строки; exit - выход из программы";
        System.out.println(message);
        while (true){
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            storage.add(input);

            if ("print".contains(input)){
                storage.pollLast();
                ListIterator<String> itr = storage.listIterator(storage.size());
                while (itr.hasPrevious()) {
                System.out.println(itr.previous());
            }
           } else if ("revert".contains(input)){
                storage.pollLast();
                ListIterator<String> itr = storage.listIterator(storage.size());
                storage.remove(itr.previous());
                System.out.println(storage);
            }
            else if ("exit".contains(input)) {
            storage.pollLast();
            System.out.println(storage);
            break;
        }

        }



    }
}