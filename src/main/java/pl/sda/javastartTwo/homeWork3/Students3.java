package pl.sda.javastartTwo.homeWork3;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.io.Files;
import lombok.Getter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

import static java.util.stream.Collectors.toList;

@Getter
public class Students3 {


    public static String FILEPATH = "/Users/jakubdobrogowski/Desktop/students.txt";
    private String nameAndSurName;
    private LocalDate dateOfBrith;
    private Integer index;
    private Integer[] grands;
    private static int COUNTER = 0;
    private static int COUNTER2 = 0;

    public Students3() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            List<String> lines = Files.readLines(Paths.get(FILEPATH).toFile(), Charset.forName("UNICODE"));
            for (int i = 0; i < lines.size(); i++) {
                if (COUNTER2 < lines.size()) {
                    if (COUNTER == COUNTER2) {

                        int x = 3;
                        String[] split = lines.get(COUNTER).split(",");
                        this.nameAndSurName = split[0].trim();
                        this.dateOfBrith = LocalDate.parse(split[1].trim(), formatter);
                        this.index = Integer.parseInt(split[2].trim());
                        Integer[] grands = new Integer[split.length - 3];
                        for (int j = 0; j < split.length - 3; j++) {
                            grands[j] = Integer.parseInt(split[x].trim());
                            x++;
                        }
                        this.grands = grands;
                        COUNTER++;
                    }
                } else {

                    this.nameAndSurName = "brak";
                    this.dateOfBrith = LocalDate.of(1, 1, 1);
                    this.index = 000;
                    this.grands = new Integer[]{0};
                }
            }
            COUNTER2++;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Map<Integer, List<Integer>> showGrands() {

        Map<Integer, List<Integer>> indexGrands = Maps.newHashMap();

        try {
            List<String> lines = Files.readLines(Paths.get(FILEPATH).toFile(), Charset.forName("UNICODE"));

            for (String line : lines) {

                String[] words = line.split(",");

                int index = Integer.parseInt(words[2].trim());
                int x = 3;
                ArrayList<Integer> grands = Lists.newArrayList();
                for (int j = 0; j < words.length - 3; j++) {

                    grands.add(Integer.parseInt(words[x].trim()));
                    x++;
                }

                indexGrands.put(index, grands);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return indexGrands;
    }


    public static Set<Integer> whoWillPass() {

        Map<Integer, Double> indexGrands = Maps.newHashMap();

        try {
            List<String> lines = Files.readLines(Paths.get(FILEPATH).toFile(), Charset.forName("UNICODE"));

            for (String line : lines) {

                String[] words = line.split(",");

                int index = Integer.parseInt(words[2].trim());
                Double sum = 0.0;
                int x = 3;
                ArrayList<Integer> grands = Lists.newArrayList();
                for (int j = 0; j < words.length - 3; j++) {

                    sum += Double.parseDouble(words[x].trim());
                    x++;
                }

                sum = sum / (words.length - 3);

                if (sum >= 3.0) {
                    indexGrands.put(index, sum);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return indexGrands.keySet();
    }

    public static List<Integer> indexRanking() {

        Map<Integer, Double> indexGrands = Maps.newHashMap();

        try {
            List<String> lines = Files.readLines(Paths.get(FILEPATH).toFile(), Charset.forName("UNICODE"));

            for (String line : lines) {

                String[] words = line.split(",");

                int index = Integer.parseInt(words[2].trim());
                Double sum = 0.0;
                int x = 3;
                ArrayList<Integer> grands = Lists.newArrayList();
                for (int j = 0; j < words.length - 3; j++) {

                    sum += Double.parseDouble(words[x].trim());
                    x++;
                }

                sum = sum / (words.length - 3);

                if (sum >= 3.0) {
                    indexGrands.put(index, sum);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return indexGrands.keySet().stream()
                .sorted(Integer::compareTo)
                .collect(toList());
    }


    public static Map<Integer, Integer> grandsStatic() {

        Map<Integer, Integer> stats = Maps.newHashMap();
        Set<Integer> grands = Sets.newHashSet();
        for (int i = 1; i <= 6; i++) {

            stats.put(i, 0);
        }

        try {
            List<String> lines = Files.readLines(Paths.get(FILEPATH).toFile(), Charset.forName("UNICODE"));

            for (String line : lines) {

                String[] split = line.split(",");
                int x = 3;
                for (int i = 0; i < split.length - 3; i++) {

                    grands.add(Integer.parseInt(split[x++].trim()));
                }

                for (int i = 1; i <= 6; i++) {
                    if (grands.contains(i)) {

                        Integer valuse = stats.get(i);
                        valuse++;
                        stats.put(i, valuse);
                    }
                }
                grands.removeAll(grands);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return stats;
    }

    public static void raport() {

        List<Students3> studentsList = StudentsMain.giveMeStudents();

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/Users/jakubdobrogowski/Desktop/text.txt"))) {

            for (Students3 students3 : studentsList) {

                bufferedWriter.write(students3.toString() + "\n");
            }

            bufferedWriter.write("Ranking najlepszych indeksów:\n");
            int i = 1;
            for (Integer index : Students3.indexRanking()) {
                bufferedWriter.write(i + ".  " + index + "\n");
                i++;
            }

            bufferedWriter.write("Statystyka ocen uzyskanych przez uczniów:\n" + Students3.grandsStatic().toString());


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return nameAndSurName + "\n" +
                "- dateOfBrith: " + dateOfBrith + "\n" +
                "- index: " + index + "\n" +
                "- grands: " + Arrays.toString(grands) + "\n";
    }

}
