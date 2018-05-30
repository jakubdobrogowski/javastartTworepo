package pl.sda.javastartTwo.HomeWork.generyki;

import java.util.List;

public class SumNumbersUsingGenericMethods {


    public static <T extends Number> double sumNumbers(List<T> list) {
        double sum=0;
        for (T element : list) {

            sum += element.intValue();
        }
        return sum;
    }

}
