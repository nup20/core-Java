package program1;
class D{
	D(){
		this(2);//calling the parameterized constructor from default constructor
		System.out.println( "hello a");
		}
	D(int a){
		
		System.out.println(a);
		
		
	}
}
public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D d=new D();
		

	}

}
