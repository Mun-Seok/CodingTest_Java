import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String answer = "";
        
        for(char a : str.toCharArray()){
            if(Character.isUpperCase(a)){
                answer += Character.toLowerCase(a);
            } else if(Character.isLowerCase(a)){
                answer += Character.toUpperCase(a);
            }
        }
        System.out.print(answer);
        
    }
}