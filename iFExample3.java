package IFElseStatement; 
import java.util.Scanner;
public class iFExample3 {
 
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter basic salary: ");
		 int basicSal = sc.nextInt();
		 System.out.println("Enter sales salary: ");
		 double sales = sc.nextDouble();
		 double commission ; 
		 if( sales < 500.00 )
			 commission = 0;
		 else 
			 commission = (sales / 100)* 15;
		 
		 double salary = basicSal + commission;
		 System.out.println("Final Salary = " + salary);
			 
		 
			 
		 
		 

	}

}
