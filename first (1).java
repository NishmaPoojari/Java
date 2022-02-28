

import java.util.Scanner;
class user{
    String name;
    int num;
    private int balance;
      int current;
    Scanner sc=new Scanner(System.in);
    public void setbal(int val)
    {
        balance=val;
    }
    public int getbal()
    {
        return balance;
    }
    public void accept()
    {
        System.out.println("Enter Your Name:");
        name=sc.nextLine();
        System.out.println("Enter Your Account Number");
        num=sc.nextInt();
    }
    public void transaction(){
      
        System.out.println("purchase 45 Ruppess Rice 5kg");
        current=balance-(45*5);
        System.out.println("Balance After First Transaction "+current);
 System.out.println("purchase  1 shirt of price ruppess 399 ");
     current=current-399;
     System.out.println("Balance After second Transaction "+current);
     System.out.println("purchase 1 jeans of price ruppess 699 ");
     current=current-699;
     System.out.println("Balance After third Transaction "+current);
       System.out.println("purchase  mobile phone of price ruppess 16999 ");
     current=current-16999;
     System.out.println("Balance After fourth Transaction "+current);
       System.out.println("purchase  earphone of price ruppess 199 ");
     current=current-199;
     System.out.println("Balance After fifth Transaction "+current);
     
       System.out.println("purchase some grocery of price ruppess 999 ");
     current=current-999;
     System.out.println("Balance After sixth Transaction "+current);
     
        System.out.println("purchase 1 movie ticket of price ruppess 299 ");
     current=current-299;
     System.out.println("Balance After seventh Transaction "+current);
    }
    
    
}

public class first1 {
    public static void main(String arr[])
    {
        
        user u1=new user();
        u1.setbal(50000);
        u1.accept();
        u1.transaction();
        System.out.println("name: "+u1.name);
        System.out.println("account number: "+u1.num);        
        System.out.println("Intial balance: "+u1.getbal());
        System.out.println("Balance After 10 transctions: "+u1.current);
        
    }
}
