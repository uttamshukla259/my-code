class student{
    int id;
    int standerd;
    String name;

    public void classrecord() {
    System.out.println("details / record of class ");
 }
    public void printDetails() {
        System.out.println(this.id);
        System.out.println(this.name);
        System.out.println(this.standerd);
    }
}
public class gatter_setter {
    public static void main(String[] args) {
        student uttam = new student();
        student ankit = new student();
        student aman = new student();
        student abhinav = new student();
        student anshu = new student();
            uttam.id = 01;
            uttam.name = "uttam shukla";
            uttam.standerd = 10;

            ankit.id = 02;
            ankit.name = "ankit pandey";
            ankit.standerd = 11;

            aman.id = 03;
            aman.name = "aman gupta";
            aman.standerd = 12;

            abhinav.id = 04;
            abhinav.name = "abhinav shukla";
            abhinav.standerd = 9;

            anshu.id = 05;
            anshu.name = "anupam shukla";
            anshu.standerd = 5;

            // System.out.println(this.id);
            // System.out.println(this.name);
            // System.out.println(this.standerd);
           uttam. classrecord();
            uttam.printDetails();
            ankit.printDetails();
            aman.printDetails();
            abhinav.printDetails();
            anshu.printDetails();
    }
}
