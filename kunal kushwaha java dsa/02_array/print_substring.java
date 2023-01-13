public class print_substring {
    public static void main(String[] args) {
        
        String s = "uttam shukla";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++)
             {
                System.err.println(s.substring(i,j));
                if(isPelindrom(s)==true){
System.err.println(s);
                }
            }
        }
       
    }
    
    public static boolean isPelindrom(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);
            if (ch1 != ch2) {
                return false;

            }
            else {
                j--;
                j++;
            }
        }
            return true;
        }
}
