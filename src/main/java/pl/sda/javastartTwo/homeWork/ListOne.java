package pl.sda.javastartTwo.homeWork;

import java.util.ArrayList;


public class ListOne {

    public static void main(String[] args) {

        ArrayList<Integer> firstList = new ArrayList<>();

        for (int i = 0; i < 19; i++) {
            firstList.add(i);
        }
        System.out.println(firstList);
        System.out.println(returnListTurn(firstList));
    }


    private static ArrayList<Integer> returnListTurn(ArrayList<Integer> firstList) {

        ArrayList<Integer> secondList = new ArrayList<>();
        for (int i = firstList.size() - 1; i >= 0; i--) {
            secondList.add(firstList.get(i));
        }
        return secondList;
    }
}