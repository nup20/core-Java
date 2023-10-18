import java.util.Scanner;

public class Array1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int a[]={1,66,62,78,36,52,15};
		int even=0;
		int odd=0;
		for(int i=0;i<a.length;i++){
			
			if(i%2==0){
				 even += a[i];
				 
				}
			else
		{
				odd += a[i];
		}
		

			System.out.println(even);
			System.out.println(odd);
		
	}

	}
}

