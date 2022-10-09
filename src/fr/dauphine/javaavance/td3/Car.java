package fr.dauphine.javaavance.td3;

public class Car {
	
  private final String brand;
  private final long value;
 
  public Car(String brand, long value ) {
	if (value < 0) {
  	throw new IllegalArgumentException("dois etre positif");
	}
	this.brand = brand;
	this.value = value;
  }
 
  public String getBrand() {
	return brand;
  }

  public long getValue() {
	return value;
  }
 
  @Override
  public String toString() {
	return "voiture" + this.brand + " " + this.value;
  }
 
 
 

}

