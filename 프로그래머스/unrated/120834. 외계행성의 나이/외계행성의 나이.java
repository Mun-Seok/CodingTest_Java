class Solution {
    public String solution(int age) {
        String[] temp = String.valueOf(age).split("");
        String answer = "";
        for(String str : temp)
            answer += (char)(Integer.parseInt(str) + 97);
        return answer;
    }
}