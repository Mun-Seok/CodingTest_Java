import java.util.*;
class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        
        String[] sArr = s.split(" ",-1);
        
        for (int i=0; i<sArr.length; i++) {
            String[] temp = sArr[i].split("");
            if (!temp[0].equals("0")||!temp[0].equals("1")||!temp[0].equals("2")||!temp[0].equals("3")||!temp[0].equals("4")||!temp[0].equals("5")||!temp[0].equals("6")||!temp[0].equals("7")||!temp[0].equals("8")||!temp[0].equals("9")) {
                temp[0] = temp[0].toUpperCase();
            }
            for (int j=1; j<temp.length; j++) {
                temp[j] = temp[j].toLowerCase();
            }
            String jc = String.join("",temp);
            answer.append(jc);
            if (i!=sArr.length-1) {
                answer.append(" ");
            }
        }
        
        return answer.toString();
    }
}