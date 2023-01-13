class employee {
    int salary;
    String name;

    public int getSalary(){
     return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}
public class harray_1 {
    public static void main(String[] args) {
        employee uttam = new employee();
        uttam.setName("uttam shukla");
        uttam.salary = 45;
        
        System.out.println(uttam.getSalary()); 
        System.out.println(uttam.getName()); 
    }
}
