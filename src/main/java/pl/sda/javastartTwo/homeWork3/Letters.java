package pl.sda.javastartTwo.homeWork3;

/*Napisz funkcjÍ changeCase, ktůra przyjmuje jako parametr obiekt typu String i zwraca
  jego kopiÍ po zamianie wielkoúci liter (czyli te, ktůre by≥y ma≥e stanĻ siÍ duŅe
  i odwrotnie).*/


import com.google.common.collect.Lists;
import com.google.common.primitives.Chars;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Letters {

    public static void main(String[] args) {
        String word = "AAAbbb iii6 ";
        //System.out.println(changeCase(word));
        changeCaseWithStream(word);
    }

    private static StringBuilder changeCase(String word) {

        List<String> litters = Lists.newArrayList();
        int x = 1;
        for (int i = 0; i < word.toCharArray().length; i++) {

            litters.add(word.substring(i, x++));
        }
        for (int i = 0; i < litters.size(); i++) {

            if (litters.get(i).matches("[A-Z]")) {

                int k = litters.indexOf(litters.get(i));
                String y = litters.get(i).toLowerCase();
                litters.remove(k);
                litters.add(k, y);

            } else {

                int k = litters.indexOf(litters.get(i));
                String y = litters.get(i).toUpperCase();
                litters.remove(k);
                litters.add(k, y);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();

        for (String litter : litters) {

            stringBuilder.append(litter);
        }

        return stringBuilder;
    }

    public static void changeCaseWithStream(String word) {

        List<Character> charsList = Chars.asList(word.toCharArray());

        String collect = charsList.stream()
                .map(e -> {
                    if (StringUtils.isAllUpperCase(e.toString())) {

                        return e.toString().toLowerCase();
                    } else {

                        return e.toString().toUpperCase();
                    }
                }).collect(Collectors.joining());

        System.out.println(collect);
    }


}


