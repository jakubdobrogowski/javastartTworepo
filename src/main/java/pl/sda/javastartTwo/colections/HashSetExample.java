package pl.sda.javastartTwo.colections;

import pl.sda.javastartTwo.Person;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

    public static void main(String[] args) {

        basicHashSetOperation();
        addingPersonToSet();

    }

    private static void addingPersonToSet() {

        Person tomek = new Person(123, "Tomek");
        Person ania = new Person(4534, "Ania");
        Person ola = new Person(123, "Ola");
        Person magda1 = new Person(45, "Magda");
        Person magda2 = new Person(45, "Magda");

        Set<Person> people = new HashSet<>();
        people.add(tomek);
        people.add(ania);
        people.add(ola);
        people.add(magda1);
        people.add(magda2);
        System.out.println(people);
    }

    private static void basicHashSetOperation() {
        Set<String> firstSet = new HashSet<>();
        firstSet.add("1");
        firstSet.add("2");
        firstSet.add("3");
        boolean added1 = firstSet.add("4");
        boolean added2 = firstSet.add("4");

        System.out.println(added1+ " " + added2);
        System.out.println("Nasz set: " + firstSet);
        System.out.println("set.size: "+ firstSet.size());
        System.out.println("set.contain(\"2\"): " + firstSet.contains("2") );
    }

}
