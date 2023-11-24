import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
    
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                list.add(arr[i]);
            }
        }
        
        int[] answer = new int[list.size()];		// 배열 answer 생성
        
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}