package natural.num;
import java.util.Scanner;

public class NaturalN {

	public static void main(String[] args) {
		
		 
		        int num , i = 1, sum = 0; 
		       System.out.println(" enter the number of n:");
		       Scanner scan = new Scanner(System.in);
		       num = scan.nextInt(); 
		 
		        while(i <= num) 
		        {
		            sum += i;
		            i++;
		        }
		        System.out.println("sum of the n natural number ="+sum);
	}
}
