class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int calA = Integer.parseInt(String.valueOf(a)+String.valueOf(b));
        int calB = 2 * Integer.parseInt(String.valueOf(a)) * Integer.parseInt(String.valueOf(b));
        
        return answer = calA >= calB? calA : calB;
    }
}