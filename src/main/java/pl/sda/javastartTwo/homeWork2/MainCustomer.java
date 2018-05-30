package pl.sda.javastartTwo.homeWork2;

public class PersonMain {

    public static void main(String[] args) {

        Customer[] people = new Customer[]{
                new Customer( "Anna", "Nowak", 33, "1200"),
                new Customer( "Beata", "Kowalska", 22, "1200"),
                new Customer( "Marek", " Nowak", 25, "1250"),
                new Customer( "Adam", "Twardowski", 33, "1100"),
                new Customer( "Monika  ", "Kos", 25, "2500"),
                new Customer( "Adam", "Rudy", 45, "3333"),
                new Customer( "Marek", "Rudy", 15, 2210),
                new Customer( "Adam", " Madej", 15, 3333)
        };

        //System.out.println(people[2].getId());
        //System.out.println(ArrayToStringList.nameAndSurnameList(people));
        //System.out.println(MapPerson.mapId(people));
        //System.out.println(MapPersonSalary.salaryMap(people));
        System.out.println(PersonSalary.statistic(people));

      //  System.out.println( MapMapTwo.nameSalaryStats(people));

    }
}
