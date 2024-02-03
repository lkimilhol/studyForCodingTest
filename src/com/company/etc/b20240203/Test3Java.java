package com.company.etc.b20240203;

public class Test3Java {
    public int magicPair(int[] numbers) {
        final double mod = (Math.pow(10, 9) + 7);
        long count = 0;
        int[] reversedNumbers = new int[numbers.length];

        // Precompute the reverse of each number
        for (int i = 0; i < numbers.length; i++) {
            reversedNumbers[i] = reverse(numbers[i]);
        }

        // Use the precomputed reverses to check for magic pairs
        for (int i = 0; i < numbers.length - 1; ++i) {
            for (int j = i + 1; j < numbers.length; ++j) {
                if (numbers[i] + reversedNumbers[j] == numbers[j] + reversedNumbers[i]) {
                    ++count;
                }
            }
        }

        return (int) (count % mod);
    }

    // Optimized reverse without converting to strings
    private int reverse(int number) {
        int reversed = 0;
        while (number > 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }
        return reversed;
    }

}
