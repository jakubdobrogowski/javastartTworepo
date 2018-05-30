package pl.sda.javastartTwo.homeWork.kolekcje;

//Napisz metodÍ przetwarzajĻcĻ podanĻ tablicÍ animals na listÍ elementůw pozbawionych bia≥ych znakůw
//(spacje, tabulatory) //1

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayToList {

    public static List<String> changer(String[] array) {

        List<String> list = new ArrayList<>();
        int i = 0;
        for (String element : array) {

            list.add(element.trim());
        }
        return list;
    }

    public static List<String> changerOne(String[] array) {

        for (int i = 0; i < array.length; i++) {

            array[i] = array[i].trim();
        }
        return Arrays.asList(array);
    }

    public static List<String> changerStream(String[] array) {

        List<String> list = new ArrayList<>();
        int i = 0;
        for (String element : array) {

            list.add(element.trim());

        }
        List<String> listFilter = list.stream()
                .filter(element -> !element.equals(""))
                .collect(Collectors.toList());

        return listFilter;
    }

    public static List<String> changerStream1(String[] array) {

        return Arrays.stream(array)
                .filter(e -> !StringUtils.isAllBlank(e))
                .map(a -> a.trim())
                .collect(Collectors.toList());
    }
}
