package service_count;

import java.util.*;

public class FileCount {

    private Set set = new HashSet<>();

    public Integer Dif (String str) {
        String[] words = str.split(" ");
        Integer total = words.length;

        for (int i = 0; i < total; i++) {
            set.add(words[i]);
        }

        int dif = set.size();

        return dif;
    }

    public Integer Total (String str) {
        String[] words = str.split(" ");
        Integer total = words.length;

        return total;
    }

}