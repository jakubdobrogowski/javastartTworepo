package pl.sda.javastartTwo.homeWork3;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

public class StudentsMain {

    public static void main(String[] args) {


        //System.out.println(Students3.showGrands());
        //System.out.println(Students3.whoWillPass());
        //System.out.println(Students3.indexRanking());
       // System.out.println(Students3.grandsStatic());

        Students3.raport();

    }

    public static List<Students3> giveMeStudents() {
        Students3 students3 = new Students3();
        Students3 students31 = new Students3();
        Students3 students312 = new Students3();
        Students3 students313 = new Students3();

        ArrayList<Students3> students = Lists.newArrayList();

        students.add(students3);
        students.add(students31);
        students.add(students312);
        students.add(students313);

        return students;
    }
}

