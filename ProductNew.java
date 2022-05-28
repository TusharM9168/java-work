class ProductNew{
	
 int productId;
 String productName;
 int productPrice;

 public ProductNew(int pId, String pName, int pPrice){
	 
	 this.productId=pId;
	 this.productName=pName;
	 this.productPrice=pPrice;
	 
 }

    void display(){
		
		System.out.println("Product Id:"+productId);
		System.out.println("Product Name:"+productName);
		System.out.println("Product Price:"+productPrice);
		
	}
	
	public static void main(String[]args){
		
		ProductNew p1=new ProductNew(10,"Book",500);
		p1.display();
		
		ProductNew p2=new ProductNew(11,"Notebook",1000);
		p1.display();
		
	}
	

	
	
	
}