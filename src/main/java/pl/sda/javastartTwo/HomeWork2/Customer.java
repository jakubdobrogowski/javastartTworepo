package pl.sda.javastartTwo.HomeWork2;

public class Customer extends Person {


    public Customer(String name, String surName, int age, int salary) {
        super(name, surName, age, salary);
    }

    public Customer(String name, String surName, int age, String salary) {
        super(name, surName, age, salary);
    }
}
