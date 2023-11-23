class Solution {
    public int solution(String myString, String pat) {
        String temp = "";
        for(int i = 0; i < myString.length(); i++)
            temp += myString.charAt(i) == 'A' ? 'B' : 'A';
        return  temp.contains(pat)? 1:0;
    }
}