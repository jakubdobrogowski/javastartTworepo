package pl.sda.javastartTwo.homeWork.kolekcje;

import java.util.Arrays;
import java.util.Scanner;

public class ColectionsMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] animals = new String[]{"cat", "dog ", "mouse", "rat", "pig",
                "rabbit", "hamster", " " + " ", "parrot", "cat", "", "dog", "cat", "     pig", "dog"};

        String[] animalsHard = new String[]{"cat", "dog ", "mouse", "rat", "pig", "rabbit", "hamster",
                " ", "parrot", "cat", "", "dog", "cat", "  pig", "dog", null, null};

        // System.out.println(ArrayToList.changer(animals));
        // sposob1(animals);
        // sposob2(animals);
        // System.out.println(ArrayToList.changerOne(animals));
        // System.out.println(ArrayToList.changerStream(animals));
        // System.out.println(Arrays.toString(animals));

        //System.out.println(ArrayToList.changerStream1(animalsHard));

        // System.out.println(ArrayToLIstWithNaturalOrder.changerWithNaturalOrder(animals));

        System.out.println(ArratToListWithoutDuplicats.withoutDuplicats(animals));
        System.out.println(ArratToListWithoutDuplicats.withoutDuplicats1(animalsHard));

        //  System.out.println("1-naturalna kolejność \n2-odwrócona kolejność: ");
        //   int kolejnosc = scanner.nextInt();
        //    System.out.println(ArrayToListplusPodnaKolejność.withoutDuplicatsWitMyOrder(animals, kolejnosc));

        //System.out.println(ArrayToSet.arrayToLinkedHashSet(animals));
        // System.out.println(ArrayToSet.arrayToLinkedHashSet2(animals));
        //System.out.println(ArrayToSet.arrayToLinkedHashSet3(animals));
        //System.out.println(ArrayToSet.arrayToLinkedHashSet3(animalsHard));
        //System.out.println(ArrayToSetWithSerch.stringSerch(animals, "cat"));


    }

    private static void sposob2(String[] animals) {
        for (String animal : animals) {

            animal = animal.trim();
        }

        System.out.println(Arrays.asList(animals));
    }

    private static void sposob1(String[] animals) {
        for (int i = 0; i < animals.length; i++) {

            animals[i] = animals[i].trim();
        }

        System.out.println(Arrays.toString(animals));
    }
}
