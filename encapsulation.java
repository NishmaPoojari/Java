import java.util.*;
class encap
{
	Scanner sc=new Scanner(System.in);
	private int pin;
	public int acc_no;
	public void set_pin(int newval)
	{
		pin=newval;
	}
	public int get_pin()
	{
		return pin;
	}
	public void demo()
	{
		System.out.println("Enter the ccount no");
		acc_no=sc.nextInt();
	}
}
class encap_demo
{
	public static void main(String args[])
	{
		encap obj=new encap();
		obj.demo();
		System.out.println("The account no is ="+obj.acc_no);
		obj.set_pin(1111);
		System.out.println("Y
System.out.println("Your pin no is="+obj.get_pin());
		System.out.println("Your pin no is="+obj.pin);
	}
}