package pl.sda.javastartTwo.concurrency;

import java.util.concurrent.TimeUnit;

public class OurRunable implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()
                + "Specjalna nowa klasa");

        try {
            TimeUnit.SECONDS.sleep(1); //symulacja dlugiej operacji
            System.out.println(Thread.currentThread().getName()
                    + "Sknczyłem długą czynność");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
