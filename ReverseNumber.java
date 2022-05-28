import java.util.Scanner;
class ReverseNumber{

int number;

public ReverseNumber(int number){
	
	this.number=number;
	}
public int getreverse(){
	
	int rev=0;
	while(number!=0){
		
		rev=rev*10+number%10;
		number=number/10;
		
	}
	return rev;
		}
	 public static void main(String[]args){
		 
		 int num;
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter any number:");
		 num=sc.nextInt();
		 ReverseNumber obj=new ReverseNumber(num);
		 
		 int reverse=obj.getreverse();
		 System.out.println("Reverse of"+num+"is:"+reverse);
		 
		 
		 
		 }

	 
	 }