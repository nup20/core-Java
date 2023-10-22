
public class Axis implements Bank {

	@Override
	public void moneytransfer() {
		System.out.println("money transfer.....");
		
	}

	@Override
	public void checkbalance() {
		System.out.println("checking balance.....");
		
	}
	
public static void main(String arg[]){
	Axis a=new Axis();
	a.checkbalance();
	a.moneytransfer();
}
	
	
}
