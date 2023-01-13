import java.util.*;
public class findmax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("eneter the size of array  :"+" ");
        int n = sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("enter the element of array " + " ");
            arr[i] = sc.nextInt();

        }
        
        // Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
           
        
        }
       
        System.out.println("1st max element"+arr[n - 1]);
        System.out.println("1st max element" + arr[n - 2]);
        
        System.out.println("sum"+ (arr[n-1]+arr[n-2]));
    }
}
