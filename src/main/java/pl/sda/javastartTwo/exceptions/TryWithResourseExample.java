package pl.sda.javastartTwo.exceptions;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class TryWithResourseExample {


    private static final Logger LOGGER = Logger.getLogger(TryWithResourseExample.class.getSimpleName()); // tym napisem podpsuje logi

    static {
        try {
            LOGGER.addHandler(new FileHandler("/Users/jakubdobrogowski/Desktop/logs.txt"));
        } catch (IOException e) {

            System.out.println("Przykro mi");
        }
    }


    public static void main(String[] args) {

        tryWithResourseOldWay();
        tryWithResourseNewWay();
    }

    private static void tryWithResourseNewWay() {

        try (MyResourse myresourse = new MyResourse()) {

            myresourse.doSomeWork("Odczyt danych po nowemu");
        } catch (Exception e) {

            LOGGER.severe("odczyt danych po nowemu exeption");
        }

    }

    private static void tryWithResourseOldWay() {
        MyResourse myresourse = new MyResourse();

        try {

            myresourse.doSomeWork("Odczyt danych");

        } catch (Exception e) {

            System.out.println("Exeptions podczas zamykania polaczenia");

        } finally {

            try {

                myresourse.close();

            } catch (Exception e) {

                System.out.println("Exeptions podczas zamykania polaczenia");
            }
        }

        myresourse.close();

    }

}
