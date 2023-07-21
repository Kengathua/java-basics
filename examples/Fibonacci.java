package examples;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static void main(String... args) {
        int maxNum = 5000;
        int latest = 0;
        int previous = 0;
        List<Integer> sequence = new ArrayList<>();

        for (int i = 0; i <= maxNum; i++) {
            if (i <= 1) {
                sequence.add(i);
                latest = 1;
            } else {
                int current = previous + latest;
                sequence.add(current);
                previous = latest;
                latest = current;
            }
        }
        System.out.println(sequence);
    }
}

// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181
