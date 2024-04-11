import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            answer[i] = i + 1;
        }

        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt() -1;
            int b = scanner.nextInt()-1;

            while(a<b){
                int temp = answer[a];
                answer[a] = answer[b];
                answer[b] = temp;
                a++;
                b--;
            }
        }

        for(int num : answer)
            System.out.print(num + " ");

    }

}