class Solution {
    public int solution(int num) {
        int answer = 0;
        while(num != 1){
            num = num % 2 == 1? num * 3 + 1 : num / 2;
            answer++;
            if(answer == 500)
                return -1;
        }
        return answer;
    }
}