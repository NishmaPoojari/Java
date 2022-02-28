import java.util.*;
class encap
{
	private int s1,s2,s3,s4,s5,avg;
	private char gr;
	public int roll;
	public String name;
	Scanner sc=new Scanner(System.in);
	public void set_per(int newval)
	{
			avg=newval;
	}
	public int get_per()
	{
		return avg;
	}
	public void set_gr(char newval)
	{
		gr=newval;
	}
	public char get_gr()
	{
		return gr;
	}
	public void acc()
	{
		System.out.println("Enter your roll no");
		roll=sc.nextInt();
		System.out.println("Enter Your name");
		name=sc.next();
		System.out.println("Enter marks of sub1");
		s1=sc.nextInt();
		System.out.println("Enter marks of sub2");
		s2=sc.nextInt();
		System.out.println("Enter marks of sub3");
		s3=sc.nextInt();
		System.out.println("Enter marks of sub4");
		s4=sc.nextInt();
		System.out.println("Enter marks of sub5");
		s5=sc.nextInt();
	}
	public void calc()
	{
		avg=(s1+s2+s3+s4+s5)/5;
		if(avg>=90 &&avg<=100)
		{
		gr='O';	
		}
		else if(avg>=75 && avg<90)
		{
			gr='A';
		}
		else if(avg>=60 && avg<75)
		{
			gr='B';
		}
		else if(avg>=50 && avg<60)
		{
			gr='C';
		}
		else if(avg>=35 && avg<50)
		{
			gr='D';
		}
		else
		{
			gr='F';
		}
	}
}
class encap_demo
{
	public static void main(String args[])
	{
		encap obj=new encap();
		obj.set_per(0);
		obj.set_gr('z');
		obj.acc();
		obj.calc();
		System.out.println("Your Name is ="+obj.name);
		System.out.println("Your Roll No is ="+obj.roll);
		System.out.println("Your Percentage is ="+obj.get_per());
		System.out.println("Your Grade is ="+obj.get_gr());
	}
}