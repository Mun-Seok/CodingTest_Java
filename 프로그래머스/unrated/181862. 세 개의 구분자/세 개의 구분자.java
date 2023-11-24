import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        String[] answer = Arrays.stream(myStr.split("a|b|c"))
                .filter(s -> s !=null && s.length() >0)  
                .toArray(String[]::new);
        String[] empty = {"EMPTY"};
        return answer.length != 0? answer : empty;
    }
}