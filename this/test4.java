package program1;
class C{
	C(){
		System.out.println("hii a ");
		
	}
	C(int a){
		this();//be the first statement in constructor
		       //calling default constructor
		System.out.println(a);
		
		}
	
}
public class test4 {

	public static void main(String[] args) {
		C c=new C(20);
		
		
		

	}

}
