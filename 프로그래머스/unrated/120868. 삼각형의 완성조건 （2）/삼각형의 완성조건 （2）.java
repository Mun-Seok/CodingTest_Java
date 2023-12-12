class Solution {
    public int solution(int[] sides) {
        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);

        int low = max - min;
        int high = max + min;

        return high - low - 1;
    }
}