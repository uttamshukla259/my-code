import java.util.Scanner;

import java.util.Scanner;

public class Main

{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        System.out.println(rev);
        if (rev == temp)
            System.out.println(true);
        else
            System.out.println(false);

    }
}