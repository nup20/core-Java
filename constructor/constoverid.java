package pack1;
class Student5{
	 Student5(int i ,String n){
		 int id=i;
		 String name=n;
		 System.out.println(id+" "+name+" ");
	 }
	 Student5(int i ,String n,String ad){
		 int id=i;
		 String name=n;
		String k=ad;
		 System.out.println(id+" "+name+" "+ad);
	 }
}
public class constoverid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
				Student5 s1 = new Student5(111,"Paco","nagpur");  
			    Student5 s2 = new Student5(222,"Aryan","nagpur"); 
	}

}
