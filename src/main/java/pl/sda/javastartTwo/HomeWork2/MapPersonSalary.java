package pl.sda.javastartTwo.HomeWork2;

import com.google.common.collect.Lists;
import pl.sda.javastartTwo.PersonOne;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class MapPersonSalary {

    public static HashMap<Double, List<Person>> salaryMap(Person[] array) {

        HashMap<Double, List<Person>> doublePersonHashMap = new HashMap<>();

        for (Person element : array) {

            if (doublePersonHashMap.containsKey(element.getSalary())) {

                List<Person> peopleInMap = doublePersonHashMap.get(element.getSalary());
                peopleInMap.add(element);

            } else {

                // List<Person> peopleInMap = new ArrayList<>();
                // peopleInMap.add(element);
                // doublePersonHashMap.put(element.getSalary(), peopleInMap);  to jest to samo

                doublePersonHashMap.put(element.getSalary(), Lists.newArrayList(element));
            }
        }
        return doublePersonHashMap;
    }

    public static Map<Double, List<Person>> salaryMapwithStream(Person[] array) {

       return Arrays.stream(array).collect(Collectors.groupingBy(e->e.getSalary()));
    }
}
