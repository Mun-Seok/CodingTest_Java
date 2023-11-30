import java.util.*;
class Solution {
    public int solution(int[][] arr) {
        int[][] list = new int[arr.length][arr.length];
        for(int i = 0; i < arr.length; i++){
           for(int j = 0; j < arr.length; j++)
               list[i][j] = arr[j][i];
        }
        return Arrays.deepEquals(arr,list)? 1: 0;
    }
}