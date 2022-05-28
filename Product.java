class Product{
	
	private int pId;
	private String pName;
	private String pBrand;
	private float pPrice;
	
	public void setProductData(int pId,String pName,String pBrand,float pPrice){
		
		this.pId=pId;
		this.pName=pName;
		this.pBrand=pBrand;
		this.pPrice=pPrice;
		
	}
	
	public void displayProductDetails(){
		
		System.out.println("ProductDetails:");
		System.out.printf("ID:%d\tBrand:%s\tName:%s\tPrice:%f",pId,pBrand,pName,pPrice);
		
	}
	
	
}

class ProductAppMain{
	
	public static void main(String[]args){
		
		Product p1=new Product();
		p1.setProductData(100,"mobile",10000.0f,"Samsung");
		p1. displayProductDetails();
		
		
		
	}
	
	
	
}
