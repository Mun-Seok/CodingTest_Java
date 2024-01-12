import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        int divide = n;
        
        List<Integer> list = new ArrayList<>();
        
        while(divide != 0) {
        	list.add(divide % 3);
        	divide = divide / 3;
        }
        
        int count = list.size() - 1;
        for(int i: list) {
        	answer+=(int)(i * Math.pow(3, count--));
        }
        
        return answer;
    }
}