package groupWork;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

      int[] array = {12, 3, 1, 2, -6, 5, -8, 6} ; //0
      int target = 6 ;
        System.out.println(threeSum(array,target));

    }

    private static List<List<Integer>> threeSum(int[] array, int target){
        Arrays.sort(array);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i <= array.length-3; i++) {
            int left = i+1;
            int right = array.length-1;


            while(left<right){
                int sum = array[left]+array[right];
                if(array[i]+sum==target){
                   result.add(Arrays.asList(array[i],array[left],array[right]));
                    left++;
                    right--;
                }else if(array[i]+sum<target) left++;
                else right--;
            }
        }
        return result;
    }
}
