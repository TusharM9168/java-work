class MyBase{

    void display()
   //public void display()
   //protected void display();
   //private void display()
   {
	   
	   System.out.println("Display from MyBase");
	   
	}
}

class Derive extends MyBase{
	
	void show()
	//public void show()
	//protected void show()
	//private void show()
	{
		
		
		 System.out.println("Show from Derive");
	   
	   
	}
	
}

class InhDemo1{
	
	public static void main(String[]args){
		
		Derive derive=new Derive();
		derive.display();
		derive.show();
		
		
		
	}
	
	
	}