package com.nikolayrybakov.optiontwo;

import com.nikolayrybakov.optiontwo.model.Letter;
import java.util.HashMap;
import java.util.Map;

public class Util {
    public static Letter searchLetter(String str) {
        Map<Character, Integer> lettersMap = new HashMap<>();

        if (str.length() > 0) {
            char[] chars = str.toCharArray();
            char letter = chars[0];
            for (char c : chars) {
                if (!lettersMap.containsKey(c)) {
                    lettersMap.put(c, 1);
                    if (lettersMap.get(letter).equals(lettersMap.get(c))) {
                        letter = c;
                    }
                } else {
                    lettersMap.put(c, lettersMap.get(c) + 1);
                    if (lettersMap.get(c) >= lettersMap.get(letter)) {
                        letter = c;
                    }
                }
            }
            return new Letter(letter, lettersMap.get(letter));
        }
        return null;
    }
}
