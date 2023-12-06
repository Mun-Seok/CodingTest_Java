class Solution {
    public int solution(int[] dot) {
        if(dot[0] < 0){
            if (dot[1] > 0)
                return 2;
            else
                return 3;
        } else {
            if(dot[1] < 0)
                return 4;
            else
                return 1;
        }
    }
}