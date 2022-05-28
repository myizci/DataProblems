import java.util.Arrays;

public class SmallestDifference {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, -6, -13, 10, -12};
        int[] arr3 = {4, 8, 34, -3, 7, -1};
        //System.out.println(smallestDifference(arr1, arr3));
        System.out.println(Arrays.toString(findSmallestDifferencePair(arr1, arr3)));
    }

    static int smallestDifference(int[] arr1, int[] arr2) {

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int l1 = arr1.length;
        int l2 = arr2.length;
        int min = Integer.MAX_VALUE;
        int a = 0;
        int b = 0;

        while (a < l1 && b < l2) {

            if (Math.abs(arr1[a] - arr2[b]) < min) {
                min = Math.abs(arr1[a] - arr2[b]);
            }

            if (arr1[a] < arr2[b])
                a++;
            else
                b++;


        }


        return min;
    }

    static int findSmallestDifference(int A[], int B[],
                                      int m, int n)
    {
        // Sort both arrays
        // using sort function
        Arrays.sort(A);
        Arrays.sort(B);

        int a = 0, b = 0;

        // Initialize result as max value
        int result = Integer.MAX_VALUE;

        // Scan Both Arrays upto
        // sizeof of the Arrays
        while (a < m && b < n)
        {
            if (Math.abs(A[a] - B[b]) < result)
                result = Math.abs(A[a] - B[b]);

            // Move Smaller Value
            if (A[a] < B[b])
                a++;

            else
                b++;
        }

        // return final sma result
        return result;
    }

    public static int[] findSmallestDifferencePair(int[] a1, int[] a2) {
        Arrays.sort(a1);
        Arrays.sort(a2);

        double smallestDiff = Double.MAX_VALUE;
        int[] smallestDiffPair = new int[2];
        int i = 0, j = 0;

        while(i < a1.length && j < a2.length) {
            double currentDiff = Math.abs(a1[i] - a2[j]);
            if(currentDiff < smallestDiff) {
                smallestDiff = currentDiff;
                smallestDiffPair[0] = a1[i];
                smallestDiffPair[1] = a2[j];
            }
            if(a1[i] < a2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return smallestDiffPair;
    }
}
