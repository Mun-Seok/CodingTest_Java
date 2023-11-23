class Solution {
    public int solution(String binomial) {
        String[] temp = binomial.split(" ");
        switch(temp[1]){
            case "+":
                return Integer.parseInt(temp[0]) + Integer.parseInt(temp[2]);
            case "-":
                return Integer.parseInt(temp[0]) - Integer.parseInt(temp[2]);
            case "*":
                return Integer.parseInt(temp[0]) * Integer.parseInt(temp[2]);
        }
        return 0;
    }
}