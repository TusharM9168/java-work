class Person {

  protected String name;
  protected int age;
  
  public Person(String name,int age){
	  
	  this.name=name;
	  this.age=age;
	  
	  System.out.println("Person constr called");
	  
	  }

	 }
	 
	 
class Employee extends Person{
	
	protected int empcode;
	
  public Employee(int empcode,String name,int age){
	  
	  super(name,age);// It will call parametrized Constr..
	  this.empcode=empcode;
	  
	  System.out.println("Employee constr called");

	  }
	  
	  public void displayEmployee(){
		  
		  System.out.println("Employee Details are:");
		  System.out.println("Employee Code:"+empcode);
		  System.out.println("Name:"+name);
		  System.out.println("Age:"+age);
		  
		  }
	}

	class Specialist extends Employee{
		
		private String specialization;
		
		
	public Specialist(String specialization,int empcode,String name,int age){
		
		super(empcode,name,age);
		this.specialization=specialization;
		
		System.out.println("Specialist Constr called");
		
		}
		public void displaySpecialist(){
			
			System.out.println("Specialist details are:");
			System.out.println("Employee Code:"+empcode);
			System.out.println("Name:"+name);
			System.out.println("Age:"+age);
			System.out.println("Specialization:"+specialization);
		}
		
		
		
		
	}
	
	 class InheritanceDemo2{
		
		public static void main(String[]args){
			
			Employee emp=new Employee(100,"Tushar",26);
			emp.displayEmployee();
			
			Specialist sp=new Specialist("Programmer",101,"Tushar1",26);
			sp.displaySpecialist();
			
		}
		
		
	}




	