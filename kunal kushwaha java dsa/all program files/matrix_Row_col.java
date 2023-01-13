import java.util.*;
public class matrix_Row_col {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
    //    int n = sc.nextInt();
    //    int m = sc.nextInt();
    int mat[][] = { { 5, 8, 7 }, { 8, 5, 9 }, { 8, 5, 2 } };
    int n = mat.length;
       for (int i = 0; i < n; i++) {
           int sumOfn = 0;
           for (int j = 0; j < n; j++) {
               sumOfn += mat[i][j];
           }
           System.out.println("row =" + (i+1)+ sumOfn);
       }
       for (int i = 0; i < n; i++) {
           int sumOfm = 0;
           for (int j = 0; j < n; j++) {
               sumOfm += mat[j][i];
           }
           System.out.println("col =" + (i+1) + sumOfm);
       }
   } 
}
