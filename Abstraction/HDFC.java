
public class HDFC implements Bank {

	@Override
	public void moneytransfer() {
		System.out.println("money transfer.....");
		
	}

	@Override
	public void checkbalance() {
		System.out.println("checking balance.....");
		
	}

	public static void main(String []args)
	{
//		Bank b=new Bank();if the class does not contain constructor we can not create obj
		HDFC b= new HDFC();
		b.checkbalance();
		b.moneytransfer();
	}
}
