import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeOverlappingIntervals {
    public static void main(String[] args) {
        List<int[]> list =
                Arrays.asList(new int[]{1, 2}, new int[]{3, 5}, new int[]{4, 7}, new int[]{6, 8}, new int[]{9, 10});
        mergeOverlappingInterval(list).forEach(p -> System.out.println(Arrays.toString(p)));

    }

    private static List<int[]> mergeOverlappingInterval(List<int[]> list) {

        List<int[]> mergedIntervals = new ArrayList<>();
        int currentIntervalEnd;
        int nextIntervalStart;
        int nextIntervalEnd;
        int idx = 0;
        int[] currentInterval = list.get(idx);
        int[] nextInterval = list.get(idx + 1);

        while (nextInterval != null) {

            currentIntervalEnd = currentInterval[1];
            nextIntervalStart = nextInterval[0];
            nextIntervalEnd = nextInterval[1];
nextInterval = new int[]{nextIntervalStart,nextIntervalEnd};
            if (currentIntervalEnd < nextIntervalStart) {
                mergedIntervals.add(currentInterval);
            }
            idx++;

        }


//        for (int i = 0; i < list.size()-1; i++) {
//            currentInterval=list.get(i);
//            nextInterval=list.get(i+1);
//            currentIntervalEnd=currentInterval[1];
//            nextIntervalStart=nextInterval[0];
//            nextIntervalEnd=nextInterval[1];
//
//            if (currentIntervalEnd < nextIntervalStart) {
//                mergedIntervals.add(currentInterval);
//            } else {
//                currentInterval[1] = Math.max(currentIntervalEnd, nextIntervalEnd);
//                nextInterval = new int[]{currentInterval[0],currentInterval[1]};
//                currentInterval=nextInterval;
//
//            }


        return mergedIntervals;

    }

}
