import java.util.*;

public class primearray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int student[] = new int[a];
        for (int i = 1; i < a; i++) {
            student[i] = sc.nextInt();

        }
        for (int i = 1; i < a; i++) {
            System.out.println(student[i]);
        }
    }
}
