import java.util.*;
class Solution {
    public String solution(String my_string) {
        String[] strArray = my_string.toLowerCase().split("");
        Arrays.sort(strArray);
        String answer = "";
        for(String str : strArray)
            answer += str;
        return answer;
    }
}