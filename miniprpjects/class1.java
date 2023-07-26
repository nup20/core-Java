package class1;
//secondmini
import java.util.Scanner;
class Worker
{String  name;
int Salary;
int date;
	 
	void fun()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Details of 3 worker:");
		
		
		
		
		for(int i=0;i<=10;i++)
		{ 
			
			System.out.println("\nEnter name:");
			String name[]=new String [10];
			name [i]=sc.nextLine();
			
			
			System.out.println("Enter salary:");
			String Salary[]=new String [10];
			Salary [i]=sc.nextLine();
			
			
			System.out.println("Enter date:");
			String date[]=new String[10];
			date [i]=sc.nextLine();
			
			
			System.out.println("Name"+name[i]);
			System.out.println("salary"+Salary[i]);
			System.out.println("Date"+date[i]);
	}
		
}
		
		
	}
	
public class class1 {

	public static void main(String[] args){
		Worker w=new Worker();
		w.fun();
	}
}


