package loops;

import java.util.Scanner;

public class itrate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the no =");	
		boolean a=true;
		int b=sc.nextInt();
		while( a==true){
		for(int i=1; i<=b;i++)
		{
			System.out.print(i+",");
		}
		
		for(int i=1; i<=b;)
		{
			System.out.print(i+",");
		}
		
		
		a=false;
		}
	
	}

}
