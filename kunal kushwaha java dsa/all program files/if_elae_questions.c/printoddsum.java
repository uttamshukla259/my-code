
    
import java.util.*;
import java.lang.*;
import java.io.*;

public class printoddsum {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int evensum = 0;
        int oddsum = 0;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evensum += arr[i];
            } else {
                oddsum += arr[i];
            }
        }
        // for (int i = 0; i < n; i++) {
        //     System.out.print(oddsum+" ");
        // }
        System.out.print(oddsum + " ");
    }
}

