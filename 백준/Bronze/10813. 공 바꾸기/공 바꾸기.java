import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] basket = new int[N];
        for(int i =0; i < N; i++)
            basket[i] = i + 1;
 
        for(int i = 0; i < M; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            int temp = 0;
            
            temp = basket[a-1];
            basket[a-1] = basket[b-1];
            basket[b-1] = temp;
        }
        
        for(int i = 0; i < N; i++)
            System.out.println(basket[i]);
    }
}