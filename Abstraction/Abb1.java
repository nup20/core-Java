package Ab;
abstract class Parent{
	
	public abstract void method();
		
	
}

class Parent1 extends Parent{
public void method() {
		System.out.println("this is a first Subclass");
	}
}

class Parent2 extends Parent{
 public void method() {
	System.out.println("this is a first Subclass");
	}
}
public class Abb1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      Parent1 p1=new Parent1();
      Parent2 p2=new Parent2();

		
		p1.method();

		p2.method();

	}

}
