import java.util.*;
public class arrayajna {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int arr[] = new int[n];
     for (int i = 0; i < n; i++) {
         arr[i] = sc.nextInt();
     }
     Arrays.sort(arr);
     for (int i = 1; i < n - 1; i++) {
         if (arr[i] != arr[i + 1] && arr[i] == arr[i - 1]) {
             System.err.print(arr[i] + " ");
         }
     }
     if (arr[n - 1] == arr[n - 2]) {
        System.err.println(arr[n-2]);
     }
 
 }
}
