class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numer = numer1 * denom2 + numer2 *denom1;
        int denom = denom1 * denom2;
        
        int temp = numer < denom ? numer : denom;
        int a = 1;
        for(int i = 1; i <= temp; i++){
            a = numer % i ==0 && denom % i == 0 ? i : a;
        }
        int[] answer = {numer / a, denom / a};
        return answer;
    }
}