import java.util.*;
public class function_pelindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        checkPelindrom(n);
        
    }

    static int checkPelindrom(int n) {
        int temp, r, sum = 0;
        temp = n;
        while (n != 0) {
            r = n % 10;
            sum = sum * 10 + r;
            n = n / 10;
        }
        if (temp == sum)
            System.out.println(sum + " pelindrom");
        else
            System.out.println(sum +"not pelindrom ");
        return n;
    }
    
}
