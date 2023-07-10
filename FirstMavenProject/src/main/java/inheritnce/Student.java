package inheritnce;

public class Student {

	
	int name;
	Address1 a;
	public void display(String name,Address1 a2)
	{
		System.out.println("Name is "+name);
		System.out.println("Address with rollno " +a.address1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Student s = new Student();
	Address1 a = new Address1(1,"cc");
	s.display("lind",a);
			
	
	
	}

}
