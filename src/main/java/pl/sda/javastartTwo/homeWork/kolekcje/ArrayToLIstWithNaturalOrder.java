package pl.sda.javastartTwo.homeWork.kolekcje;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayToLIstWithNaturalOrder {

    public static List<String> changerWithNaturalOrder(String[] array) {


        return Arrays.stream(array)
                .filter(e -> StringUtils.isAllBlank(e))
                .map(a -> a.trim())
                .sorted((a, b) -> a.compareTo(b)) //tak lub tak -> Collections.sort(listFilter);
                .collect(Collectors.toList());


    }
}
