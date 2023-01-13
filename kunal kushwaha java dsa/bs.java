import java.util.*;

public class bs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int k = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result = bsearch(arr,k);
        System.out.println(result);
    }

    public static int bsearch(int arr[], int k) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int ans = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (k == arr[mid]) {
                return mid;
            } else if (k > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
                ans = mid;
            }
        }
        return -1;
    }
}
