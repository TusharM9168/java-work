class SavingAccount{

  public static float annualInterestRate;
  private float savingsBalance;
  public float monthlyInterest;
  
  
  public SavingAccount(float rate,float balance){
	  
	  this.annualInterestRate=rate;
	  this.savingsBalance=balance;
	  
  }
   public void calculateMonthlyInterest(){
	   
	   monthlyInterest=(savingsBalance*annualInterestRate)/12;
	  
	  
   }
	   
	   void display(){
		   
		   System.out.println("savingsBalance:"+(monthlyInterest+savingsBalance));
	   }

  }
  
  class SavingAccountMain{
	  
	 public static void main(String[]args){
		 
		 SavingAccount saver1=new SavingAccount(4,2000);
		 SavingAccount saver2=new SavingAccount(4,3000);
		 SavingAccount saver3=new SavingAccount(5,2000);
		 SavingAccount saver4=new SavingAccount(5,3000);
		  
		 saver1.calculateMonthlyInterest();
		 saver2.calculateMonthlyInterest();
		 saver3.calculateMonthlyInterest();
		 saver3.calculateMonthlyInterest();
		 
		 saver1.display();
		 saver2.display();
		 saver3.display();
		 saver4.display();
	 }
	  
	   
  }