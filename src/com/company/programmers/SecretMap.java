package com.company.programmers;

public class SecretMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        String[] result1 = toBinary(arr1, n);
        String[] result2 = toBinary(arr2, n);

        for (int i = 0; i < n; i++) {
            String[] split1 = result1[i].split("");
            String[] split2 = result2[i].split("");

            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < split1.length; j++) {
                if (split1[j].equals("1") || split2[j].equals("1")) {
                    sb.append("#");
                    continue;
                }

                sb.append(" ");
            }

            answer[i] = sb.toString();
        }

        return answer;
    }

    private String[] toBinary(int[] arr, int n) {
        String[] result = new String[arr.length];

        String s = "%" + n + "s";

        for (int i = 0; i < arr.length; i++) {
            result[i] = String.format(s, Integer.toBinaryString(arr[i])).replace(" ", "0").trim();
        }

        return result;
    }
}
