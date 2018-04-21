package pl.sda.javastartTwo.HomeWork2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class PersonSalary {


    public static Map<Double, Integer> statistic(Person[] array) {

        Map<Double, Integer> objectObjectHashMap = new HashMap<>();

        for (Person person : array) {

            if (objectObjectHashMap.containsKey((double) person.getSalary())) {

                Integer counter = objectObjectHashMap.get((double) person.getSalary()); //pobiera wartosc dla klucza
                objectObjectHashMap.put((double) person.getSalary(), counter + 1);

            } else {

                objectObjectHashMap.put((double) person.getSalary(), 1);
            }
        }
        return objectObjectHashMap;
    }

    public static Map<Double, Long> statistic1(Person[] array) {

        return Arrays.stream(array)
                .collect(Collectors.groupingBy(
                        e -> e.getSalary(),
                        Collectors.counting()
                ));
    }

}