package inheritnce;

public class Calculate extends Pay{ 
double hra;
double pf;
public void cal(){
hra = basic * 0.05 ;
pf = basic * 0.2 ;
System.out.println("hra is"+hra);
System.out.println("pf is"+pf);
}  
} 
