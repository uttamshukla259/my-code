import java.util.*;
// this is last and first occurance question.
public class binarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int k = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // for starting index
        int l = 0;
        int r = n - 1;
        int Sindex = -1;
        int Eindex = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == k) {
                Sindex = mid;
                r = mid - 1;
            } else if (arr[mid] > k) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        // for ending index
        l = 0;
        r = n - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == k) {
                Eindex = mid;
                l = mid + 1;
            } else if (arr[mid] > k) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        System.out.println(Sindex +" "+ Eindex);
    }
}
