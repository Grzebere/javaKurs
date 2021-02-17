package javaAdvanced.advanced.zadania.kolekcje.zadania.zadanie1;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Thing");
        list.add("Thing2");
        list.add("Thing3");
        list.add("Thing2");
        System.out.println(list);
        list.set(1, "Op");
        System.out.println(list);
        System.out.println("Index of 2: " + list.indexOf("Thing"));
        System.out.println("Last Index od Thing2: " + list.lastIndexOf("Thing2"));
        list.remove("Thing3");
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        list.add("AAaa");
        list.add("AAaa");
        list.add("AAaa");
        System.out.println(list);
        System.out.println(removeDuplicates(list));
        System.out.println("__________");
        printDuplicates(list);


    }

    public static <E> void printDuplicates(List <E> list) {
        list.sort(null);
        int count = 0;
        for ( int i = 0; i < list.size(); i++ ) {
            count = 0;
            for ( int j = 0; j < list.size(); j++ ) {
                if (list.get(i).equals(list.get(j))) {
                    count++;
                    if (count > 1) {
                        System.out.println(list.get(i));
                        i = list.lastIndexOf(list.get(i));
                    }
                }
            }
        }
    }


    public static <E> List removeDuplicates(List<E> list) {
        List<E> list2 = new LinkedList<>();
        for ( int i = 0; i < list.size(); i++ ) {
            if (!list2.contains(list.get(i))) {
                list2.add(list.get(i));
            }
        }
        return list2;
    }
}
