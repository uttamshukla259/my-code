class student {
    int id;
    String name;

    public student() {
        id = 90;
        name = "my name is uttam shukla";
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

    public void setId(int i) {
        id = i;
    }
}

public class constructor {
    public static void main(String[] args) {
        student uttam = new student();
 System.out.println(uttam.getId());
 System.out.println(uttam.getName());
    }
}
