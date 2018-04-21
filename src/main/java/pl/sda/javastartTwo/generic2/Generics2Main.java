package pl.sda.javastartTwo.generic2;

import pl.sda.javastartTwo.PersonOne;
import pl.sda.javastartTwo.generic1.Apple;
import pl.sda.javastartTwo.generic1.Orange;

import java.util.List;

public class Generics2Main {

    public static void main(String[] args) {

        firstGenericExample();
        secondGenericExample();
        utilsExamples();
    }

    private static void utilsExamples() {
        Long[] longsArray = {1L, 2L};
        List list = GenericsUtils.fromArrayToList(longsArray); //podczas konwersji tracimy typ

        Object o = list.get(0); // nienajlepiej

        List<Long> longs = GenericsUtils.fromArrayToListWithGenerics(longsArray);

        PersonOne[] people = new PersonOne[]{new PersonOne(123, "Ania")};
        List<Integer> integers = GenericsUtils.formArrayToList(people, e -> e.getPesel());
    }

    private static void secondGenericExample() {

        GenericFruitBoxWithExtends<Orange> orangeGenericFruitBoxWithExtends =
                new GenericFruitBoxWithExtends<>(new Orange());

        // GenericFruitBoxWithExtends<T> tGenericFruitBoxWithExtends =      tak nie przejdzie
        //     new GenericFruitBoxWithExtends<>(new PersonOne(123,"Ania"));
    }

    private static void firstGenericExample() {
        GenericsFruitBox<Orange> orangeGenericsFruitBox = new GenericsFruitBox<>(new Orange());

        Orange value = orangeGenericsFruitBox.getValue();

        value.introduceYourSelfe();

        GenericsFruitBox<Apple> appleGenericsFruitBox = new GenericsFruitBox<>(new Apple());

        Apple value1 = appleGenericsFruitBox.getValue();
        value1.introduceYourSelfe();

        GenericsFruitBox<PersonOne> personGenericsFruitBox = new GenericsFruitBox<>(new PersonOne(123, "Ania"));

        //  personGenericFruitBox.getValue().introduceYourself();
    }
}
