package javaAdvanced.advanced.zadania.kolekcje.zadania.zadanie6;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class LetterIndex {


    public Map getLetterIndex(String text) {
        String[] textArray = text.split("(?!^)");
        Map<String, Set<Integer>> map = new HashMap();
        for ( String string : textArray ) {
            map.put(string, new TreeSet());
        }
        for ( int i = 0; i < textArray.length; i++ ) {
            Set<Integer> set = map.get(textArray[i]);
            set.add(i);
            map.put(textArray[i], set);
        }
        return map;
    }

    public void printMap(String string) {
        Map<String, Set<Integer>> mappers = getLetterIndex(string);
        System.out.print("[");
        for ( String letter : mappers.keySet() ) {

            System.out.print(letter + "->" + mappers.get(letter) + ", ");
        }
        System.out.println("]");


    }


}

