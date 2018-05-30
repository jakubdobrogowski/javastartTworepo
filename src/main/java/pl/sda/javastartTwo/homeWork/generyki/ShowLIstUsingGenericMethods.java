package pl.sda.javastartTwo.homeWork.generyki;

import java.util.List;

public class ShowLIstUsingGenericMethods {

    public static <T> void genericShow(List<T> firstList) {

        System.out.println(firstList);
    }
}
