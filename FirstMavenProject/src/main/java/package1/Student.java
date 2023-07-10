import java.util.Scanner;
package package1;

public class Student {

	int id;
	String name;
	static String collegename ="abc";
	public void Details()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter student name");
	String name=sc.nextLine();
	System.out.println("Enter student id");
	int id=sc.nextInt();
	}
	public void display()
	{
		System.out.println(" student name is "+name);	
		System.out.println(" student id is "+id);	
		System.out.println(" student college is "+collegename);	
	}
	
	public static void ChangeCollege()
	{
		collegename ="xyz";
	}
	
	
	public static void main(String[] args) {
		Student.ChangeCollege();
		Student obj = new Student();
		obj.Details();
		obj.display();
		

	}

}
