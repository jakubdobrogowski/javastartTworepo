package pl.sda.javastartTwo.colections;

import pl.sda.javastartTwo.colections.Book;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListVsSet {

    public static void main(String[] args) {

        removeAllCompare();
    }

    private static void removeAllCompare() {

        // setRemoveList();
        // listRemoveset();
        checkIfColectContains();
    }

    private static void checkIfColectContains() {
        Set<Book> booksSet = new HashSet<>();

        int howManyBooks = 500_000;
        for (int i = 0; i < howManyBooks; i++) {

            booksSet.add(new Book(i));
        }

        List<Book> bookList = new ArrayList<>();

        for (int i = 0; i < howManyBooks + 1; i++) {

            bookList.add(new Book(i));
        }

        long start = System.currentTimeMillis();

        bookList.contains(new Book(howManyBooks));

        long stop = System.currentTimeMillis();


        long start1 = System.currentTimeMillis();

        booksSet.contains(new Book(howManyBooks));

        long stop1 = System.currentTimeMillis();

        System.out.println("Czas trwania List: " + (stop-start) + " ms");
        System.out.println("Czas trwania Set: " + (stop1-start1) + " ms");
    }

    private static void listRemoveset() {

        Set<Book> booksSet = new HashSet<>();

        int howManyBooks = 500_000;
        for (int i = 0; i < howManyBooks; i++) {

            booksSet.add(new Book(i));
        }

        List<Book> bookList = new ArrayList<>();

        for (int i = 0; i < howManyBooks + 1; i++) {

            bookList.add(new Book(i));
        }

        long start = System.currentTimeMillis();
        bookList.removeAll(booksSet);
        long stop = System.currentTimeMillis();

        System.out.println("Czas trwania: " + (stop-start) + " ms");
    }

    private static void setRemoveList() {
        Set<Book> booksSet = new HashSet<>();

        int howManyBooks = 500_000;
        for (int i = 0; i < howManyBooks; i++) {

            booksSet.add(new Book(i));
        }

        List<Book> bookList = new ArrayList<>();

        for (int i = 0; i < howManyBooks + 1; i++) {

            bookList.add(new Book(i));
        }

        long start = System.currentTimeMillis();
        booksSet.removeAll(bookList);
        long stop = System.currentTimeMillis();

        System.out.println("Czas trwania: " + (stop-start) + " ms");
    }

}
