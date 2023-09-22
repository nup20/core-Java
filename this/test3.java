package program1;
class A{
	
	A()
	{
		
	}
	 void fun1(){
		System.out.println(" hello");	
		}
	void fun2(){
		System.out.println("Hello");	
		this.fun1();
		}
	
}

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		a.fun1();
		a.fun2();

	}

}
