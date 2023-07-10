
package inheritnce;
import java.util.Scanner;
public class Pay{  
int basic,ded,bonus;
void getpay(){

Scanner sc = new Scanner(System.in);
System.out.println("enter basic pay.");
basic = sc.nextInt();
System.out.println("enter deduction.");
ded = sc.nextInt();
System.out.println("enter bonus.");
bonus = sc.nextInt();
}  

}  

