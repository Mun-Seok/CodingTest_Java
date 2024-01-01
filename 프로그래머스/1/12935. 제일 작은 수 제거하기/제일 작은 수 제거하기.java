import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1) return new int[]{-1};

        int min = arr[0];
        for(int i = 0; i < arr.length; i++)
            if(arr[i] < min) min = arr[i];
        
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++)
            if(arr[i] != min) list.add(arr[i]);
        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}