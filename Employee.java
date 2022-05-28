class Employee{
	
	private int empId;
	private String empName;
	private float empSalary;

public void setEmpId(int id){
	empId=id;
}
public int getEmpId(){
	return empId;
}
public void setEmpName(String name){
	empName=name;
}
public String getEmpName(){
	return empName;
}
public void setEmpSalary(float salary){
	empSalary=salary;
}
public float getEmpSalary(){
	return empSalary;
}	
	
}

class EmployeeApp{
	public static void main(String[]args){
		
		Employee emp;
		emp=new Employee();
		
		int id=emp.getEmpId();
		String name=emp.getEmpName();
		float salary=emp.getEmpSalary();
		
		System.out.printf("ID:%d\tName:%s\tSalary:%f",id,name,salary);
		
		emp.setEmpId(100);
		emp.setEmpName("Tushar");
		emp.setEmpSalary(100000.0f);
		
		System.out.print("ID:"+emp.getEmpId());
		System.out.print("\tName:"+emp.getEmpName());
		System.out.println("\tSalary:"+emp.getEmpSalary());
		
	}
	
	
	
	
}