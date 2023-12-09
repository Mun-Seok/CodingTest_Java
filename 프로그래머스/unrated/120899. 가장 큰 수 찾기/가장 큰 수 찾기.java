class Solution {
    public int[] solution(int[] array) {
        int max = 0;
        int count = 0;
        for(int i = 0; i< array.length; i++){
            if(array[i] > max){
                max = array[i];
                count = i;
            }
        }
        return new int[]{max,count};
    }
}