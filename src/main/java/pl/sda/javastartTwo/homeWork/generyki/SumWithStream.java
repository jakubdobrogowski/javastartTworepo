package pl.sda.javastartTwo.homeWork.generyki;

import java.util.List;

public class SumWithStream {

    public static <T extends Number> double sumStream(List<T> list) {

        return list.stream().mapToDouble(e -> e.doubleValue()).sum();
    }
}
