import java.util.Scanner;

public class Time
{

 
public static void main(String s[])
{
int Tm,Y,D;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Minues:");
Tm=Integer.parseInt(sc.nextLine());
Y=(Tm/512640);
D=((Tm/60/24)%365);

System.out.println(Tm+"minutes is approximately "+Y+" Years and "+D+" days");

}



 
}


