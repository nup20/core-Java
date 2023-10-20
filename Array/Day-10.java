
public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int arr[]={76,35,621,87,92,66,1};
		int j=0,s=0;
	
		for(int i=0;i<arr.length;i++){
				j=arr[0];
				if(arr[i]<j){
					
					j=arr[i];
					}
					}
		for(int i=0;i<arr.length;i++){
			j=arr[0];
			if(arr[i]>s){
				
				s=arr[i];
				}
				}
		
		
		System.out.println("smallest no:"+j);
		System.out.println("smallest no:"+s);
	}
		}

