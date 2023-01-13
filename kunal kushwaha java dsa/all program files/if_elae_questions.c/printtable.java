import java.util.*;

public class printtable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("inter name");
        String name = sc.nextLine();
        // System.out.println(name);
        System.out.println("roll no");
        int roll = sc.nextInt();
        // System.out.println(roll);
        System.out.print("inter marks of student ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += arr[i];
        }
        System.out.print("your marks is "+ result / n);
    }
}