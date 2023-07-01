package Minmax;
import java.util.Scanner;
public class Minmax {
	
	public static void main(String s[])
	{  int i,Ma,Mi,a[]={1,2,3,4,5};
		
		Scanner sc=new Scanner(System.in);
		
	
		Ma=a[0];
		 Mi=a[0];
		for( i=0;i<a.length;i++)
		{ 
			if(Ma<a[i])
			Ma=a[i];
			
			if(Mi>a[i])
			Mi=a[i];
		}
		
		
		System.out.println("Maximum value is="+Ma);
		System.out.print("Maximum value is="+Mi);
		
		
		}
	}


