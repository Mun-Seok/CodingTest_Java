class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        // '('
        int leftCount = 0;
        
        // ')'의 
        int rightCount = 0;
        
        // '('이 마지막에 올때
        if(s.charAt(s.length()-1) == '(') return false;
        for(int i = 0; i < s.length(); i++){
            
            if(s.charAt(i) == '(') leftCount++;
            else if(s.charAt(i) == ')') rightCount++;
            
            // ')'가 '('보다 많을 때 ex) "(()))())"
            if(leftCount < rightCount) return false;
        }
        return  leftCount == rightCount;
    }
}