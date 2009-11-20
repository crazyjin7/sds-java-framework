package ch08.product;

public class Product {
	
	private String productId;
	private String productName;
	private String description;
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public String toString(){
		return "productId ["+productId+"]\tproductName["+productName+"]\tdescription["+description+"]";
	}


}
