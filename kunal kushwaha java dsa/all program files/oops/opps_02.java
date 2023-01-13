import java.util.*;
class student {
   
    String name ;
    int standerd ;
    int rollno ;

    public void printdetails() {
        System.out.println("my name is " + name);
        System.out.println("i am in  " + standerd + " standerd");
        System.out.println("my roll no is " + rollno);
    }
}


public class opps_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        student ankit = new student();
        student aman = new student();
        student prince = new student();
        // details of ankit;
        ankit.name = sc.nextLine();
        ankit.standers = sc.nextInt();
        ankit.rollno = sc.nextInt();
        // details of aman;
        aman.name = sc.nextLine();
        aman.standers = sc.nextInt();
        aman.rollno = sc.nextInt();
        // details of prince
        prince.name = sc.nextLine();
        prince.standers = sc.nextInt();
        prince.rollno = sc.nextInt();
        //  printing the details of student;
        ankit.printdetails();
        aman.printdetails();
        prince.printdetails();
    }
}
