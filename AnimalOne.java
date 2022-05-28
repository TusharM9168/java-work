class Animal {
	
protected String name;
protected int age;

public void setDetails(String name, int age) {
	this.name = name;
	this.age = age;
}	
}

 class Cat extends Animal {

public void displayDetails() {
	System.out.println("Cat Name:"+name);
	System.out.println("Cat Age:"+age);
}
}

 class Dog extends Animal{


public void displayDetails() {
	System.out.println("Dog Name:"+name);
	System.out.println("Dog Age:"+age);	
}
}

 class AnimalMain {
	public static void main(String[]args) {
	Cat cat=new Cat();
	cat.setDetails("Munni",1);
	cat.displayDetails();
	
	Dog dog=new Dog();
	dog.setDetails("Rocky",3);
	dog.displayDetails();
}
}