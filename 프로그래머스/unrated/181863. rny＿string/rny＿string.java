class Solution {
    public String solution(String rny_string) {
        String answer = "";
        for(char ch : rny_string.toCharArray())
            answer += ch == 'm'? "rn" : ch;
        return answer;
    }
}