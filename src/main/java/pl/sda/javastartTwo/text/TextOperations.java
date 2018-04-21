package pl.sda.javastartTwo.text;

import org.apache.commons.lang3.StringUtils;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

public class TextOperations {

    public static void main(String[] args) {

     //   classicConcat("abc", 150_000);
      //  BuilderConcat("text", 150_000);
        String world = "element";
        String world1 = "\"tmeenel\" ";
        anagramChecker(world, world1);
        palindromCheckr("kajak");
    }

    private static void palindromCheckr(String word) {

        System.out.println( word.equals(new StringBuilder( word).reverse().toString()) );
    }

    private static void anagramChecker(String w, String w1) {

        w = w.replaceAll("\\W", "").toLowerCase();
        w1 = w1.replaceAll("\\W", "").toLowerCase();

        char[] chars = w.toCharArray();
        char[] chars1 = w1.toCharArray();

        Arrays.sort(chars);
        Arrays.sort(chars1);

        boolean result = Arrays.equals(chars, chars1);
        System.out.println(result);
    }

    private static void BuilderConcat(String text, int itearations) {

        Instant start = Instant.now();
        StringBuilder stringBuilder = new StringBuilder(); // string bufer - odporny na wielowątkowość

        for (int i = 0; i < itearations; i++) {


            stringBuilder.append(i);
        }
        System.out.println(Duration.between(start, Instant.now()));

    }

    private static void classicConcat(String text, int itearations) {

        Instant start = Instant.now();

        String resoult = "";

        for (int i = 0; i < itearations; i++) {

            resoult = resoult + text;
        }
        System.out.println(Duration.between(start, Instant.now()));
    }

}
