class rectangle {
    int length;
    int width;

    public int Arectangle() {
        return 2* (length + width);
    }
}
public class harry_04 {
    public static void main(String[] args) {
        rectangle rect = new rectangle();
        rect.length = 3;
        rect.width = 4;
        System.out.println(rect.Arectangle());
    }
}
