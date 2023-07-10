package package1;

class  Add
{
 int number;
 int number1;
 Add (int first,int second)
 {
     number = first;
     number1 =second;
 }
 public void addition()
 {
  int sum = number + number1; 
 }
 public void display()
 
 {
     
	//String sum = null;
	System.out.println("Sum is" + sum);
 }
 public static void main(String args[])
 {
 Add obj= new Add (21,10);
 obj.addition();
 obj.display();
}}