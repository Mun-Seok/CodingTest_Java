class Solution {
    public String solution(String myString) {
        String answer = "";
        for(int i = 0; i < myString.length(); i++)
            answer += (int)myString.charAt(i) > 108 ? myString.charAt(i) : 'l';
        return answer;
    }
}