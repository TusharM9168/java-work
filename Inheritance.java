class MyBase{
    //Static initializer block
	static{
		System.out.println("static block from Mybase");
	}	
	//Constructor
	public MyBase(){
		System.out.println("Constr  from Mybase");
	}
	//Non-static block
	{
		System.out.println("Non-static block from Mybase");
	}

}
class Derive extends MyBase{

	static{
		System.out.println("static block from Derive");
	}	
	public Derive(){
		System.out.println("Constr  from Derive");
	}
	//Non-static block
	{
		System.out.println("Non-static block from Derive");
	}
}
class InheritanceDemo3{	
	public static void main(String[]args){
		Derive derive=new Derive();
	}	
}
