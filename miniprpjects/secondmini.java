package miniproject2;

import java.util.Scanner;


class  Student{
	int roll,A,B,C;
	void fun()
	{
		
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<=8; i++)
		{
			for( i=0; i<=8; i++)
			{
			System.out.print("Enter Roll number :");
			roll =sc.nextInt();
			System.out.print("Enter First subject Marks :");
			A = sc.nextInt();
			System.out.print("Enter second subject marks:");
			B= sc.nextInt();
			System.out.print("Enter third subject marks :");
			C = sc.nextInt();
			int avg = (A +B + C)/3 ;
			System.out.println("Student Roll No "+roll); 
			System.out.println("Student Avarage mark "+avg);
			System.out.println("\n ");

	}
	}
}
}
public class secondmini {

	public static void main(String[] args) {
		Student s=new Student();
        s.fun();

	}

}
