import java.util.*;
class Solution {
    public int solution(int order) {
        return (int)Arrays.stream((String.valueOf(order)).split(""))
            .mapToInt(Integer::parseInt)
            .filter(i -> i % 3 == 0 && i != 0)
            .count();
    }
}