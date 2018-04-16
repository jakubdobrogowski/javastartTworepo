package pl.sda.javastartTwo;

import java.util.Objects;

public class Person implements Comparable<Person> {

    private Integer pesel;
    private String name;

    public Person(Integer pesel, String name) {
        this.pesel = pesel;
        this.name = name;
    }

    public String getName() {
        return name;
    }



    @Override
    public int compareTo(Person o) {
        return pesel.compareTo(o.getPesel());
    }

    public Integer getPesel() {
        return pesel;
    }

    @Override
    public String toString() {
        return "Person{" +
                "pesel=" + pesel +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(pesel, person.pesel);
    }

    @Override
    public int hashCode() {

        return Objects.hash(pesel);
    }

}
