package Pc_1;
import java.util.*;
public class EmpWageProbUg2 {

	public static void main(String[] args) {
		
		int wrokingHr=8;
		int rateperHr=20;
		int salary=0;
		int n=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Pls enter the working days");
		int a=s.nextInt() ;
		
		for(int i=0;i<a;i++)
		{
			double isPresent = Math.random();
			System.out.println(isPresent);
        /*
         * 1)Print Statement that employee is present
         */
        if (isPresent <0.4)
        {
          
            System.out.println("Employee is present");
            salary=salary+wrokingHr*rateperHr;
            n++;
        }
       
        /*
         * 2)Print Statement that employee is Absent
         */
        else 
        {
            System.out.println("Employee is Absent");
        }
		}
		
		System.out.println("No of days work is "+n+" and Total Salary is = "+salary);
		s.close();
		System.out.println("Done");
	}

}
