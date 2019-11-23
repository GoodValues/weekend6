package stopczas;

import bubbleSort.TableUtilities;

public class StopMain {
    public static void main(String[] args) {
        int repetitions = 1000;
        int[] tab = TableUtilities.createAndFillTable(10000, 0, 100);
        StopWatch stopwatch = new StopWatch();
        stopwatch.start();
        for (int i = 0; i < repetitions; i++)
            addValue(tab);
        System.out.println(stopwatch.stop() / repetitions);
    }

    private static void addValue(int[] t) {
        for (int i = 0; i < t.length; ++i)
            t[i] *= 2;
    }
}