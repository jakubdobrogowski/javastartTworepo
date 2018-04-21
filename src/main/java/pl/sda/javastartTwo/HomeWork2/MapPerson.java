package pl.sda.javastartTwo.HomeWork2;

import java.util.HashMap;

public class MapPerson {

    public static HashMap<Integer, Person> mapId(Person[] array){

        HashMap<Integer, Person> peopleById = new HashMap<>();

        for (Person person :array) {

            peopleById.put(person.getId(), person);
        }
        return peopleById;
    }
}
