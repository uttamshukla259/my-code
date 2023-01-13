class game {
    public void hit() {
        System.out.println("hitting the enemy");
    }
    public void run() {
        System.out.println("running from the  enemy");
    }
    public void fir() {
        System.out.println("firing the enamy");
    }
}
public class harry_05 {
    public static void main(String[] args) {
        game tommy = new game();
            tommy.hit();
            tommy.fir();
            tommy.run();

         
    }
}
