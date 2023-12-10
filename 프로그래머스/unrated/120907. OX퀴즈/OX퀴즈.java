class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for(int i = 0; i < quiz.length; i++){
            String[] strArray = quiz[i].split(" ");
            if(strArray[1].equals("+"))
                answer[i] = Integer.parseInt(strArray[0]) + Integer.parseInt(strArray[2]) == Integer.parseInt(strArray[4])? "O" : "X";
            else if(strArray[1].equals("-"))
                answer[i] = Integer.parseInt(strArray[0]) - Integer.parseInt(strArray[2]) == Integer.parseInt(strArray[4])? "O" : "X";
        }
        return answer;
    }
}