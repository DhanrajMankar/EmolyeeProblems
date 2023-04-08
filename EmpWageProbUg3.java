package Pc_1;
import java.util.*;
public class EmpWageProbUg3 {

	public static void main(String[] args) {
		
		int fullWrokingHr=12;
		int partWrokingHr=8;
		int rateperHr=20;
		int salary=0;
		int n=0;
		int n1=0;
		int n2=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Pls enter the working days");
		int a=s.nextInt() ;
		
		for(int i=0;i<a;i++)
		{
			double isPresent = Math.random();
			System.out.println(isPresent);
       
        if (isPresent >0.6)
        {
          
            System.out.println("Employee is present");
            salary=salary+fullWrokingHr*rateperHr;
            n++;
        }
       
      
        else if (isPresent <0.6 && isPresent >0.3) 
        {
        	System.out.println("Employee is present for part time ");
            salary=salary+partWrokingHr*rateperHr;
            n1++;	
        }
        else 
        {
            System.out.println("Employee is Absent");
            n2++;
        }
		}
		
		System.out.println("No of full time working days is = "+n);
		System.out.println("No of Part time working days is = "+n1);
		System.out.println("No of working days the employee is absent = "+n2);
		System.out.println("Total Salary for all ays = "+salary);
		s.close();
		System.out.println("Done");	
	}

}
