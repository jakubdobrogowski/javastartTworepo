package pl.sda.javastartTwo.colections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayLIstVsLinkedLIst {

    private static List<Integer> arrayList = new ArrayList<>(); //wazne static
    private static List<Integer> linkedList = new LinkedList<>();

    public static void main(String[] args) {
        arrayListCompareToLinkedList();

    }

    private static void arrayListCompareToLinkedList() {

        int howManyTimes = 50000;
        // addAtEnd(howManyTimes, arrayList);
        //addAtEnd(howManyTimes, linkedList);
        // addAtStart(howManyTimes, arrayList);
        //  addAtStart(howManyTimes, linkedList);
        // sumWithUsingForeach(howManyTimes,arrayList);
        //  sumWithUsingForeach(howManyTimes,linkedList);
        // sumWithUsingFor(howManyTimes,arrayList);
        //  sumWithUsingFor(howManyTimes,linkedList);

        sumUsingStreams(arrayList, linkedList);
    }

    private static void sumUsingStreams(List <Integer> arrayList, List <Integer> linkedList ) {
        long start = System.currentTimeMillis();

        arrayList.stream() //to jest tożsame z tym
                .mapToInt(e->e)
                .sum();

        arrayList.stream()
                .reduce((a,b)->a+b).get(); //optional w senise get

        linkedList.stream()
                .mapToInt(e->e)
                .sum();
        long stop = System.currentTimeMillis();

        System.out.println("Czas trwania " + ": " + (stop - start) + " ms");
    }

    private static void sumWithUsingFor(int howManyTimes, List <Integer> list){

        for (int i = 0; i < howManyTimes; i++) {

            list.add(i);
        }

        long start = System.currentTimeMillis();
        int sumElements=0;

        for (int i = 0; i < list.size(); i++) {

            sumElements += list.get(i);
        }

        long stop = System.currentTimeMillis();

        System.out.println("Czas trwania " + list.getClass().getSimpleName() + ": " + (stop - start) + " ms");

    }

    private static void sumWithUsingForeach(int howManyTimes, List <Integer> list) {

        for (int i = 0; i < howManyTimes; i++) {

            list.add(i);
        }

        long start = System.currentTimeMillis();
        int sumElements=0;

        for (Integer integer : list) {

            sumElements += integer;
        }

        long stop = System.currentTimeMillis();

        System.out.println("Czas trwania " + list.getClass().getSimpleName() + ": " + (stop - start) + " ms");
    }

    private static void addAtStart(int howManyTimes, List <Integer> list) {

        long start = System.currentTimeMillis();
        for (int i = 0; i < howManyTimes; i++) {

            list.add(0,i);
        }
        long stop = System.currentTimeMillis();

        System.out.println("Czas trwania " + list.getClass().getSimpleName() + ": " + (stop - start) + " ms");
    }

    private static void addAtEnd(int howManyTimes, List<Integer> list) {

        long start = System.currentTimeMillis();
        for (int i = 0; i < howManyTimes; i++) {

            list.add(i);
        }
        long stop = System.currentTimeMillis();

        System.out.println("Czas trwania " + list.getClass().getSimpleName() + ": " + (stop - start) + " ms");
    }

}
