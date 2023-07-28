package thirdmini;
import java.util.Scanner;
class BankAccount{
	String name;
	String Addressofdepositor;
	String Typeaccount;
	Double Balanceacc;
	Double Numbertransactions;
	
	Scanner sc= new Scanner(System.in);
	
	void EDetails()
	{System.out.println("Enter the Name=");
	name=sc.nextLine();
	System.out.println("1.Current Account :\n2.Saving Account\n Enter Account Type=");
	Typeaccount=sc.nextLine();
	System.out.println("Enter Opening Balance=");
	Balanceacc=Double.parseDouble(sc.nextLine());
		
	}
	
	void Withsdrawl
	
}
public class class3 {

	public static void main(String[] args) {
	BankAccount B=new BankAccount();
		System.out.println("++++++++++++Welcome to  Bank++++++++++++");
		B.EDetails();
		
		
		
	}

}


