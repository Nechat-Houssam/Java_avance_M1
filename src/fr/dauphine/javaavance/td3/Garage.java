package fr.dauphine.javaavance.td3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Garage {
  private static int instances= 1;
  private List<Car> cars;
  private int id;
  int i = 0;
 
  public Garage(Car car) {
	Objects.requireNonNull(car);
	cars.add(car);
	this.id =  ++instances;
  }
 
  
  
  public Garage() {
	cars = new ArrayList<>();
	this.id =  ++instances;
  }
 
  public void add_to_Garage(Car car) {
	Objects.requireNonNull(car);
	cars.add(car);
  }
 
  public int getId() {
	return id;
  }
  
  public Car firstCarByBrand(String brand) {
	  for(Car cr: cars) {
		  i ++;
		  if(cr.getBrand() == brand)
		  {
			  return cr;
		  }
		 
	  }
	  
	  return null;
	
  }
 
  
  @Override
public String toString() {
	  StringBuilder st_build = new StringBuilder();
	  st_build.append("l'id du garage" + id);
	  
	   for(Car cr: cars) { st_build.append(cr.toString()).append("\n");}
	  
	   return st_build.toString();
	  }
 
 

}
