package Pc_1;
import java.util.*;
public class EmpWageProbUg6 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in); 
		Random r = new Random();
		System.out.println("Pls enter the total working month");
		
		int fullWrokingHr=12;
		int partWrokingHr=8;
		int rateperHr=20;
		int totalWorkingHr=0;
		int salary=0;
		int n=0;
		int n1=0;
		int n2=0;
		
		int a=s.nextInt() ;
		int a1=a*30;
	   
		boolean b ; 
		boolean b1;
		
		for(int i=0;i<a1;i++)
		{
			b= n!=20 && n>20;
			b1=b|| totalWorkingHr>=100;
			
			if (b1) {
				System.out.println("Condition is meet for loop break at iteration = "+i);
				System.out.println("Total Working Hr = "+totalWorkingHr);
				break;
			}
			double isPresent =  Math.random()*4;
			int p= (int) isPresent;
			
			int p1=r.nextInt(3)+1;
			int expression=p1;
			
			System.out.println(p);
			switch (expression)
			{
			case 1:
				System.out.println("Employee is present");
				totalWorkingHr=totalWorkingHr+fullWrokingHr;
                salary=salary+fullWrokingHr*rateperHr;
                n++;
			break;
			
			case 2:
				System.out.println("Employee is present for part time ");
				totalWorkingHr=totalWorkingHr+partWrokingHr;
	            salary=salary+partWrokingHr*rateperHr;
	            n1++;
	        break;
	        
			case 3:
				System.out.println("Employee is Absent");
	            n2++;
	        break;
	        
			 }
       
		  }
		System.out.println("No of full time working days is = "+n);
		System.out.println("No of Part time working days is = "+n1);
		System.out.println("No of working days the employee is absent = "+n2);
		System.out.println("Total Salary for "+a+" MONTH = "+salary);
		s.close();
		System.out.println("Done");

	}
}

