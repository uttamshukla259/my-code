public class constructor_overloading {    
    public static void main(String[] args) {
        student uttam = new student();
        student ankit = new student(21, 43, "ankit");
        student aman = new student(93, 49, "aman");
  System.out.println(uttam.roll);
  System.out.println(uttam.name);
  System.out.println(uttam.marks);
 System.out.println(ankit.roll);
 System.out.println(ankit.name);
 System.out.println(ankit.marks);
 System.out.println(aman.roll);
 System.out.println(aman.name);
 System.out.println(aman.marks);
    }
}

     class student{
         int roll;
         String name;
         float marks;

         student()
         {
             this.roll = 33;
             this.name = "uttam shukla";
             this.marks = 93.3f;
         }

         student(int r, float m, String n) {
        this.roll= r;
        this.name = n;
        this.marks = m;
         }
         }
    

