import java.util.*;
public class Main {
  public int solution(String str, char t){
    int answer = 0;
  	str = str.toUpperCase();
    t = Character.toUpperCase(t);
    
    for(int i = 0; i < str.length(); i++){
    	if(str.charAt(i) == t ) answer++;
    }
    
    return answer;
  }
  
  public static void main(String[] args){
    Main T = new Main();
    Scanner in=new Scanner(System.in);
    String str = in.next();
    char c = in.next().charAt(0);
    System.out.print(T.solution(str, c));
  }
}
