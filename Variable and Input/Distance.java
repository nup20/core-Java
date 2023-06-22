import java.util.Scanner;

public class Distance
{
double inch, meter;


void setData()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Distance in Inch:");
inch=Double.parseDouble(sc.nextLine());

}
void getData()
{
meter=(inch*0.0254);
System.out.print(inch+"inch is ");
System.out.print(meter+"meters");

}
}



