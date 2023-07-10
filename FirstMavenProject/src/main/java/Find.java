
public class Find{
    int num,fact;
 
public  void display(int num)
{
this.num = num;
System.out.println("finding factorila of "+num);   
System.out.println("factorial of num is "+factorial(num));   
}  
    


public int factorial(int num) 
    {
        if(num==0)
        return 1;
       else 
       fact = (num*factorial(num-1));
   return fact;
    }
    
public static void main(String args[])
    {
        Find obj = new Find();
        obj.factorial(5);
  }
}