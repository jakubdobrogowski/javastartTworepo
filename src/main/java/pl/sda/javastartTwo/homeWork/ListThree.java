package pl.sda.javastartTwo.homeWork;

import java.util.ArrayList;

public class ListThree {

    public static void main(String[] args) {

        System.out.println(sumElementFromList());
    }

    private static int sumElementFromList() {
        ArrayList<Integer> numbers = new ArrayList<>();
        int sum=0;
        for (int i = 0; i < 50000; i++) {

            numbers.add(i);
        }

        for (int i = 0; i < numbers.size(); i++) {

             sum += numbers.get(i);
        }
        return sum;
    }

}
