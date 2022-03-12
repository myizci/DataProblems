package problems;

import java.util.ArrayList;
import java.util.List;

public class Spiral {


    /*
    Write a function that takes in an n x m two-dimensional array (that can be square-shaped
when n == m) and returns a one-dimensional array of all the array's elements in spiral order.
Spiral order starts at the top left corner of the two-dimensional array, goes to the right, and
proceeds in a spiral pattern all the way until every element has been visited. Both iterative and
recursive solutions are welcome.
Sample Input
array = [ [1, 2, 3, 4], [12, 13, 14, 5], [11, 16, 15, 6], [10, 9, 8, 7],]
Sample Output
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12,13,14,15,16]
     */
    public static void main(String[] args) {
        int[][] matrix= { {1, 2 ,3,4}, {12, 13, 14,5 },{11, 16, 15, 6}, { 10, 9, 8,7}};

        spiralTraverse(matrix).forEach(System.out::println);

    }


    private static List<Integer> spiralTraverse(int[][] array){

        // Return empty list if array is empty

        if(array.length==0) return new ArrayList<Integer>();
        var result = new ArrayList<Integer>();  // var is coming from Java 10
        int startRow =0;
        int endRow = array.length-1;
        int startCol = 0;
        int endCol = array[0].length-1;

        /*
                     up row
                    ______
                    |    |
      left column   |    | right column
                    |    |
                    ______
                 bottom row

         */

        while(startRow<=endRow && startCol<=endCol) {

            //up row
            for (int col = startCol; col <= endCol; col++) {
                result.add(array[startRow][col]);

            }

            // right column
            for (int row = startRow + 1; row <= endRow; row++) {
                result.add(array[row][endCol]);


            }

            //bottom row
            for (int col = endCol - 1; col >= startCol; col--) {
                // if there is one line , we shall not count twice
                if (startRow == endRow) break;
                result.add(array[endRow][col]);
            }

            // left column
            for (int row = endRow - 1; row > startRow; row--) {
                // if there is a one column left, we shall not count twice
                if (startCol == endCol) break;
                result.add(array[row][startCol]);
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
        return result;
    }
}
