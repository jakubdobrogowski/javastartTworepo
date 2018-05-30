package pl.sda.javastartTwo.homeWork.kolekcje;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ArrayToListplusPodnaKolejność {


    public static List<String> withoutDuplicatsWitMyOrder(String[] array, int x) {

        LinkedList<String> animalsList = new LinkedList<>();
        for (String element : array) {

            element = element.trim();
            if (animalsList.indexOf(element) == -1) {

                animalsList.add(element.trim());
            }

        }
        if (x == 1) {

            animalsList.sort(Comparator.naturalOrder());
        } else if (x == 2) {

            animalsList.sort(Comparator.reverseOrder());
        } else {

            System.out.println("Nie podana kolejność");
        }

        return animalsList;

    }
}
