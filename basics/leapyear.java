package operators;

import java.util.Scanner;

public class leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc= new Scanner(System.in);
  
   System.out.println("Enter year");
   int a=sc.nextInt();
   
   if(a%4==0){
	   System.out.print("leap year="+a);
   }
		
		
	}

}
