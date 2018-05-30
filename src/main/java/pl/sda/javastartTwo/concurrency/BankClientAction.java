package pl.sda.javastartTwo.concurrency;

import java.util.Random;

public  class BankClientAction implements Runnable { //tu jest cała operacja pobierania ioddawania pieniedzy

    @Override
    public void run() { //musimy nadpisać run bo implementujemy runable

        Random random = new Random();

        int sum = random.nextInt(20);

        Bank.withDraw(sum);

        int threadSleepTime = random.nextInt(200);

        try {
            Thread.sleep(threadSleepTime); // przez tyle, watek bedzie nieaktywny
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Bank.giveBack(sum);
    }
}
