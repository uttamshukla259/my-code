import java.util.*;

public class shortingarray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int student[] = new int[a];
        for (int i = 0; i < a; i++) {
            student[i] = sc.nextInt();

        }
        System.out.println("give the number to find in array");
        int x = sc.nextInt();
        for (int i = 0; i < a; i++) {
            if (student[i] == x) {
                System.out.println("x is found at index : " + i);
            }
        }
    }
}
