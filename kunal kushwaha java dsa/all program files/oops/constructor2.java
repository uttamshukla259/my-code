class student {
    private int id;
    private String name;

    public student(String myname , int myid) {
        id = myid;
        name = myname;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
    
    public int  getId() {
        return id;
    }

    public void setName(int i) {
        id = i;
    }
    
}
public class constructor2 {
    public static void main(String[] args) {
        student uttam = new student(myname "uttam",myid 09);
        System.out.println(uttam.getId());
        System.out.println(uttam.getName());
    }
    
}
