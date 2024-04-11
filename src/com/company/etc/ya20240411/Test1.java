package com.company.etc.ya20240411;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static List<Integer> frequency(String s) {
        List<String> temp = new ArrayList<>();
        String[] stringArray = new String[s.length()];

        for (int i = 0; i < s.length(); i++) {
            stringArray[i] = String.valueOf(s.charAt(i));
        }

        for (int i = 0; i < stringArray.length; i++) {
            String text = stringArray[i];

            if (text.equals(")")) {
                continue;
            }

            if (text.equals("#")) {
                String s2 = temp.remove( temp.size() - 1);
                String s1 = temp.remove( temp.size() - 1);

                temp.add(s1 + s2);

                continue;
            }

            if (text.equals("(")) {
                String repeat = "";
                for (int j = i + 1 ; j < s.length(); j++) {
                    if (stringArray[j].equals(")")) {
                        i++;
                        break;
                    }
                    repeat += stringArray[j];
                    i++;
                }

                int repeatCount = Integer.parseInt(repeat);
                String lastString = temp.remove(temp.size() - 1);

                for (int j = 0; j < repeatCount; j++) {
                    temp.add(lastString);
                }

                continue;
            }

            temp.add(text);
        }

        temp.stream().forEach(System.out::println);

        int[] intArray = new int[26];

        for (String tempString : temp) {
            int index = Integer.parseInt(tempString) - 1;

            intArray[index] = intArray[index] + 1;
        }

        List<Integer> result = new ArrayList<>();

        for (int i : intArray) {
            result.add(i);
        }

        return result;
    }
}
