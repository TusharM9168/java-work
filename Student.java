class Student{

private int rollNo;//non static , object dependent member
private String name;//non static , object dependent member
private String branch;//non static , object dependent member
private static String collegeName;// static , object independent member
private static int count=0;

public Student(){
	
	this.rollNo=1000;
	this.name="Tushar";
	this.branch="Civil";
	collegeName="CDAC";
	
	System.out.println("Default constr called");
	Student.count++;

}
public Student(int rollNo,String name,String branch){
	
	this.rollNo=rollNo;
	this.name=name;
	this.branch=branch;
	collegeName="CDAC";
	System.out.println("Parametric constr called");
	count++;
	
}

public void displayStudent(){
	
	System.out.println("Student Details");
	System.out.println("RollNo:"+rollNo);
	System.out.println("Name:"+name);
	System.out.println("Branch:"+branch);
	System.out.println("College Name:"+collegeName);
	
}
public void displayCount(){
	
	
		System.out.println("Total Student object created:"+count);
}

}// end of student class 

class StudentApp{
	
	public static void main(String[]args){
		//default object creation
		Student Student1=new Student();
		Student1.displayStudent();
		Student1.displayCount();
		
		//parametric object creation
		Student Student2=new Student(1001,"Himanshu","IT");
		Student2.displayStudent();
		Student2.displayCount();
		Student1.displayCount();
		
		Student Student3=new Student(1002,"Nilesh","Mech");
		Student3.displayStudent();
		Student3.displayCount();
		Student2.displayCount();
	    Student1.displayCount();
		
		
	}
	
	
	
}



