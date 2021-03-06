package javaAdvanced.advanced.zadania.threads.task4;

public class Main {
    public static void main(String[] args) {
        final BankAccount bankAccount = new BankAccount();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                bankAccount.withdrawMoney(100);
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                bankAccount.withdrawMoney(50);
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                bankAccount.depositMoney(400);
            }
        });
        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                bankAccount.depositMoney(50);
            }
        });

        thread3.start();
        thread4.start();
        thread2.start();
        thread1.start();




    }
}
