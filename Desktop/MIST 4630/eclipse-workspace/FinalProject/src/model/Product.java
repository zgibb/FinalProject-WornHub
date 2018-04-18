package model;

public class Product {
	
	private int idProduct;
	private String ProductName;
	private String ProductDescription;
	private double ProductPrice;
	private int Quantity;
	private String ProductImage;
	
	
	public Product(int idProduct, String productName, String productDescription, double productPrice, int quantity,
			String productImage) {
		this.idProduct = idProduct;
		this.ProductName = productName;
		this.ProductDescription = productDescription;
		this.ProductPrice = productPrice;
		this.Quantity = quantity;
		this.ProductImage = productImage;
	}


	public int getIdProduct() {
		return idProduct;
	}


	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}


	public String getProductName() {
		return ProductName;
	}


	public void setProductName(String productName) {
		ProductName = productName;
	}


	public String getProductDescription() {
		return ProductDescription;
	}


	public void setProductDescription(String productDescription) {
		ProductDescription = productDescription;
	}


	public double getProductPrice() {
		return ProductPrice;
	}


	public void setProductPrice(double productPrice) {
		ProductPrice = productPrice;
	}


	public int getQuantity() {
		return Quantity;
	}


	public void setQuantity(int quantity) {
		Quantity = quantity;
	}


	public String getProductImage() {
		return ProductImage;
	}


	public void setProductImage(String productImage) {
		ProductImage = productImage;
	}


	@Override
	public String toString() {
		return "Product [Product ID=" + idProduct + ", Product Name=" + ProductName + ", Product Description="
				+ ProductDescription + ", Product Price=" + ProductPrice + ", Quantity=" + Quantity + ", ProductImage="
				+ ProductImage + "]";
	}
	
}
