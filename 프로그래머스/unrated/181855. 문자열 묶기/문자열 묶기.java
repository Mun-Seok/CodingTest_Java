import java.util.*;
class Solution {
    public int solution(String[] strArr) {
        List<Integer> list = new ArrayList<>();
        int max = 0;   
        for(String str : strArr){
            list.add(str.length());
        }
        
        int answer = 0;
        for(int i = 0; i < 31; i++)
            answer = Collections.frequency(list,i) > answer? Collections.frequency(list,i) : answer;
        return answer;
    }
}