package javaAdvanced.advanced.zadania.threads.task4;

import lombok.Data;

@Data
public class BankAccount {
    private double money;

    public synchronized void withdrawMoney(double sum) {
        while (money < sum) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        money -= sum;
        System.out.println("Withdrawn " + sum + "   On the account:" + money);


    }

    public synchronized void depositMoney(double sum) {
        money += sum;
        System.out.println("Deposited " + sum + "   On the account:" + money);
        notifyAll();

    }
}
