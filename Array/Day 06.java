package Duplicate;

public class Duplicate {

	public static void main(String[] args) {
		
				int a[]= {1,2,3,4,1};
				int i,j;
			     for( i=0;i<a.length;i++)
			     {
			    	 for( j=i+1;j<a.length;j++)
				     {
			    			if(a[i]==a[j])
			    			{
			    		    System.out.println("Double Element="+a[i]);
				              }
			    	}
			    	 
			     }
			     
			     

	}

}
