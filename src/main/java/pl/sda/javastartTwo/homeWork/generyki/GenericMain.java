package pl.sda.javastartTwo.HomeWork.generyki;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GenericMain {

    public static void main(String[] args) {

        //genericMethodsShow();
        //methodsUsingSort();
        //sumNumbersExample();
        sumfiltrExample();
        sumStream();
    }

    private static void sumStream() {

        ArrayList<Double> doubleLIst = new ArrayList<>();

        doubleLIst.add(3.4);
        doubleLIst.add(6.3);
        doubleLIst.add(9.7);
        doubleLIst.add(2.1);
        doubleLIst.add(5.9);
    }

    private static void sumfiltrExample() {
        double f = 7.2;
        ArrayList<Double> doubleLIst = new ArrayList<>();

        doubleLIst.add(3.4);
        doubleLIst.add(6.3);
        doubleLIst.add(9.7);
        doubleLIst.add(2.1);
        doubleLIst.add(5.9);

        System.out.println(SumAndFiltrNumbers.sumAndFiltr(doubleLIst, f));
    }

    private static void sumNumbersExample() {
        List<Integer> numb = new LinkedList<>();
        numb.add(1);
        numb.add(2);
        numb.add(3);
        numb.add(4);
        numb.add(5);

        System.out.println(SumNumbersUsingGenericMethods.sumNumbers(numb));
    }

    private static void methodsUsingSort() {
        List<Integer> numb = new LinkedList<>();
        numb.add(1);
        numb.add(2);
        numb.add(3);
        numb.add(4);
        numb.add(5);
        ShowListWithSort.genericShowUsingSort(numb);
    }

    private static void genericMethodsShow() {
        LinkedList<String> words = new LinkedList<>();
        words.add("a");
        words.add("b");
        words.add("c");
        words.add("d");
        words.add("e");

        ArrayList<Double> numbers = new ArrayList<>();
        numbers.add(1.2);
        numbers.add(17.2);
        numbers.add(6.7);
        numbers.add(3.33);

        ShowLIstUsingGenericMethods.genericShow(words);
        ShowLIstUsingGenericMethods.genericShow(numbers);
    }
}
