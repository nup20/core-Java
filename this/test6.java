package program1;
class E{
	int roll;
	String name,course;
	float fee;
	E(int roll,String name,float fee){
		this.roll=roll;
		this.name=name;
		this.fee=fee;
		
	}
	E(int roll,String name,float fee,String course){
		this.course=course;
		this( roll, name, fee);
		
	}
	void Student(){
		System.out.println(roll+"\n"+name+"\n"+fee+"\n"+course+"\n");
	}
}
public class test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E n=new E(1,"neha",58000,);
		n.Student();
		

	}

}
