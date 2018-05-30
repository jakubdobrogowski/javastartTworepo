package pl.sda.javastartTwo.homeWork.generyki;

import pl.sda.javastartTwo.generic1.Apple;
import pl.sda.javastartTwo.generic1.Orange;
import pl.sda.javastartTwo.generic2.GenericsFruitBox;

public class PairMain {

    public static void main(String[] args) {

        GenericsFruitBox<Apple> appleGenericsFruitBox = new GenericsFruitBox<>(new Apple());
        GenericsFruitBox<Orange> orangeGenericsFruitBox = new GenericsFruitBox<>(new Orange());

        Pair<GenericsFruitBox<Apple>, GenericsFruitBox<Orange>> genericsFruitBoxGenericsFruitBoxPair =
                new Pair<>(appleGenericsFruitBox, orangeGenericsFruitBox);

        Pair<GenericsFruitBox<Apple>, GenericsFruitBox<Apple>> genericsFruitBoxGenericsFruitBoxPair1 =
                new Pair<>(appleGenericsFruitBox, appleGenericsFruitBox);

        System.out.println(genericsFruitBoxGenericsFruitBoxPair.equalsFirstSecond(orangeGenericsFruitBox));

        System.out.println(genericsFruitBoxGenericsFruitBoxPair1.equalsFirstSecond(appleGenericsFruitBox));

        System.out.println(genericsFruitBoxGenericsFruitBoxPair.equalsFS(genericsFruitBoxGenericsFruitBoxPair1));


    }
}
