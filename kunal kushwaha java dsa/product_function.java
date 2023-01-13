import java.util.*;
public class product_function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a");
        int a = sc.nextInt();
        System.out.println("enter the value of b");
        int b = sc.nextInt();
        System.out.println("the product is");
        product(a, b);
    }

    static int product(int a, int b) {
        int product = a * b;
        System.out.println(product);
        return b;
    
  } 
}
