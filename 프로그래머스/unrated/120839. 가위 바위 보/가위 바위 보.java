class Solution {
    public String solution(String rsp) {
        String[] answer = rsp.split("");
        for(int i = 0; i < answer.length; i++)
            switch(answer[i]){
                case "0":
                    answer[i] = "5";
                    break;
                case "2":
                    answer[i] = "0";
                    break;
                case "5":
                    answer[i] = "2";
                    break;
            }
        return String.join("",answer);
    }
}