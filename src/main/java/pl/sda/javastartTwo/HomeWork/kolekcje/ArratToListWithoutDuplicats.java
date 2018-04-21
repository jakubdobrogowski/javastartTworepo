package pl.sda.javastartTwo.HomeWork.kolekcje;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ArratToListWithoutDuplicats {

    public static List<String> withoutDuplicats(String[] array) {

        LinkedList<String> result = new LinkedList<>();

        for (String element : array) {

            if (StringUtils.isBlank(element)) {

                continue;
            }
            if (result.indexOf(element.trim()) == -1)
                result.add(element.trim());
        }
        return result;

    }

    public static List<String> withoutDuplicats1(String[] array) {

        return Arrays.stream(array)
                .filter(e -> !StringUtils.isAllBlank(e))
                .map(e -> e.trim())
                .sorted((a, b) -> a.compareTo(b))
                .distinct()
                .collect(Collectors.toList());

    }
}