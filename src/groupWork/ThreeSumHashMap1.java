package groupWork;

import java.util.*;

public class ThreeSumHashMap1 {

    public static void main(String[] args) {
        int[] array = {12, 3, 1, 2, -6, 5, -8, 6} ; //0
        int target = 6 ;

        System.out.println(threeSumHashMap(array,target));
    }

    private static List<List<Integer>> threeSumHashMap(int[] array, int target){

        Set<List<Integer>> result = new HashSet<>();
        if(array.length==0) return new ArrayList<>();

        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            map.put(array[i],i);
        }

        for (int i = 0; i <array.length-1 ; i++) {
            for (int j = i+1; j <array.length ; j++) {
                int potentialMatch = target-array[i]-array[j];
                List<Integer> triplet = new ArrayList<>();

                if(map.containsKey(potentialMatch)&&map.get(potentialMatch)>j){
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
