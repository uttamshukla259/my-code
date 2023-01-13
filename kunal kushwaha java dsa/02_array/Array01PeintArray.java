
import java.util.*;

public class Array01PeintArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[n];
            int ontime = 0;
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();

                // ontime.
                if (arr[j] <= 0) {
                    ontime++;
                }
            }
            if (ontime >= k) {
                System.out.println("no");
            } else {
                System.out.println("yes");
            }
        }
    }
}

