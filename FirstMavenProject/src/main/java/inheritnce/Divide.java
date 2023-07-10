package inheritnce;

class Divide extends Add
{
 
	public void addition()
    {
      System.out.println("result ");
    }

	public void check()
   
	{
      
	if( c % 2 == 0)
	{  
      
		System.out.println("divisible");
	}
   else
	
   {
   
       System.out.println("not not divisible");
   
   }}


public void division()
{
    super.addition();
	check();
}}