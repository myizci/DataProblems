package problems;

import java.util.*;

public class ThreeSum {

    /*
    Write a function that takes in a non-empty array of distinct integers and an integer
representing a target sum. The function should find all triplets in the array that sum up to
the target sum and return a two-dimensional array of all these triplets. The numbers in each
triplet should be ordered in ascending order, and the triplets themselves should be ordered
in ascending order with respect to the numbers they hold. If no three numbers sum up to
the target sum, the function should return an empty array.
Sample Input
array = [12, 3, 1, 2, -6, 5, -8, 6]. targetSum = 0
Sample Output
[[-8, 2, 6], [-8, 3, 5], [-6, 1, 5]]
     */
    public static void main(String[] args) {
        int[] array1 = new int[]{12, 3, 1, 2, -6, 5, -8, 6};
        System.out.println("Printing three sum with pointers");
        threeSumPointer(array1, 6).forEach(System.out::println);
        System.out.println("Printing three sum with map");
        threeSumMap(array1,6).forEach(System.out::println);
    }

    private static List<List<Integer>> threeSumPointer(int[] array, int target) {
        // sort the array,
        Arrays.sort(array); // O(n) = n log n
        // Create a list of lists to store triplets
        List<List<Integer>> list = new ArrayList<>();
        // In twoSum we used one while loop,
        // In threeSum, we will use a for loop and a while loop in it  (O(n) = n*n
        // Write a for loop from i=0 to i<array.length-2,
        // last two indices are spared for two indices, left and right

        // O(n) = n*n  , one for for loop, one for while loop
        for (int i = 0; i < array.length - 2; i++) {

            int left = i + 1;
            int right = array.length - 1;

            // start the while loop

            while (left < right) {
                int currentSum = array[i] + array[left] + array[right];

                if (currentSum == target) {
                    list.add(Arrays.asList(array[i], array[left], array[right]));
                    left++;
                    right--;
                } else if (currentSum < target) left++;
                else right--;
            }

        }
        return list;
    }

    private static List<List<Integer>> threeSumMap(int[] array, int target) {

        // Create a set of List<Int> to store the possible solutions
        Set<List<Integer>> result = new HashSet<>();

        //Create a hashMap to store all numbers(key) and indices(value)
        Map<Integer, Integer> map = new HashMap<>();

        // sort the array
        Arrays.sort(array);

        //put the array in the map

        for (int a = 0; a < array.length; a++) {
            map.put(array[a],a);
        }

        // create a nested loop and i=0, j=i+1,
        // look for a key that will add up to previous two to equal the sum
        //if found add to into a list, and list to the set
        // make sure last number index is greater than j to avoid different list with same numbers

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                List<Integer> triplet = new ArrayList<>();
                int potentialMatch = target - array[i] - array[j];
                if (map.containsKey(potentialMatch) && map.get(potentialMatch) > j) {
                    triplet.add(array[i]);
                    triplet.add(array[j]);
                    triplet.add(potentialMatch);

                    result.add(triplet);
                }
            }
        }

        return new ArrayList<>(result);
    }


}
