package com.company.etc.i20240218;

public class Test1 {
    public int solution(int n) {
        // 현재 숫자 범위 내에 있는 숫자의 자릿수를 계산합니다.
        int digit = 1; // 초기 자릿수는 1부터 시작합니다.
        int count = 9; // 현재 자릿수에 해당하는 숫자의 개수 (1자리 숫자: 9개)

        // 현재 위치(position)가 숫자 범위 내에 있는지 확인하고, 자릿수를 계산합니다.
        while (n > count) {
            n -= count; // 현재 범위의 숫자 수를 빼줍니다.
            digit++; // 다음 자릿수로 이동합니다.
            count = (int)Math.pow(10, digit - 1) * 9 * digit; // 다음 자릿수에 해당하는 숫자의 개수를 계산합니다.
        }

        // 찾고자 하는 숫자가 속한 범위 내에서의 위치를 계산합니다.
        int numberIndex = (n - 1) / digit; // 해당 숫자가 속한 범위 내에서의 인덱스
        int number = (int)Math.pow(10, digit - 1) + numberIndex; // 해당 숫자가 시작하는 값에 인덱스를 더하여 숫자를 구합니다.

        // 해당 위치에 있는 숫자를 반환합니다.
        return Integer.parseInt(String.valueOf(String.valueOf(number).charAt((n - 1) % digit)));

    }
}
