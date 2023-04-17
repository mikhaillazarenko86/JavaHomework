package org.example;

import javax.swing.*;
import java.util.HashMap;
import java.util.*;


public class Program {
    public static void main(String[] args) {
        Employee w1 = new Employee("Igor", "Petrov", 1983);
        Employee w2 = new Employee("Igor", "Petrov", 1981);
        Employee w3 = new Employee("Igor", "Petrov", 1984);
        Set<String> hashset = new HashSet<>();
        hashset.add(w1.toString());
        hashset.add(w2.toString());
//        System.out.println(w1);
//        System.out.println(w1.getAge());
//        System.out.println(w1.getInfo());

        System.out.println(w1.getFullName());

        System.out.println(Employee.olderThan(w2, w1));
        w2.upgrade(20);
        System.out.println(w2);











    }
}
