import java.util.*;
class Solution {
    public String[] solution(String myString) {
        List<String> answer = new ArrayList<>(Arrays.asList(myString.split("x",-1)));
        answer.removeAll(Arrays.asList(""));
        Collections.sort(answer);
        return answer.toArray(new String[answer.size()]);
    }
}