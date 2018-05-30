package pl.sda.javastartTwo.homeWork2;

import java.util.HashMap;

public class MapNameCustomer {

    public static HashMap<Integer, Customer> mapId(Customer[] array){

        HashMap<Integer, Customer> peopleById = new HashMap<>();

        for (Customer person :array) {

            peopleById.put(person.getId(), person);
        }
        return peopleById;
    }
}
