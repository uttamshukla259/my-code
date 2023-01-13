class student {
    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public int   getId(){
        return id;
    }

    public void setId(int i) {
        id = i;
    }
}
public class gatterAndsetter {
    public static void main(String[] args) {
        student uttam = new student();
        uttam.setName("uttam shukla");
        System.out.println(uttam.getName());
        uttam.setId(54);
        System.out.println(uttam.getId());
    }
}
