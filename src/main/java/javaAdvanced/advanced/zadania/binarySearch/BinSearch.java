package javaAdvanced.advanced.zadania.binarySearch;

import java.util.Arrays;
import java.util.List;

public class BinSearch {
    public static void main(String[] args) {
        System.out.println(binSearchRe(Arrays.asList(1, 3, 5, 6, 7), 2));

    }

    public static int binSearch(List<Integer> list, int number) {
        int l = list.get(0);
        int r = list.get(list.size() - 1);
        int m;
        while (l <= r) {
            m = (l + r) / 2;
            if (list.get(m) < number) {
                l = m + 1;
            } else if (list.get(m) > number) {
                r = m - 1;
            } else {
                return list.get(m);
            }
        }
        return -1;
    }

    public static int binSearchRe(List<Integer> list, int number) {
        return binSearchRe(list, number, list.get(0), list.get(list.size() - 1));
    }


    private static int binSearchRe(List<Integer> list, int number, int l, int r) {
        int m ;
        while (l <= r) {
            m = (l + r) / 2;
            if (list.get(m) < number) {
                return binSearchRe(list, number, (m + 1), r);
            } else if (list.get(m) > number) {
                return binSearchRe(list, number, l, m - 1);
            } else {
                return list.get(m);
            }
        }
        return -1;
    }

}

