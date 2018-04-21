package pl.sda.javastartTwo.HomeWork.generyki;

import java.util.List;

public class ShowLIstUsingGenericMethods {

    public static <T> void genericShow(List<T> firstList) {

        System.out.println(firstList);
    }
}
