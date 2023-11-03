class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int aLong = Integer.parseInt(String.valueOf(a)+String.valueOf(b));
        int bLong = Integer.parseInt(String.valueOf(b)+String.valueOf(a));
        
        return answer = aLong >= bLong? aLong : bLong;
    }
}