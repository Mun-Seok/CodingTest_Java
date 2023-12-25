import java.util.*;
class Solution {
    public long solution(long n) {
        String answer = "";
        String[] str = String.valueOf(n).split("");
        Arrays.sort(str, Collections.reverseOrder());
        for(String s : str)
            answer += s;
        return Long.parseLong(answer);
    }
}