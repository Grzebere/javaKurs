package javaAdvanced.advanced.zadania.threads.task3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        final RandomArray randomArray = new RandomArray(5);
        final RandomArray randomArray2 = new RandomArray();
        randomArray2.setRandomArray(Arrays.copyOf(randomArray.getRandomArray(), 10000));
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Arrays.sort(randomArray.getRandomArray());
                System.out.println("Thread 1 -" + Thread.currentThread().getId() + " is done");
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                randomArray2.sortArray();
                System.out.println("Thread 2 -" + Thread.currentThread().getId() + " is done");
            }
        });

        thread1.start();
        thread2.start();

        /*for ( int number: randomArray.getRandomArray()
               ) {
            System.out.println(number);

        }
        System.out.println();
        randomArray.sortArray();
        for ( int number: randomArray.getRandomArray()
        ) {
            System.out.println(number);
        }*/
    }
}
