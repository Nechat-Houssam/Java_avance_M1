package fr.dauphine.javaavance.td3;

public abstract class Moyen_de_transport {
  
	private Discount discount;
	private final String brand;

	public abstract int getValue();
	
	public Moyen_de_transport(String brand, Discount discount) {
    this.brand = brand;
	this.discount = discount;
	 }
	
	
	
	
	 public String get_the_Brand() {
	return brand;
	 }
	
	 public void set_the_Discount(Discount d) {
	 this.discount = d;
	 }
}
