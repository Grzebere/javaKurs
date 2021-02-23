package javaAdvanced.advanced.zadania.kolekcje.zadania.zadanie5;

import java.util.*;

public class Counter {


    public Map countWordsAppearances(String text){
        String[] arrayOfWords= text.toLowerCase().replaceAll("[,.;]" , " ").split( "\\s+");
        Map<String, Integer> wordsMap = new HashMap();
        ValueComparator bvc = new ValueComparator(wordsMap);
        TreeMap<String, Integer> sortedMap = new TreeMap<String, Integer>(bvc);
        Set<String> wordsWithNoDuplicates= new HashSet();
        /*for ( String word: arrayOfWords) {
            wordsWithNoDuplicates.add(word);
        }
        for ( String word: wordsWithNoDuplicates ) {
            int count = 0;
            for ( String textElement: arrayOfWords ) {
                if (word.equals(textElement)){
                    count++;
                }
            }
            wordsMap.put(word, count);
        }*/

        for(String string : arrayOfWords){
            if(wordsMap.containsKey(string)){
                wordsMap.put(string , wordsMap.get(string) + 1);
            } else {
                wordsMap.put(string , 1);
            }
        }


        sortedMap.putAll(wordsMap);
        return sortedMap;
    }



}
