package problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {

        int[] arr = {1,4,6,3,67,9,7};
        System.out.println(Arrays.toString(twoSumForce(arr, 9)));

        System.out.println(Arrays.toString(twoSumMap(arr, 9)));

        System.out.println(Arrays.toString(twoSumPointer(arr, 9)));


    }

    /*
        Given an array of integers nums and an integer target, return indices of the two
    numbers such that they add up to target.
    • You may assume that each input would have exactly one solution, and you
    may not use the same element twice.
    • You can return the answer in any order.
     */

    private static int[] twoSumMap(int[] array , int target){

        //define a hashMap where key=array value and value= index

        Map<Integer,Integer> map = new HashMap<>();

        // loop the array
        for (int i = 0; i < array.length; i++) {
            // define a potential match

            int potentialMatch = target-array[i];

            //if potentialMatch exists as a key, return the current i and "value" of potentialMatch
            //else put the (potentialMatch,index) in the map

            if(map.containsKey(potentialMatch)) return new int[]{i,map.get(potentialMatch)};
            else map.put(array[i],i);

        }
        // return an empty mapy if not solution is found;
        return new int[]{};
    }

    private static int[] twoSumPointer(int[] array, int target){

        // sort the array, O(n) = nlog(n)

        Arrays.sort(array);

        // Define tow index pointers; i at index 0, j at index array.length-1;
        int i = 0;
        int j= array.length-1;
        // It is important that we sorted the array. as we add the pointers to find the match
        // 1) if the sum is> target, we decrease the sum by moving j to the left; j-> j--
        // 2) Else if the sum is less, we increase sum by moving ito the right; i-> i++
        // while loop is the best

        while(i<j){
            int sum = array[i]+array[j];
            if(sum==target){
                return new int[]{i,j};}
                else if(sum>target) j--;
                else i++;
            }

        return new int[]{};
        // the result of two methods will be different , we are sorting in the second method
        }

        private static int[] twoSumForce(int[] array, int target){


            for (int i = 0; i < array.length-1; i++) {
                for (int j = i+1; j <array.length ; j++) {

                    if(array[i]+array[j]==target) return new int[] {i,j};
                }

            }
            return new int[]{};
        }


    }


