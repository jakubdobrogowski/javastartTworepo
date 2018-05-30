package pl.sda.javastartTwo.files;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;


public class SaveAndRead {


    public static void main(String[] args) throws IOException {

        reading();
        savefile();
    }

    private static void savefile() throws FileNotFoundException {

        PrintWriter out = new PrintWriter("//Users//jakubdobrogowski//Desktop//mojplik.txt");
        out.println("Ala ma , a kot ma Alę");
        out.close();
    }

    private static void reading() throws IOException {

        Scanner in = new Scanner(Paths.get("//Users//jakubdobrogowski//Desktop//mojplik.txt"));
        String zdanie = in.nextLine();
        System.out.println(zdanie);

    }


}


