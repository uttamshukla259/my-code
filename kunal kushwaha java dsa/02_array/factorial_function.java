import java.util.*;
public class factorial_function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fact(n);
    }

    static int fact(int n)
     {
        int sum=1;
        for (int i = 1; i <= n; i++) {
            sum = sum * i;
        }
        System.out.println(sum);
        return n;
    }
}
