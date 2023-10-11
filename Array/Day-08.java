package multidimension;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[][]=new int[2][2];
arr [0][0]=100;
arr [0][1]=200;
arr [1][0]=300;
arr [1][1]=400;
for(int []a:arr){
	for(int x:a){
		System.out.println(x);
	}
}
	}

}
