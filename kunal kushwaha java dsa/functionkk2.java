import java.util.*;
public class functionkk2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("eneter the value of a");
        int a = sc.nextInt();
        System.out.println("eneter the value of b");
        int b = sc.nextInt();
        System.out.println("eneter the value of c");
        int c = sc.nextInt();
        findMax(a, b, c);
        findMin(a, b, c);
    }

   public static int findMax(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println(a + "is grater ");
            return a;
        } else if (b > a && b > c) {
            System.out.println(b + "is grater");
            return b;
        } else {
            System.out.println(c + "is grater");
            return c;
        }

    }

    static int findMin(int a, int b, int c) {
        if (a < b && a < c) {
            System.out.println(a + "is smaller ");
            return a;
        } else if (b < a && b < c) {
            System.out.println(b + "is smaller");
            return b;
        } else {
            System.out.println(c + "is smaller");
            return c;
        }
    }
        
    
}
