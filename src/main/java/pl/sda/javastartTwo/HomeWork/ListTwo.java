package pl.sda.javastartTwo.HomeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListTwo {

    public static void main(String[] args) {

        //System.out.println(pobierzLiczbeDontWork()); taka ciekawstka tu nie działą

        System.out.println(pobierzliczbe());
    }

    private static List<Integer> pobierzLiczbeDontWork() {
        Scanner input = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        System.out.println("Podaj liczby, podanie \"-1\" powoduje przerwanie: ");

        while(input.nextInt() != -1){

            System.out.print("Podaj liczbe: ");
            int wczytanaLiczba = input.nextInt();
            numbers.add(wczytanaLiczba);
        }

        return numbers;
    }


    private static List<Integer> pobierzliczbe() {
        List<Integer> mojaLista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("Podaj liczbe: ");
            int wczytanaLiczba = scanner.nextInt();
            if (wczytanaLiczba == -1) {
                return mojaLista;
            }
            mojaLista.add(wczytanaLiczba);
        }

    }

}
