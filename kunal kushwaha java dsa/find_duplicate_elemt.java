
import java.util.*;

public class find_duplicate_elemt {
	 
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n != 0) {
			n *= n - 1;
			 System.out.println(n);
		}
		
	}
}