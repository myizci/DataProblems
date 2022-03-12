package groupWork;

import java.util.ArrayList;
import java.util.List;

public class SpriralTask1 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {12, 13, 14, 5}, {11, 16, 15, 6}, {10, 9, 8, 7}};

        spiraltask1(matrix).forEach(System.out::println);
    }

    private static List<Integer> spiraltask1(int[][] array) {

        if (array.length == 0) return new ArrayList<Integer>();

        var result = new ArrayList<Integer>();
        int startRow = 0;
        int endRow = array.length - 1;
        int startCol = 0;
        int endCol = array[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {

            for (int col = startCol; col <= endCol; col++) {
                result.add(array[startCol][col]);
            }

            for (int row = startRow + 1; row <= endRow; row++) {
                result.add(array[row][endCol]);
            }

            for (int col = endCol - 1; col >= startCol; col--) {

                if (startRow == endRow) break;

                result.add(array[endRow][col]);
            }

            for (int row = endRow - 1; row >= startRow+1; row--) {

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

