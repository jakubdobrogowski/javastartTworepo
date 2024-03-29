package pl.sda.javastartTwo.homeWork2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SalaryStatic {


    public static Map<Double, Integer> slaryStats() {


        Map<Double, Integer> objectObjectHashMap = new HashMap<>();
        Customer[] array = MainCustomer.giveMeCustomers();
        for (Customer person : array) {

            if (objectObjectHashMap.containsKey(person.getSalary())) {

                Integer counter = objectObjectHashMap.get( person.getSalary()); //pobiera wartosc dla klucza
                objectObjectHashMap.put( person.getSalary(), counter + 1);

            } else {

                objectObjectHashMap.put( person.getSalary(), 1);
            }
        }
        return objectObjectHashMap;
    }

    public static Map<Double, Long> statisticWithStream(Customer[] array) {

        return Arrays.stream(array)
                .collect(Collectors.groupingBy(
                        e -> e.getSalary(),
                        Collectors.counting()
                ));
    }

}