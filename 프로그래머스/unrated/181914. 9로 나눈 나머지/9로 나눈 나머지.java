class Solution {
    public int solution(String number) {
        int answer = 0;
        for(int i = 0; i< number.length();i++){
            answer += number.charAt(i) - '0'; 
            // Ascii code로 계산되어 0을 빼줌
        }
        return answer %= 9;
    }
}