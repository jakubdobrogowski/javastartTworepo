package pl.sda.javastartTwo.homeWork.kolekcje;

//Napisz metodÍ przetwarzajĻcĻ podanĻ tablicÍ animals na set z zachowaniem kolejnoúci elementůw
// z oryginalnej tablicy + naleŅy zapewniś poprawne wyelimowanie duplikatůw (" dog" "dog")

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;


public class ArrayToSet {

    public static Set<String> arrayToLinkedHashSet(String[] array) {

        Set<String> animlsSet = new LinkedHashSet<>();

        for (String element : array) {

            animlsSet.add(element.trim());
        }
        return animlsSet;
    }

    public static Set<String> arrayToLinkedHashSet1(String[] array) {
        Set<String> resoult = new LinkedHashSet<>();

        for (String element : array) {

            if (StringUtils.isBlank(element)) {

                continue;
            }
            resoult.add(element);
        }
        return resoult;
    }

    public static Set<String> arrayToLinkedHashSet2(String[] array) {
        Set<String> animlsSet = new LinkedHashSet<>();

        Arrays.stream(array).forEach(e -> animlsSet.add(e.trim()));

        LinkedHashSet<String> animlsSetFilter = animlsSet.stream()
                .filter(e -> !e.equals(""))
                .collect(Collectors.toCollection(LinkedHashSet::new));

        return animlsSetFilter;
    }

    public static LinkedHashSet<String> arrayToLinkedHashSet3(String[] array) { //to najlepsze

        return Arrays.stream(array)
                .filter(e -> !StringUtils.isAllBlank(e))
                .map(e -> e.trim())
                .collect(Collectors.toCollection(() -> new LinkedHashSet<String>()));
    }

}
