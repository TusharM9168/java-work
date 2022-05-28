class SwapTest{

public void swapValues(int num1, int num2){
	
	System.out.printf("Before Swap:num1:%d\tnum2:%d",num1,num2);
	
	int temp=num1;
	num1=num2;
	num2=temp;
	
	System.out.printf("After Swap:num1:%d\tnum2:%d",num1,num2);
	
}

public void swapValues(char ch1, char ch2){
	
	System.out.printf("Before Swap:ch1:%d\tch2:%d",ch1,ch2);
	
	int temp=ch1;
	ch1=ch2;
	temp=ch2;
	
	System.out.printf("After Swap:ch1:%d\tch2:%d",ch1,ch2);
	
}

public static void main(String[]args){
	
	SwapTest obj=new SwapTest();
	obj.swapValues(40,20);
	obj.swapValues('a','b');
		
}

}