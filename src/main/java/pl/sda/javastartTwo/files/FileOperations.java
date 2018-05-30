package pl.sda.javastartTwo.files;

import com.google.common.collect.Lists;
import com.google.common.io.Files;
import org.apache.commons.lang3.StringUtils;

import java.io.*;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FileOperations {

    private static String filePath = "/Users/jakubdobrogowski/Desktop/Pan.txt";
    private static String filePath2 = "/Users/jakubdobrogowski/Desktop/text.txt";

    public static void main(String[] args) {

        //  rewriteFilesFromOneToAnotherNewWay();

        //  readFileWithBuferReder();
        //   readFileWithBufferedREaderWithTryWithResources();

        //countWords();
        //splitLine();
        // writeSthToFile();
        readfromFile();
        //readSthFromFile();
        //readSthFromFileWithResources();
        //writeSthToFileWithResources();
        //rewrite();

        //readWithReader();

    }


    private static void readWithReader() {


        String s = "Hello World";
        Reader reader = new StringReader(s);

        char cbuf[] = new char[5];

        try {

            System.out.println("" + reader.read(cbuf, 0, 5));


            System.out.println(cbuf);


            reader.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }


    private static void rewrite() {

        try (
                BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath2));
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath2.replace("litwo.txt", "litwo_kopia.txt")))
        ) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {

                bufferedWriter.write(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeSthToFileWithResources() {

        String word = "jebac pochcia maczetami xddd";

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath2))) {

            bufferedWriter.write(word);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readSthFromFileWithResources() {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath2))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readSthFromFile() {

        //  BuferReader klasa dzieki której mozemy czytac linijka po linijce

        BufferedReader fileReader = null;
        try {
            fileReader = new BufferedReader(new FileReader(filePath2));
            String line;

            while ((line = fileReader.readLine()) != null) { //readLine zwraca null jeśli w pilku nie ma więcej danych
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            if (fileReader != null) {

                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void readfromFile() {

        try (FileReader fileReader = new FileReader(filePath2)) {

            int read = fileReader.read();
            char[] cbuf = new char[read];
            fileReader.read(cbuf);

            System.out.println(read);
            System.out.println(cbuf);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeSthToFile() {

        FileWriter fileWriter = null;
        int number = 1234567;
        try {

            fileWriter = new FileWriter(filePath2);
            fileWriter.write(Integer.toString(number));
        } catch (IOException e) {

            e.printStackTrace();
        } finally {

            if (fileWriter != null) {
                try {

                    fileWriter.close();
                } catch (IOException e) {

                    e.printStackTrace();
                }
            }
        }
    }

    private static void splitLine() {

        String invocation = " Litwo! ojczyzno moja ty jesteś jak zdrowiwe";

        String[] splitBySpacebar = invocation.split(" ");
        System.out.println(Arrays.toString(splitBySpacebar));

        String[] splitBySpacebar1 = invocation.split("\\s+");
        System.out.println(Arrays.toString(splitBySpacebar1));

        String[] splitByNonWords = invocation.split("[^\\p{L}]+"); //polskie znaki
        System.out.println(Arrays.toString(splitByNonWords));


    }

    private static void countWords() { //NIO

        try {
            List<String> words = Lists.newArrayList();
            List<String> lines = Files.readLines(Paths.get(filePath).toFile(), Charset.forName("UNICODE"));

            for (String line : lines) {
                if (StringUtils.isBlank(line)) {
                    continue;
                }
                words.addAll(Arrays.asList(line.split("[^\\p{L}]+")));
            }

            Map<String, Long> wordCountMap = words
                    .stream()
                    .filter(e -> StringUtils.isNotBlank(e))
                    .collect(Collectors.groupingBy(

                            e -> e,
                            Collectors.counting()
                    ));

            System.out.println(wordCountMap);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readFileWithBufferedREaderWithTryWithResources() {

        try (FileReader fileReader = new FileReader(filePath);) {
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readFileWithBufferedREader() { //u góry jest przykład z try with resources
        FileReader fileReader = null;
        try {

            fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader); //odczytujemy linijka po linijce

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    private static void rewriteFilesFromOneToAnotherNewWay() { //binarnie
        try (
                FileInputStream fileInputStream =
                        new FileInputStream(filePath);

                FileOutputStream fileOutputStream =
                        new FileOutputStream(filePath.replace("Pan.txt", "Pan_kopia.txt"));
        ) {

            int b;
            while ((b = fileInputStream.read()) != -1) {

                fileOutputStream.write(b);
            }
        } catch (IOException e) {

            e.printStackTrace();
        }
    }


}
