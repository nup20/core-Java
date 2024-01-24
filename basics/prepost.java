package operators;

public class prepost {

	public static void main(String args[]){ 
	int a=5;
	int b= ++a + a++ ;
	System.out.println(b);
	b=a++;
	System.out.println(a);
	
	System.out.println(b);
	
	}
	
}
