
import java.util.Scanner;
class AnimalLeg{

private int totalLegs;

public void setAnimalLeg(int chickens, int cows, int pigs){
	
	totalLegs=2*chickens+4*cows+4*pigs;
	
}
public void displayTotalLegs(){
	
	System.out.println("TotalLegs:"+totalLegs);	
}

public void displayTotalLegs(){
	
	System.out.println("TotalLegs:"+totalLegs);	
}

}

// git new branch testing
// git new branch testing
// git new branch testing

class AnimalMain{
	public static void main(String[]args){
		
		AnimalLeg obj=new AnimalLeg();
		Scanner sc=new Scanner(System.in);
		
		int chicken,cow,pig;
		
		System.out.println("Input chicken value");
		chicken=sc.nextInt();
		
		System.out.println("Input cow value");
		cow=sc.nextInt();
		
		System.out.println("Input pig value");
		pig=sc.nextInt();
		
		
		obj.setAnimalLeg(chicken,cow,pig);
		obj.displayTotalLegs();
		
	}
	
	
	
}