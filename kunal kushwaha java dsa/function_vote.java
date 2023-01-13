import java.util.*;
public class function_vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("plese enter youe age");
        int age = sc.nextInt();
        vote(age);
    }

    static int vote(int age) {
    
 if(age>=18 )
     System.out.println("your age is :" + age + "and you are able to vote");
 else if(age<18)
     System.out.println("your age is :" + age + "and you are not able to vote");
     return age;
    }
   
}
