
public class Bankdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Bank b;
            b=new Axis(); //sorting implementation obj into ref variable.
            
            b.checkbalance();
            b.moneytransfer();
            
            b=new HDFC();
            
            b.checkbalance();
            b.moneytransfer();
	}

}
