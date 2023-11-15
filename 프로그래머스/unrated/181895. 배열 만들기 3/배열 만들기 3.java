import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] temp1 = Arrays.copyOfRange(arr, intervals[0][0], intervals[0][1] +1);
        int[] temp2 = Arrays.copyOfRange(arr, intervals[1][0], intervals[1][1] + 1);
        
        
        int[] answer = new int[temp1.length + temp2.length];
        
        System.arraycopy(temp1, 0, answer, 0 , temp1.length);
        System.arraycopy(temp2, 0, answer, temp1.length , temp2.length);
        
        return answer;
    }
}