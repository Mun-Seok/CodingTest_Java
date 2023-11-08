import java.util.Arrays;
class Solution {
    public String solution(String my_string, int[][] queries) {
        char[] answer = my_string.toCharArray();
        for(int i =0; i < queries.length;i++){
            int s = queries[i][0];
            int e = queries[i][1];
            for(int j = s; j <= (s + e)/2; j++){
                char temp = answer[j];
                answer[j] = answer[s+e-j];
                answer[s+e-j] = temp;
            }
        }
        return new String(answer);
    }
}