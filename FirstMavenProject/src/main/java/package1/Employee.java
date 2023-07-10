package package1;

public class Employee {
	
	int id;
	String name;

Employee (int employeeid1 ,String employeename1)	
{
	id=employeeid1;
	name=employeename1;

}

public void display()
{
	System.out.println("Employee id is" + id);
	System.out.println("Employee name is" + name);
}
	
	
public static void main (String[] args)
		{
	Employee obj =new Employee(1,"linda");
	obj.display();
	
		}

}
