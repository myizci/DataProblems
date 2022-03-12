package problems;

import java.util.Random;

public class Random1 {
    public static void main(String[] args) {

        final long RANDOM_ITERATION = 10000000;
        final int RANDOM_COUNT = 20;

        int low = 0;
        int[] numStats = new int[RANDOM_COUNT];

        for (int i = 1; i <= RANDOM_ITERATION; i++) {
            numStats[ new Random().nextInt(RANDOM_COUNT -low)+low]++;
        }

        for (int i = 0; i < RANDOM_COUNT; i++) {
            System.out.println("the total occurrence for " + i + " = "+numStats[i]);
        }

    }

}
