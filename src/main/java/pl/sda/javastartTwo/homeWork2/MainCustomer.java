package pl.sda.javastartTwo.homeWork2;

import java.util.Arrays;
import java.util.List;

public class MainCustomer {

    public static void main(String[] args) {

        Customer[] customers = giveMeCustomers();

        //System.out.println(ArrayToStringList.nameAndSurnameList(customers));
        //System.out.println(MapNameCustomer.mapId(customers));
        //System.out.println(MapSalaryCustomerList.salaryMap(customers));
        System.out.println(SalaryStatic.slaryStats());
        //System.out.println( MapWithMap.nameSalaryStats(customers));

    }

    static Customer[] giveMeCustomers() {

        return new Customer[]{
                new Customer("Anna", "Nowak", 33, "1200"),
                new Customer("Beata", "Kowalska", 22, "1200"),
                new Customer("Marek", " Nowak", 25, "1250"),
                new Customer("Adam", "Twardowski", 33, "1100"),
                new Customer("Monika  ", "Kos", 25, "2500"),
                new Customer("Adam", "Rudy", 45, "3333"),
                new Customer("Marek", "Rudy", 15, 2210),
                new Customer("Adam", " Madej", 15, 3333)
        };
    }

    public static List<Customer> giveMeCustomersList() {

        Customer[] customers = new Customer[]{
                new Customer("Anna", "Nowak", 33, "1200"),
                new Customer("Beata", "Kowalska", 22, "1200"),
                new Customer("Marek", " Nowak", 25, "1250"),
                new Customer("Adam", "Twardowski", 33, "1100"),
                new Customer("Monika  ", "Kos", 25, "2500"),
                new Customer("Adam", "Rudy", 45, "3333"),
                new Customer("Marek", "Rudy", 15, 2210),
                new Customer("Adam", " Madej", 15, 3333)
        };
        return Arrays.asList(customers);
    }
}
