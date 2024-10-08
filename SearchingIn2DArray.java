package Questions;

import java.util.Arrays;

public class SearchingIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23,14,56},
                {11,17,43},
                {12,65,78,99}
        };
        int target = 65;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }

     static int[] search(int[][] arr, int target) {
         for (int row = 0; row < arr.length; row++) {
             for (int col = 0; col < arr[row].length; col++) {
                    if (arr[row][col] == target){
                        return new int[] {row,col};
                    }
             }
         }
         return new int[] {-1,-1};
    }

}
