import java.util.*;
public class max_min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        // Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        
        for (int i = 0; i < n; i++) {

        }
        System.err.println("max: " + max);
        System.err.println("max: " + min);
    }
}
