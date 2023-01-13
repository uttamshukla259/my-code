public class All_About_Strings {
    public static void main(String[] args) {
        // String s = "my name is uttam shukla";
        // // int str = s.length();
        // for (int i = 0; i < s.length(); i++) {
        //     System.out.print(s.charAt(i));
        //  System.out.print(s.length());
        // }
        StringBuilder sb = new StringBuilder("uttam");
        System.out.println(sb);
        char ch = sb.charAt(2);
        System.out.println(ch);
        sb.append('s');
        System.out.println(sb);
        sb.insert(2, 'f');
        System.err.println(sb);
        sb.deleteCharAt(5);
        System.err.println(sb);
        sb.setCharAt(3, 'u');
        System.err.println(sb);
    }
}
