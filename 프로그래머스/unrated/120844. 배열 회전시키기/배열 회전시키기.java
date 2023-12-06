class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        if(direction.equals("left"))
            for(int i = 0; i < numbers.length; i++)
                answer[i - 1 < 0? numbers.length -1 : i-1] = numbers[i];
       else{
            for(int i = 0; i < numbers.length; i++)
                answer[i + 1 >= numbers.length? 0 : i + 1] = numbers[i];
       }
        return answer;
    }
}