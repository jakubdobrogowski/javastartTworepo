package pl.sda.javastartTwo.concurrency;

import com.google.common.collect.Lists;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadsExample {

   // Wszystko co się w run() znajduje zostanie wykonane po uruchomieniu wątku,
    // do którego przekażemy obiekt klasy gdzie nadpisaliśmy run

    public static void main(String[] args) {

         runnableBasics();
        //bank();
        //  bankWithThreads();
        //bankWithExecutors();
    }

    private static void bankWithExecutors() {

        ExecutorService executorService = Executors.newFixedThreadPool(4);

        List<BankClientAction> actions = Lists.newArrayList();

        for (int i = 0; i < 1000; i++) {

            actions.add(new BankClientAction());
        }

        Instant now = Instant.now();
        for (BankClientAction action : actions) {

            executorService.submit(action);
        }

        //trzeba jeszcze pozekac na watki
        System.out.println("Ilość operacji: " + Bank.operations);
        System.out.println(Duration.between(now, Instant.now()).getNano());
    }

    private static void bankWithThreads() {

        List<BankClientAction> actions = Lists.newArrayList();

        for (int i = 0; i < 1000; i++) {

            actions.add(new BankClientAction());
        }

        ArrayList<Thread> threads = Lists.newArrayList(); // mamy teraz liste 1000 watkow
        for (BankClientAction action : actions) {

            threads.add(new Thread(action)); // tu co tu jest
        }


        Instant now = Instant.now();
        for (Thread thread : threads) {

            thread.start(); //tu sie odpala run()
        }

        for (Thread thread : threads) {

            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Ilość operacji: " + Bank.operations);
        System.out.println(Duration.between(now, Instant.now()).getNano());

    }


    private static void bank() {

        List<BankClientAction> actions = Lists.newArrayList();

        for (int i = 0; i < 1000; i++) {

            actions.add(new BankClientAction());
        }

        Instant now = Instant.now();
        for (BankClientAction action : actions) {

            action.run();
        }
        System.out.println(Duration.between(now, Instant.now()).getNano());

    }

    private static void runnableBasics() { // to z bankiem nie ma nic wspólnego

        Runnable runable = new Runnable() { //zagnieżdżona klasa anonimowa

            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()
                        + "Anonimowa klasa zagniedzona");
            }
        };


        Runnable lambdaRunable = () -> System.out.println(Thread.currentThread().getName() + "Lambda");

        Runnable ourRunable = new OurRunable();

        //odpalenie zadan w osobnych watkach
        Thread thread1 = new Thread(runable);
        Thread thread2 = new Thread(lambdaRunable);
        Thread thread3 = new Thread(ourRunable);
        thread1.start();
        thread2.start();
        thread3.start();

        //odpalenie bez osobnych watkow
        lambdaRunable.run();

    }
}
