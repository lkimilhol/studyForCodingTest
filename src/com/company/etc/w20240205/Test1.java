package com.company.etc.w20240205;

public class Test1 {
    public int solution(int money, String expected, String actual) {
        int length = expected.length();
        int batting = 100;

        for (int i = 0; i < length; i++) {
            if (expected.charAt(i) == actual.charAt(i)) {
                money += batting;
                batting = 100;
                continue;
            }

            money -= batting;

            if (money == 0) {
                return 0;
            }

            batting *= 2;

            if (money < batting) {
                batting = money;
            }
        }

        return money;
    }
}
