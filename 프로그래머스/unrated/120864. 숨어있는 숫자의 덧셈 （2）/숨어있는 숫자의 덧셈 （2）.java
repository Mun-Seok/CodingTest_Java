class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] temp = (my_string.replaceAll("[^\\d]"," ")).split(" ");
        for(int i = 0; i < temp.length; i++){
            answer += !(temp[i].isEmpty()) ? Integer.parseInt(temp[i]) : 0;
        }
        return answer;
    }
}