package pl.sda.javastartTwo.homeWork2;

import com.google.common.collect.Lists;

import java.util.*;
import java.util.stream.Collectors;

public class MapSalaryCustomerList {

    public static Map<Double, List<Customer>> salaryMap(Customer[] array) {

        Map<Double, List<Customer>> doublePersonHashMap = new HashMap<>();

        for (Customer element : array) {

            if (doublePersonHashMap.containsKey(element.getSalary())) {

                List<Customer> peopleInMap = doublePersonHashMap.get(element.getSalary());
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

    public static Map<Double, List<Customer>> salaryMapwithStream(Customer[] array) {

       return Arrays.stream(array).collect(Collectors.groupingBy(e->e.getSalary()));
    }
}
