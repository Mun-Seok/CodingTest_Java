import java.lang.Math;
class Solution {
    public int[] solution(int[] arr) {
        int count = 0;
        while(Math.pow(2,count) < arr.length)
            count++;
        int[] answer = new int[(int)Math.pow(2,count)];
        for(int i = 0; i < arr.length; i++)
            answer[i] = arr[i];
        return answer;
    }
}