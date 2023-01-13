import java.util.Scanner;

public class prog1 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        float a = Sc.nextFloat();
        float b = Sc.nextFloat();
        int calculater = Sc.nextInt();
        switch (calculater) {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a * b);
                break;
            case 3:
                System.out.println(a - b);
                break;
            case 4:
                if (a == b) {
                    System.out.println("you interd ivalid statement");
                } else {
                    System.out.println(a % b);
                }
                break;
            case 5:
                if (a == b) {
                    System.out.println("you interd ivalid statement");
                } else {
                    System.out.println(a / b);
                }
                break;
            default:
                System.out.println("invalid statement");

        }

    }
}
