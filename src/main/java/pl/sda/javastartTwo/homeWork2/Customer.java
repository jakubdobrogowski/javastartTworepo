package pl.sda.javastartTwo.homeWork2;

import java.util.Objects;

public class Customer {


    private int id;
    private String name;
    private String surName;
    private int age;
    private double salary;

    private static int staticId = 1;


    public Customer(String name, String surName, int age, String salary) {

        this(name, surName, age, Integer.parseInt(salary));

        //  this.id = staticId++;
        //  this.name = name;
        // this.surName = surName;
        //  this.age = age;
        // this.salary = Integer.parseInt(salary);

    }

    public Customer(String name, String surName, int age, int salary) {

        this.id = staticId++;
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.salary = salary;

    }


    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer person = (Customer) o;
        return id == person.id;

    }

    @Override
    public int hashCode() {

        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}


