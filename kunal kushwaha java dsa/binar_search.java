import java.util.*;
public class binar_search {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int arr[] = { 10, 20, 30, 40, 50, 60, 70 };
        int target = 70;
        int ans = bs(arr, target);
        System.out.println(ans);
    }

    public static int bs(int arr[], int target) {
            int start = 0;
        int end = arr.length - 1;
        
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
                // System.out.println(start);
                // return;
            } else if (target < arr[mid]) {
                end = mid - 1;
                
            } else  {
                // System.out.println(mid);
                return mid;
            }
           
        }
        return -1;
    }
    
}
