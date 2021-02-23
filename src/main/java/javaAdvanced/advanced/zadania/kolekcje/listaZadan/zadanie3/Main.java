package javaAdvanced.advanced.zadania.kolekcje.listaZadan.zadanie3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] table = getArrayOfNRandomIntegers(100, 50);
        System.out.println(getListOfUniqueNumbers(table));
        System.out.println(getListWithoutDuplicates(table));

    }

    public static int[] getArrayOfNRandomIntegers(int n, int bound){
        Random random = new Random();
        int[] array = new int[n];
        for ( int i = 0; i < array.length ; i++ ) {
            array[i] = random.nextInt(bound);
        }
        return array;
    }

    public static List getListWithoutDuplicates(int[] arrays){
        List<Integer> list = new ArrayList<>();
        for ( int number: arrays ) {
            if (!list.contains(number)){
                list.add(number);
            }
        }
        return list;
    }

    public static List getListOfUniqueNumbers(int[] arrays){
        List<Integer> list = new ArrayList<>();
        Arrays.sort(arrays);
        for ( int i = 0; i < arrays.length ; i++ ) {
            int count =0;
            for ( int j = 0; j < arrays.length ; j++ ) {
                if(arrays[i] == arrays[j]){
                    count++;
                }
            }
            if (count == 1){
                list.add(arrays[i]);
            }
        }
        return list;
    }





}
