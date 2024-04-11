import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        double[] arr = new double[n];
        double max = 0;
        for (int i = 0; i < n; i++) {
            arr[i]= scanner.nextInt();
            if (max < arr[i]) max = arr[i];
        }

        double answer = 0;
        for (int i = 0; i < n; i++) {
            answer += (arr[i] / max) * 100;
        }

        System.out.println(answer / n);
    }
}