import java.util.*;

public class allocate_books {
    static boolean located(int arr[], long mid, int b) {
        long sum = 0, count = 1;
        for (int i = 0; i < arr.length; i++) {
            if (sum + arr[i] <= mid)
                sum += arr[i];
            else {
                count++;
                sum += arr[i];
                if (arr[i] > mid || count > b)
                    return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long sum = 0;
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        int b = sc.nextInt();
        if (b > n) {
            System.err.println(-1);
            return;
        }
        long beg = 1;
        long end = sum;
        long ans = -1;
        while (beg <= end) {
            long mid = beg + (end - beg) / 2;
            if (located(arr, mid, b)) {
                end = mid - 1;
                ans = mid;
            } else {
                beg = mid + 1;
            }
        }
        System.err.println(ans);
    }
}
