package pl.sda.javastartTwo.homeWork2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapMapTwo {


    public static void main(String[] args) {

        Customer[] people = new Customer[]{
                new Customer("Anna", "Nowak", 33, "1200"),
                new Customer("Beata", "Kowalska", 22, "1200"),
                new Customer("Marek", " Nowak", 25, "1250"),
                new Customer("Adam", "Twardowski", 33, "1100"),
                new Customer("Monika  ", "Kos", 25, "2500"),
                new Customer("Adam", "Rudy", 45, "3333"),
                new Customer("Marek", "Rudy", 15, 2210),
                new Customer("Adam", " Madej", 15, 3333)
        };


        Map<String, Map<Double, Integer>> nameSalaryStats = MapMapTwo.nameSalaryStats();

        iterateOverMap(nameSalaryStats);
    }

    private static void iterateOverMap(Map<String, Map<Double, Integer>> nameSalaryStats) {

        for (String name : nameSalaryStats.keySet()) {

            System.out.println(name);
        }
        System.out.println("--------------------------------------");
        for (Map<Double, Integer> secondMap : nameSalaryStats.values()) {

            System.out.println(secondMap);
        }
        System.out.println("--------------------------------------");
        for (Map.Entry<String, Map<Double, Integer>> mapEntry : nameSalaryStats.entrySet()) {

            System.out.println(mapEntry);
        }
    }

    public static Map<String, Map<Double, Integer>> nameSalaryStats() {

        List<Customer> customers = giveMeCustomers();

        customers.stream().forEach(e -> e.setName(e.getName().trim()));

        Map<String, Map<Double, Integer>> resultPersonMapMap = new HashMap<>();

        for (Customer customer : customers) {

            if (resultPersonMapMap.containsKey(customer.getName())) {

                Map<Double, Integer> secondMap = resultPersonMapMap.get(customer.getName()); // wyciagamy wartosc

                if (secondMap.containsKey(customer.getSalary())) {

                    Integer counter = secondMap.get(customer.getSalary()); // znowu wyciagamy
                    secondMap.replace(customer.getSalary(), counter + 1);
                }else {

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

    public static List<Customer> giveMeCustomers() {
        Customer[] people = new Customer[]{

                new Customer("Anna", "Nowak", 33, "1200"),
                new Customer("Beata", "Kowalska", 22, "1200"),
                new Customer("Marek", " Nowak", 25, "1250"),
                new Customer("Adam", "Twardowski", 33, "1100"),
                new Customer("Monika  ", "Kos", 25, "2500"),
                new Customer("Adam", "Rudy", 45, "3333"),
                new Customer("Marek", "Rudy", 15, 2210),
                new Customer("Adam", "Madej", 15, 3333)
        };
        return Arrays.asList(people);
    }
}