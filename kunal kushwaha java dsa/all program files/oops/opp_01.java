class emp {
    int id;
    long ph_no;
    String name;
    String address;

    public void printDetails() {
        System.out.println("my id is "+ id);
        System.out.println("my contect no is "+ ph_no);
        System.out.println("my name is "+ name);
        System.out.println("my address  is "+ address);
    }

}
public class opp_01 {

    public static void main(String[] args) {
        System.out.println("details of students");
        emp uttam = new emp();
        emp ankit = new emp();
        emp alka = new emp();
        // details of ankit 
        ankit.id = 20;
        ankit.ph_no = 8757300503l;
        ankit.name = "aman";
        ankit.address = "dto";
    //    details of alka
        uttam.id = 10;
        uttam.ph_no = 8787874798l;
        uttam.address = "dandila";
        uttam.name = " uttam";
        // details of alka
        alka.id = 52;
        alka.ph_no = 87855874798l;
        alka.address = "ptaa ni";
        alka.name = " alka";
        // System.out.println(uttam.name);
        // System.out.println(uttam.id);
        ankit.printDetails();
        alka.printDetails();
        uttam.printDetails();
    }
}
