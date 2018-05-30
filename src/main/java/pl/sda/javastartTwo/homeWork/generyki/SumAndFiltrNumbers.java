package pl.sda.javastartTwo.homeWork.generyki;

import java.util.List;

public class SumAndFiltrNumbers {

    public static <T extends Number> double sumAndFiltr(List<T> list, double filtr) {

        double sum = 0;

        for (T element : list) {

            if (element.doubleValue() > filtr) {

                sum += element.doubleValue();
            }

        }
        return sum;
    }

}
