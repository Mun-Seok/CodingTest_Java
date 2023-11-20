class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        
        while(true){           
            int change = 0;
            
            for(int i = 0; i < arr.length; i++){
                if((arr[i] >= 50) && (arr[i] % 2 == 0)){
                    arr[i] = arr[i] / 2;
                    change++;
                }
                
                else if((arr[i] <= 50) && (arr[i] % 2 != 0)){
                    arr[i] = arr[i] * 2 + 1;
                    change++;
                }
            }
            if(change == 0) break;
            answer++;
        }
            
        return answer;
    }
}