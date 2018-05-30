package pl.sda.javastartTwo.HomeWork.kolekcje;

// Napisz metodÍ ktůra przyjmie tablicÍ i element po ktůrym bÍdziemy szukaś (String) i wewnĻtrz
// wykorzysta metodÍ //1 a nastÍpnie jako wynik zwrůci ile jest elementůw růwnych szukanemu elementowi

// Napisz metodÍ przetwarzajĻcĻ podanĻ tablicÍ animals na listÍ elementůw pozbawionych bia≥ych znakůw
// (spacje, tabulatory) //1

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayToSetWithSerch {

    public static int stringSerch(String[] array, String world) {


        List<String> list = new ArrayList<>();
        int i = 0;
        int counter = 0;
        int x = 0;
        for (String element : array) {

            list.add(element.trim());

        }

        List<String> listFilter = list.stream()
                .filter(element -> !element.equals(""))
                .collect(Collectors.toList());

        while (x < listFilter.size()) {
            if (listFilter.indexOf(world) != -1) {
                listFilter.remove(listFilter.indexOf(world));
                counter++;
            }
            x++;
        }
        return counter;
    }

    public static int stringSerch1(String[] array, String world) {

        int counter = 0;
        int x = 0;

        List<String> listFilter = Arrays.stream(array)
                .filter(e -> !StringUtils.isAllBlank(e))
                .map(a -> a.trim())
                .collect(Collectors.toList());

        while (x < listFilter.size()) {
            if (listFilter.indexOf(world) != -1) {
                listFilter.remove(listFilter.indexOf(world));
                counter++;
            }
            x++;
        }
        return counter;
    }
}
