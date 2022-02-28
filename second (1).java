
import java.util.Scanner;
abstract class example{
    abstract void fact();
    abstract void prime();
}
public class third extends example {

  Scanner sc=new Scanner(System.in);
    void fact(){
        int num,fact=1;
        System.out.println("Enter Number To Find Factorial ");
        num=sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of "+num+" is "+fact);
    }
    void prime(){
        int num;
        int c=0;
        System.out.println("Enter Number To Find Is Prime Or Not");
        num=sc.nextInt();
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                c=1;
                break;
            }
        }
        if(c==0)
        {
            System.out.println("Number Is a Prime Number");
        }
        else{
        
            System.out.println("Number Is not a Prime Number");
        }
    }
    public static void main(String arr[])
    {
        third t1=new third();
        t1.prime();
        t1.fact();
        
    }
}
