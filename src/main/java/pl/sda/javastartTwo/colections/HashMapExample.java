package pl.sda.javastartTwo.colections;

import pl.sda.javastartTwo.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMapExample {

    public static void main(String[] args) {


        basicMapOperations();
    }

    private static void basicMapOperations() {

        Person ania = new Person(123, "Ania");
        Person ola = new Person(234, "Ola");
        Person tomek1 = new Person(345, "Tomek");
        Person tomek2 = new Person(456, "Tomek");

        HashMap<Integer, Person> peopleByPesel = new HashMap<>();

        peopleByPesel.put(ania.getPesel(), ania);
        peopleByPesel.put(ola.getPesel(), ola);
        peopleByPesel.put(tomek1.getPesel(), tomek1);
        peopleByPesel.put(tomek2.getPesel(), tomek2);

        System.out.println(peopleByPesel);

        HashMap<String, Person> peopleByName = new HashMap<>();

        peopleByName.put(ania.getName(), ania);
        peopleByName.put(ola.getName(), ola);
        peopleByName.put(tomek1.getName(), tomek1);
        peopleByName.put(tomek2.getName(), tomek2);

        System.out.println(peopleByName);


        properWayOfAddingPeople(ania, ola, tomek1, tomek2);


    }

    private static void properWayOfAddingPeople(Person ania, Person ola, Person tomek1, Person tomek2) {
        HashMap<String, List<Person>> map = new HashMap<>();
        if (map.containsKey(ania.getName())) {

            List<Person> people = map.get(ania.getName()); //bardzo ważne pod kluczem ania jest lista "ludzi" wyciagamy liste
            people.add(ania);
        }else{
            List<Person> people = new ArrayList<>();
            people.add(ania);
            map.put(ania.getName(), people );
        }

    }

}
