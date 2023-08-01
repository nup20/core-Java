package thirdmini;
import java.util.Scanner;
class BankAccount{
	String name;
	String Addressofdepositor;
	String Typeaccount;
	Double Balanceacc;
	Double Numbertransactions;
	Double D,W,T;
	int i=100;
	Scanner sc= new Scanner(System.in);
	void UniqueAccno()
	{int un;
		//while(i)
		{
			System.out.println("Enter the unique no=BA"+i);
			
		}
		i++;
			
	}
	
	void EDetails()
	{System.out.println("Enter the Name=");
	name=sc.nextLine();
	System.out.println("1.Current Account :\n2.Saving Account\n Enter Account Type=");
	Typeaccount=sc.nextLine();
	System.out.println("Enter Opening Balance=");
	Balanceacc=Double.parseDouble(sc.nextLine());
		
	}
	void Deposite()	
	{ 
	   this. Balanceacc=Balanceacc;
	   System.out.println("Enter the Deposite=");
	   D=Double.parseDouble(sc.nextLine());
	   Balanceacc+=D;
	}
	void Withsdrawl()
	{
	System.out.println("Enter the  Withsdrawl=");
	W=Double.parseDouble(sc.nextLine());
	this. Balanceacc=Balanceacc;
	Balanceacc-=W;
	}
	void Transfer()
	{
		System.out.println("Enter the  Transfer=");
		T=Double.parseDouble(sc.nextLine());
		this. Balanceacc=Balanceacc;
		Balanceacc-=T;
	}
	
	void AllDetails()
	{
		System.out.println("Enter the  Name="+name);
		System.out.println("Enter the  Uniqueno="+i);
		System.out.println("Enter the  Withdrawl="+W);
		System.out.println("Enter the  deposite="+D);
		System.out.println("Enter the  Transfer="+T);
		System.out.println("Enter the  Balance Ammount="+Balanceacc);
	}
}
public class class3 {

	public static void main(String[] args) {
	BankAccount B=new BankAccount();
		System.out.println("++++++++++++Welcome to  Bank++++++++++++");
		B.EDetails();
		B.UniqueAccno();
		B.Deposite();
		B.Withsdrawl();
		B.Transfer();
		B.AllDetails();
	}

}


