package pack1;
class Student6{  
    int id;  
    String name;  
    //constructor to initialize integer and string  
    Student6(int i,String n){  
    id = i;  
    name = n;  
    }  
    //constructor to initialize another object  
    Student6(Student6 s){  
    id = s.id;  
    name =s.name;  
    }  
    Student6(){  
     
      String name;
      
  
        }  
    void display(){System.out.println(id+" "+name);}  
}
public class copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Student6 s1 = new Student6(111,"paco");  
		    Student6 s2 = new Student6(s1);  
		    Student6 s3 = new Student6();  
		    s1.display();  
		     s3.name=s1.name;
		    s2.display();  
		    s3.display();  

	}

}
