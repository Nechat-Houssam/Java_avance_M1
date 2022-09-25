package fr.dauphine.javaavance.td1;

public class Polyline {
	
	private int nombre=0;
	private final Point[] mes_points;
	
	
	
	public Polyline(int tout_p) {
		mes_points = new Point[tout_p];
	}
    
	public void add(Point p) {
		 
		mes_points[nombre++]=p;
		
		/* Q2 risque de lever une exeption , il faut
		 * catch l'exeption a l'aide d'un throw 
		 * 
		 *  
		 *  */
     }
	
	public boolean contains(Point p) {
		 for(Point point:mes_points) {
			 
		      if(point.equals(p)) {
		    	  return true;
		    	  }
	     	}
		 return false;
		 }
	
	public int pointCapacity() {
		 return mes_points.length;
	}
		
    public int nbPoints() {
		 return nombre;
		 }

}

/*
 * 5 si NUll est donné sa ne marche plus et des eception sont
 * levées
 * */
