public class Reverse{  


int num;

public Reverse(int num)
{
    this();
    this.num=num;
    int reverse = 0;
    while (num != 0) {
    
    reverse = reverse * 10 + num % 10;
    System.out.println("the reverse of given number is"+reverse);
   
}
}

public Reverse()
{
    
    System.out.println("finding revrse");
}

public static void main(String args[])
{  
Reverse obj =new Reverse(68768);  

}}

