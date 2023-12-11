class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int i = 0; i < array.length; i++){
            for(String s : String.valueOf(array[i]).split(""))
                answer += s.equals("7")? 1:0;
        }
        return answer;
    }
}