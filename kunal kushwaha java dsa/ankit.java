import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
        public static int diffPossible(int[] A, int k) {
                // Write your code here
                int n = A.length;
                Arrays.sort(A);
                for (int i = 0; i < n - 1; i++) {
                        for (int j = i + i; j < n; j++) {
                                if (A[j] - A[i] == k)
                                        return 1;
                        }
                }
                return 0;
        }
}

public class ankit {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int[] A = new int[n];
                for (int i = 0; i < n; i++)
                        A[i] = sc.nextInt();
                int k = sc.nextInt();
                Solution Obj = new Solution();
                System.out.println(Obj.diffPossible(A, k));
        }
}