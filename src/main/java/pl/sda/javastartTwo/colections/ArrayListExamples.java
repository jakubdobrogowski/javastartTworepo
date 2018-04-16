package pl.sda.javastartTwo.colections;

import pl.sda.javastartTwo.Person;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayListExamples {

    public static void main(String[] args) {
        // basicListOperations();
        // doesContainAll();
        // sortList();
        // personList();

        legancyUseOfIterator();

    }

    private static void legancyUseOfIterator() {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");

        System.out.println(arrayList);

        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {

            Object next = iterator.next();
            System.out.println(next);
        }

        for (String s : arrayList) {

            System.out.println(s);
        }

        arrayList.stream()
                .forEach(e -> System.out.println(e));
    }

    private static void personList() {

        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person(123, "Ania"));
        people.add(new Person(122, "Tomek"));
        people.add(new Person(121, "Ola"));
        people.add(new Person(120, "Adam"));

        Collections.sort(people);
        System.out.println(people);

        System.out.println(people.stream()
                .sorted((a, b) -> a.getName().compareTo(b.getName()))
                .map(e -> e.getName())
                .collect(Collectors.joining(", ")));

        List<Integer> pesele = people.stream()
                .filter(a -> !a.getName().equals("Adam"))
                .sorted((a, b) -> a.getPesel().compareTo(b.getPesel()))
                .map(e -> e.getPesel())
                .collect(Collectors.toList());


        System.out.println(pesele);


    }

    private static void sortList() {

        ArrayList<Long> list = new ArrayList<>();
        list.add(1L);
        list.add(2L);
        list.add(3L);
        list.add(4L);
        list.add(3L);

        list.sort(Comparator.naturalOrder());
        //  list.sort(Comparator.reverse());
        Collections.sort(list);
        System.out.println(list);


    }

    private static void doesContainAll() {
        ArrayList<String> firstList = new ArrayList<>();
        firstList.add("1");
        firstList.add("2");
        firstList.add("3");

        ArrayList<String> secondList = new ArrayList<>();
        secondList.add("1");
        secondList.add("2");

        System.out.println(firstList.containsAll(secondList));

        secondList.add("3");

        System.out.println(firstList.containsAll(secondList));

        secondList.add("4");

        System.out.println(firstList.containsAll(secondList));

        System.out.println("Pierwsza lisata" + firstList);
        System.out.println("Druga lisata" + secondList);

        Collections.swap(firstList, 1, 2);

        System.out.println("Pierwsza lisata" + firstList);
        System.out.println("Druga lisata" + secondList);
    }


    private static void basicListOperations() {
        List<String> firstList = new ArrayList<>(); //interfejs //na start ma 10 miejsjc
        System.out.println("Is list empty?" + firstList.isEmpty());
        System.out.println("Size: " + firstList.size());
        firstList.add("java");
        firstList.add("c++");
        firstList.add("PERL");
        firstList.add("PYTHON");

        System.out.println(firstList.toString());
        System.out.println("Is list empty?" + firstList.isEmpty());
        System.out.println("Size: " + firstList.size());
        System.out.println(firstList.get(3));
        System.out.println("Does contain PERL? " + firstList.contains("PERL"));
        firstList.add(1, "JAVASCRIPT");
        System.out.println("Is list empty?" + firstList.isEmpty());
        System.out.println("Size: " + firstList.size());
        System.out.println("After javascript added: " + firstList.toString());

        firstList.remove("java");
        System.out.println(firstList);

        for (String value : firstList) {
            System.out.println(value);
        }

        firstList.stream().forEach(e -> System.out.println(e));


        for (String value : firstList) {
            System.out.print(value + (firstList.indexOf(value) + 1 == firstList.size() ? "" : ","));
        }

        System.out.println();

        String colect = firstList.stream().collect(Collectors.joining(", "));
        System.out.println(colect);
    }

}
