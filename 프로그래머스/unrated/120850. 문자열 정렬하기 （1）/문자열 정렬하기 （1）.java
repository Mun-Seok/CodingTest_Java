import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        my_string = my_string.replaceAll("[a-z]","");
        String[] strArray = my_string.split("");
        int[] answer = new int[strArray.length];
        for(int i = 0; i < strArray.length; i++)
            answer[i] = Integer.parseInt(strArray[i]);
        Arrays.sort(answer);
        return answer;
    }
}