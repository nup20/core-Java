package pack1;
 class Student4{
	 Student4(int i ,String n){
		 int id=i;
		 String name=n;
		 System.out.println(id+""+name);
	 }
 }
public class parametarised {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student4 s1 = new Student4(111,"Karan");  
	    Student4 s2 = new Student4(222,"Aryan"); 
	    
	}

}
