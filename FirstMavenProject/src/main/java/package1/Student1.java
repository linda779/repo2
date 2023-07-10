package package1;

public class Student1 {

	int rollno;
	String course,name;
	float fee;
	
	
	public Student1(int rollno, String course, String name) {
		
		this.rollno = rollno;
		this.course = course;
		this.name = name;
	}

	

	
	public Student1(int rollno, String course, String name, float fee) {
		
		this(rollno,course,name);
		this.fee = fee;
	}


	public void display()
	{
	
		System.out.println("Student name is " +name);
		System.out.println("Student course is " +course);
		System.out.println("Student id is " +rollno);
		System.out.println("Student fee is " +fee);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Student1 obj = new Student1 (1,"tech","linda");
	Student1 obj1 = new Student1 (12,"atech","alinda" ,100 );
	obj.display();
	
	obj1.display();



	


	}	

}
