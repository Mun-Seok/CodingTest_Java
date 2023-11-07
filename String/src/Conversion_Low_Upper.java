import java.util.*;

public class Conversion_Low_Upper {
    public String solution(String str){
        String answer = "";
        // UpperCase()와 LowerCase() 사용하기
        /*
        for(char x : str.toCharArray()){
            if(Character.isLowerCase(x)) answer += Character.toUpperCase(x);
            else answer += Character.toLowerCase(x);
        }
        */

        // Ascii 코드 사용하기
        for(char x : str.toCharArray()){
            if(x >= 97 && x <= 122) answer += x-32;
            else answer+=(x+32);
        }
        return answer;
    }

    public static void main(String[] args){
        Conversion_Low_Upper T = new Conversion_Low_Upper();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }
}
