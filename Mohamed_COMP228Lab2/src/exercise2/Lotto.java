package exercise2;

import java.util.Random;

public class Lotto {
    private int[] numbers;
    private Random random;

    public Lotto() {
        numbers = new int[3];
        random = new Random();
    }

    public int roll() {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 1 + random.nextInt(9); // 1–9
            sum += numbers[i];
        }
        return sum;
    }

    public int[] getNumbers() {
        return numbers;
    }
}
