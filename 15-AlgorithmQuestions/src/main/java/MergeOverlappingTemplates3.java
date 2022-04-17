import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeOverlappingTemplates3 {

    public static void main(String[] args) {

        int[][] arr = { {1, 2}, {3, 5}, {4, 7}, {6, 8}, {9, 10}};
        System.out.println(Arrays.deepToString(mergeIntervals3(arr)));

    }


    private static int[][] mergeIntervals3(int[][] intervals) {
        int[][] sortedIntervals = intervals.clone();
        Arrays.sort(sortedIntervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int[]> mergedIntervals = new ArrayList<>();

        int[] currentInterval = sortedIntervals[0];

        mergedIntervals.add(currentInterval);

        for (int[] nextInterval : sortedIntervals) {

            int currentIntervalEnd = currentInterval[1];
            int nextIntervalStart=nextInterval[0];
            int nextIntervalEnd=nextInterval[1];

            if(currentIntervalEnd>=nextIntervalStart){
                currentInterval[1]=Math.max(currentIntervalEnd,nextIntervalEnd); //cannot use currentIntervalEnd bc it would be out of scope
            }else{
                currentInterval=nextInterval;
                mergedIntervals.add(currentInterval);
            }

        }

        return mergedIntervals.toArray(new int[mergedIntervals.size()][]);

    }


}



