package pl.sda.javastartTwo.colections;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList<Object> firstList = new LinkedList<>();

        for (int i = 0; i < 50000; i++) {

            firstList.add(i);
        }

        System.out.println(firstList.get(5));
    }
}
