
package defaul;


public class Array {

	
	public static void main(String[] args) {
		
		int i;
		int a[]=new int[]{1,2,3,4,5};
		int b[]=new int[a.length];
		System.out.println("Original Array");
		
		for(i=0;i<a.length;i++)
		{
			
			System.out.print(a[i]+" ");
		}
		
		
		System.out.println("\ncopied Array");
		
		for(i=0;i<a.length;i++)
		{                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    
			b[i]=a[i];
			System.out.print(b[i]+" ");
		}
		


	}

}
