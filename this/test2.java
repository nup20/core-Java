package program1;
class All{
	int roll;
	String name,course;
	double phno;

	
	All(int r,String s,double p,String c)
	{roll=r;
	name=s;
	phno=p;
	 course=c;
		
	}
	void fun()
	{
		System.out.println(roll+"\n"+ name +"\n"+phno);
	}
}
public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        All f=new All(9,"neha",67890);
        All n=new All(90,"nehhhha",69065,"cpp");
        f.fun();
        n.fun();
        
	}

}
