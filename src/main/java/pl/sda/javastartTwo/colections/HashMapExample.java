package pl.sda.javastartTwo.colections;

import pl.sda.javastartTwo.PersonOne;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class  HashMapExample {

    public static void main(String[] args) {


        basicMapOperations();
    }

    private static void basicMapOperations() {

        PersonOne ania = new PersonOne(123, "Ania");
        PersonOne ola = new PersonOne(234, "Ola");
        PersonOne tomek1 = new PersonOne(345, "Tomek");
        PersonOne tomek2 = new PersonOne(456, "Tomek");

        HashMap<Integer, PersonOne> peopleByPesel = new HashMap<>();

        peopleByPesel.put(ania.getPesel(), ania);
        peopleByPesel.put(ola.getPesel(), ola);
        peopleByPesel.put(tomek1.getPesel(), tomek1);
        peopleByPesel.put(tomek2.getPesel(), tomek2);

        System.out.println(peopleByPesel);

        HashMap<String, PersonOne> peopleByName = new HashMap<>();

        peopleByName.put(ania.getName(), ania);
        peopleByName.put(ola.getName(), ola);
        peopleByName.put(tomek1.getName(), tomek1);
        peopleByName.put(tomek2.getName(), tomek2);

        System.out.println(peopleByName);


        properWayOfAddingPeople(ania, ola, tomek1, tomek2);


    }

    private static void properWayOfAddingPeople(PersonOne ania, PersonOne ola, PersonOne tomek1, PersonOne tomek2) {
        HashMap<String, List<PersonOne>> map = new HashMap<>();
        if (map.containsKey(ania.getName())) {

            List<PersonOne> people = map.get(ania.getName()); //bardzo ważne pod kluczem ania jest lista "ludzi" wyciagamy liste
            people.add(ania);
        }else{
            List<PersonOne> people = new ArrayList<>();
            people.add(ania);
            map.put(ania.getName(), people );
        }

    }

}
