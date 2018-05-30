package pl.sda.javastartTwo.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class CharacterStreams {

    private static String filePath = "/Users/jakubdobrogowski/Desktop/Pan.txt";

    public static void main(String[] args) {

        try {
            Reader reader = new FileReader(new File(filePath));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
