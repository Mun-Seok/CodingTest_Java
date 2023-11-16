import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int max = 0;
        int min = arr.length;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 2){
                min = min > i ? i : min;
                max = max < i ? i : max;
            }
        }
        if(max != 0){
            return Arrays.copyOfRange(arr,min,max+1);
        }else{
            return new int[]{-1};
        }
    }
}