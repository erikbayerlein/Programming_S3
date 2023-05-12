package service_frequency;

import java.util.*;

public class FileWordFrequency {

    private Map<String, Integer> map = new HashMap<>();

    public void Freq (String str) {
        createMap(str);
        String[] words = str.split(" ");
        Integer total = words.length;

        for (int i = 0; i < total; i++) {
            if(map.containsKey(words[i])) { // if a word in the phrase is in the map, it will update the value, counting +1
                Integer val = map.get(words[i]);
                val++;
                map.put(words[i], val);
            }
        }

        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue()); // for each key, we print its value
        }
    }

    private void createMap (String str) {
        String[] words = str.split(" ");
        Integer total = words.length;

        for (int i = 0; i < total; i++) {
            if(!map.containsKey(words[i])) {
                map.put(words[i], 0); // add keys and values to the map
            }
        }
    }

}