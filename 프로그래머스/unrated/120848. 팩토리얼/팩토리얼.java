class Solution {
    public int solution(int n) {
        int answer = 1;
        int sum = 1;
        while(true){
            sum = sum * answer;
            answer++;
             if(sum > n){
                break;
            }
        }
        return answer - 2;
    }
}