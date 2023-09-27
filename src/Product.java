
public class Product {

	private String name;
	
	private double price;
	
	private int taxPerc;
	
	private double totalPrice;

	public String getPrice;
	
	
	public Product() {
		System.out.println("In constructor Product");	
	}
	
	//this.price is dat het de property is en niet de argument price
	public Product(double price) {
		this.price = price;
	}
	
	public void calculateTotalPrice() {
		totalPrice = price * taxPerc;
	}
	
	//Methode, aanroepen in Application
	public void printPrice() {
		System.out.println("Prijs = " + price);
	}
	
	//argument moet je meegeven
	public void setPrice(double newPrice) {
		if (newPrice > 0 && newPrice < 1000);
		price = newPrice;
	}
	
	public boolean isExpensive() {
		return price > 100;
	}
	
	public double getPrice() {
		return price;
	}
}
