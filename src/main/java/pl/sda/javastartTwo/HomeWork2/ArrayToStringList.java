package pl.sda.javastartTwo.HomeWork2;

import com.google.common.collect.Lists;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayToStringList {

    public static List<String> nameAndSurnameList(Person [] array){

        //List<String> peopleList = new ArrayList<>();
        List<String> peopleList = Lists.newArrayList();

        for (Person person : array) {

           peopleList.add(person.getName().trim()+ " " +person.getSurName().trim());
        }

        return peopleList;
    }

    public static List<String> nameAndSurnameListwithStreams(Person [] array){

      return   Arrays.stream(array)
                .map(e->e.getName().trim()+ " " + e.getSurName().trim())
                .collect(Collectors.toList());

    }
}
