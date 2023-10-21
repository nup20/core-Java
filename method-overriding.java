package overiding;
class RBI{
	boolean checkeligibility(){
		return true;
	}
	double homeloanRofi(){
		return 10.85;
	}
	double personalloanRofi(){
		return 11.65;
	}
}

class SBI extends RBI{
	
	double homeloanRofi(){
		return 12.85;
	}
	 public void applyhomeloan(){
		 boolean status =checkeligibility();
	if(status){
		double l=homeloanRofi();
		System.out.println("approved"+l);
		 
	}else{
		System.out.println("not eligible");
	}
	
	
		
	}
	
	
}
public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      SBI b=new SBI();
      b.applyhomeloan();
//      System.out.println(msg);
      }

}
