package org.example;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Employee{
    int yearOfBirth;
    String  firstName;
    String lastName;
    double salary;

    public Employee(String firstName, String lastName,int yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        salary = 50;
    }

    public int getAge(){
        Date date = new Date();
        int year = date.getYear() + 1900;
        int age = year - this.yearOfBirth;
        return age;
    }
    public String getFullName(){
        return firstName + " " + lastName;
    }
    public String getInfo(){
        return firstName + " " + lastName + " age: " + getAge() + " salary:  " + salary;
    }
    public static boolean olderThan(Employee w1, Employee w2) {

        if (w1.getAge() > w2.getAge()) {
            return true;
        } else {
            return false;
        }
    }
    void upgrade(double salary){
        this.salary = this.salary + salary;
    }


    @Override
    public String toString() {

        return firstName + " " + lastName + " age: " + getAge() + " salary:  " + salary;
    }
    @Override
    public int hashCode(){
        return Objects.hash(firstName, lastName, yearOfBirth);
    }
    @Override
    public boolean equals(Object obj) {

        if (obj == null || getClass() != obj.getClass()){
            return false;
        }
        Employee employee = (Employee) obj;
        return lastName == employee.lastName && firstName == employee.firstName && yearOfBirth == employee.yearOfBirth;
        }


}
