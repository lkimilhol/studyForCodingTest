package com.company.programmers;

public class Joystick {
    public int solution(String name) {
        int front = diff(name, 0) + 1;
        int end = diff(name, 0) + 1;

        String[] check = initCheckString(name);

        for (int i = 1; i < name.length(); i++) {
            front += diff(name, i);
            check[i] = String.valueOf(name.charAt(i));

            if (joinEquals(check, name)) {
                break;
            }

            front++;
        }

        check = initCheckString(name);

        for (int i = name.length() - 1; i > 0; i--) {
            end += diff(name, i);
            check[i] = String.valueOf(name.charAt(i));

            if (joinEquals(check, name)) {
                break;
            }

            end++;
        }

        return Math.min(front, end);
    }

    private int diff(String name, int i) {
        char c = name.charAt(i);
        int a = c - 'A';
        int b = 'Z' - c + 1;

        return Math.min(a, b);
    }

    private String[] initCheckString(String name) {
        String[] split = "A".repeat(name.length()).split("");
        split[0] = String.valueOf(name.charAt(0));
        return split;
    }

    private boolean joinEquals(String[] check, String name) {
        return String.join("", check).equals(name);
    }
}
