package Ab;

abstract class Bank{
	public abstract void getbalance();
		
	
}

class BankA extends Bank{

	@Override
	public void getbalance() {
		// TODO Auto-generated method stub
		
			System.out.println("Deposite ammount:$100");
		
	}
	
}

class BankB extends Bank{

	@Override
	public void getbalance() {
		// TODO Auto-generated method stub
		System.out.println("Deposite ammount:$150");
	}

}

class BankC extends Bank{

	@Override
	public void getbalance() {
		// TODO Auto-generated method stub
		System.out.println("Deposite ammount:$200");
	}

	
}
public class Abb2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankA B1=new BankA();
		BankB B2=new BankB();
		BankC B3=new BankC();
		
		B1.getbalance();
		B2.getbalance();
		B3.getbalance();

	}

}
