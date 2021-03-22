package com.nikolayrybakov.optionone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        searchLetter(reader.readLine());
    }

    public static void searchLetter(String str) {
        Map<Character, Integer> lettersMap = new HashMap<>();
        //проверяем размер входной строки
        if (str.length() > 0) {
            //преобразуем строку в массив символов
            char[] chars = str.toCharArray();
            char letter = chars[0];
            //заполняем map значениями и сразу присваеваем переменной letter
            //символ с максимальным кол-вом повторений
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
            System.out.println(letter + " " + lettersMap.get(letter));
        }
    }
}
