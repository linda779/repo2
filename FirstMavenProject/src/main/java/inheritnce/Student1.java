package inheritnce;



public class Student1 {

	
	int name;
	Address1 a;
	public void display(String name,Address1 a)
	{
		System.out.println("Name is "+name);
		System.out.println("address with rollno: "+a.address1+"   "+a.rollno);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Student1 s = new Student1();
	Address1 a = new Address1(1,"kerala");
	s.display("lind",a);
			
	
	
	}

}
