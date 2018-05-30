package pl.sda.javastartTwo.concurrency;

public class Bank {

    private static int balance = 1000;
    public static int operations;

    public synchronized static void withDraw(int howMuch) { //synchronized

        balance = balance - howMuch;
        System.out.println( ( Thread.currentThread().getName() ) //nazwa wątku
                + "Stan konta po wypłacie klienta: " + balance);
    }

    public synchronized static void giveBack(int howMuch) {

        balance = balance + howMuch;
        System.out.println(Thread.currentThread().getName()
                + "Stan konta po wpłacie: " + balance);

        operations++;
    }
}
