package javaAdvanced.advanced.zadania.threads.task3;

import java.util.Arrays;
import java.util.Random;

public class RandomArray {

    private int[] randomArray;


    public RandomArray(int n) {
        this.randomArray = new int[n];
        Random random = new Random();
        for ( int i = 0; i < this.randomArray.length; i++ ) {
            randomArray[i] = random.nextInt();
        }
    }

    public RandomArray() {
    }

    public int[] getRandomArray() {
        return randomArray;
    }


    @Override
    public String toString() {
        return "RandomArray{" +
                "randomArray=" + Arrays.toString(randomArray) +
                '}';
    }


    public void setRandomArray(int[] randomArray) {
        this.randomArray = randomArray;
    }

    public void sortArray() {
        for ( int i = 0; i < randomArray.length; i++ ) {
            int j = i;
            int a = randomArray[i];
            while ((j > 0) && (randomArray[j - 1] > a)) {
                randomArray[j] = randomArray[j - 1];
                j--;
            }
            randomArray[j] = a;
        }
    }
}
