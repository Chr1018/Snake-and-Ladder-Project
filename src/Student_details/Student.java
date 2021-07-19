package Student_details;

public class Student // Parent Class in Package :Student_details
{
	public  String name;
	public  String USN;
	public  String Department;
	public  String title;
	public  String cname;
	public  int sem;
	public  char section;
	
	public Student()    //Default Constructor
	{
	 name="Chandan HR";
	 title="Snake And Ladder Project";
	 USN="4NI19IS024";
	 Department="Information Science";
	 sem=4;
	 section='B';
	 cname="The National Institute Of Engineering";
	}
	
	 public Student(Student object)  //Constructor Overloading Taking Object as parameter
	{
	 name=object.name;
	 title=object.title;
	 USN=object.USN;
	 Department=object.Department;
	 sem=object.sem;
	 section=object.section;
	 cname=object.cname;
	
	}


}
