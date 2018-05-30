package pl.sda.javastartTwo.homeWork2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapWithMap {


    public static void main(String[] args) {

        Map<String, Map<Double, Integer>> nameSalaryStats = MapWithMap.nameSalaryStats();

        iterateOverMap(nameSalaryStats);
    }

    private static void iterateOverMap(Map<String, Map<Double, Integer>> nameSalaryStats) { //iterowanie po mapie

        for (String name : nameSalaryStats.keySet()) {

            System.out.println(name);
        }
        System.out.println("--------------------------------------");
        for (Map<Double, Integer> secondMap : nameSalaryStats.values()) {

            System.out.println(secondMap);
        }
        System.out.println("--------------------------------------");
        for (Map.Entry<String, Map<Double, Integer>> mapEntry : nameSalaryStats.entrySet()) {
//Map.Entry - Entry to interfejs wewnętrzny
            System.out.println(mapEntry);
        }
    }

    public static Map<String, Map<Double, Integer>> nameSalaryStats() {

        List<Customer> customers = MainCustomer.giveMeCustomersList();

        customers.stream().forEach(e -> e.setName(e.getName().trim()));

        Map<String, Map<Double, Integer>> resultPersonMapMap = new HashMap<>();

        for (Customer customer : customers) {

            if (resultPersonMapMap.containsKey(customer.getName())) {

                Map<Double, Integer> secondMap = resultPersonMapMap.get(customer.getName()); // wyciagamy wartosc

                if (secondMap.containsKey(customer.getSalary())) {

                    Integer counter = secondMap.get(customer.getSalary()); // znowu wyciagamy
                    secondMap.replace(customer.getSalary(), counter + 1);
                } else {

                    secondMap.put(customer.getSalary(), 1);
                }
                //  resultPersonMapMap.put(customer.getName(), secondMap);

            } else {

                Map<Double, Integer> newMap = new HashMap<>();

                newMap.put(customer.getSalary(), 1);

                resultPersonMapMap.put(customer.getName(), newMap);
            }
        }
        return resultPersonMapMap;
    }


}
