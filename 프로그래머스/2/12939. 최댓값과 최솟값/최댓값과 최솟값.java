class Solution {
    public String solution(String s) {
        String[] strArr = s.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(String str : strArr){
            min = Math.min(min, Integer.valueOf(str));
            max = Math.max(max, Integer.valueOf(str));
        }
        return min + " " + max;
    }
}