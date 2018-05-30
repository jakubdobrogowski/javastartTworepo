package pl.sda.javastartTwo.FileOperations;

import com.google.common.collect.Lists;
import com.google.common.io.Files;
import org.apache.commons.lang3.StringUtils;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileOperations {

    private static String filePath = "/Users/jakubdobrogowski/Desktop/Pan.txt";

    public static void main(String[] args) {

        //  rewriteFilesFromOneToAnotherNewWay();
        //  readFileWithBuferReder();

        countWords();
        //splitLine();

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

    private static void countWords() {

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

    private static void readFileWithBuferReder() {

        try (FileReader fileReader = new FileReader(filePath);) {  // ten nowy myk co zamyka
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {  //od razu czytamy i przypisujemy muis tu byc

                System.out.println(line);
            }
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void rewriteFilesFromOneToAnotherNewWay() {
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
