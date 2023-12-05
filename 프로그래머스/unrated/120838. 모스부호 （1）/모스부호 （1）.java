import java.util.*;
class Solution {
    public String solution(String letter) {
        Map<String, String> map = new HashMap<String,String>();
        String[] morse = {".-","-...","-.-.","-..",".","..-.",
			"--.","....","..",".---","-.-",".-..",
			"--","-.","---",".--.","--.-",".-.",
			"...","-","..-","...-",".--","-..-",
			"-.--","--.."};
        String[] alpha = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String answer = "";
        for(int i = 0; i < morse.length; i++)
            map.put(morse[i], alpha[i]);
        String[] letters = letter.split(" ");
        for(int i = 0; i < letters.length; i++)
            answer += map.get(letters[i]);
        return answer;
    }
}