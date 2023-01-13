import java.util.*;
import java.lang.*;
import java.io.*;

public class accio {
    public static void main(String[] args) throws java.lang.Exception {
        int N = 3;
        String stn = "dhwe";
        char C = 'W';
        // System.out.println(multiOccur( N,  stn, C));
        multiOccur(N, stn, C);

    }

    public static void multiOccur(int N, String stn, char C) {
        for (int i = 0; i < stn.length(); i++) {
            if (stn.charAt(i) == C)
                System.out.print(stn.charAt(i )+1);
            else
                System.out.print(-1);

        }
    }
}