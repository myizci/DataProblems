package groupWork;

import java.util.*;

public class twoSum {
    /*
• Given an array of integers nums and an integer target, return indices of the two
numbers such that they add up to target.
• You may assume that each input would have exactly one solution, and you
may not use the same element twice.
• You can return the answer in any order.
     */
    public static void main(String[] args) {

        int[] array = {5,4,6,8,7,12}; //5->current number , index =0 and 7-> potentialMatch, index 4
        // 5 and 7, 7 and 5
        int target =12;
       // System.out.println(Arrays.toString(twoSumMap(array, target)));
      //  System.out.println(Arrays.toString(twoSumPointer(array, target)));
        System.out.println(twoSumMapSet(array, target));

    }

    private static int[] twoSumMap(int[] array, int target){

        // I will put pairs in a hashMap
        // key = array elements
        // value = index
        // while we put the pairs; we will look for a potential match for given elements
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int potentialMatch = target- array[i];
            if(map.containsKey(potentialMatch)){
                return new int[]{i,map.get(potentialMatch)} ;
            }else{
                map.put(array[i],i);
            }
        }
            return new int[] {};
    }

    private static int[] twoSumPointer(int[] array, int target){
        // sort the array
        Arrays.sort(array);

        int left = 0;
        int right = array.length-1;

        while(left<right){
            int sum =array[left]+array[right];
          if(sum==target){
              return new int[]{left,right};
          }else if(sum>target) right--;
          else left++;

        }
        return new int[]{};
    }

    private static Set<Set<Integer>> twoSumMapSet(int[] array, int target){
        Set<Set<Integer>> result = new HashSet<>();
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            map.put(array[i],i);
        }
        for (int i = 0; i < array.length; i++) {
            Set<Integer> pairs = new HashSet<>();
            int potentialMatch = target- array[i];
            if(map.containsKey(potentialMatch)){
                 pairs.add(map.get(potentialMatch));
                 pairs.add(map.get(array[i]));
                 if(pairs.size()==2) result.add(pairs);
            }else{
                map.put(array[i],i);
            }
        }
        return result;
    }

}
