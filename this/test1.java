package program1;

 class Student
 {
	 int roll;
	 String name;
	 double phno;
	 
	 Student(int roll,String name ,double phno)
	 { this.roll=roll;
	 this.name=name;
     this.phno=phno;
		 
	 }
	 void classroom() 
	 {
		 System.out.println(roll+"\n"+name+"\n"+phno);		 
		 
	 }
	 
 }
public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(11,"neha",890789);
		s1.classroom();
		

	}

}
