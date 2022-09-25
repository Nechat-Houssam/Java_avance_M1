package fr.dauphine.javaavance.td1;

public class Circle {
	
	private final Point center;
	private final int radius;
	
	public Circle(Point p, int rad) {
	
		 this.center = p; //copie defensive
		 this.radius = rad;
		 }
	
	@Override
	public String toString() {
		 return center.toString() +""+ center);
	}
	
	


}
