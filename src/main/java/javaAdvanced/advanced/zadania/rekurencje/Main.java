package javaAdvanced.advanced.zadania.rekurencje;

public class Main {
    public static void main(String[] args) {
        System.out.println(silania(5));
        System.out.println(fibonacci(8));

    }

    public static int sumArray(int[] array) {
        return sumArray(array, array.length - 1);
    }

    private static int sumArray(int[] array, int current) {
        if (current > 0) {
            return array[current] + sumArray(array, current - 1);
        } else {
            return array[current];
        }
    }



    public static int silania(int a) {
        return ((a-1)!=0 ? a*silania(a-1) :a);
    }

    public static int fibonacci(int length) {
        if (length == 1) {
            return 1;
        } else if (length > 1)
            return fibonacci(length - 1) + fibonacci(length - 2);
        else {
            return 0;
        }
    }

}

//algorytm sortowania babelkowego (bubble sort)
