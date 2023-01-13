import java.util.*;

public class array01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int k = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        while(n >= k) {
            for (int j = 0; j < n; j++) {
                int temp = arr[n - j - 1];
                arr[n - j - 1] = arr[j + 1];
                arr[j + 1] = temp;

            }
            k++;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }        
}

// }
