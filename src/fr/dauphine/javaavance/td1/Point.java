package fr.dauphine.javaavance.td1;

public class Point {

   private int x;
   private int y;
   
   public void methode()
   {
	   Point p = new Point();
	   System.out.println("("+p.x+","+p.y+")");
   }
   
   public void methode2(Point p2)
   {
	   Point p3 = p2;
	   System.out.println(p3.x+""+p3.y);
   }
   
}

/* cela fonctionne car nous avons initialement créer les variables x et y.
 * ces variables sont des attributs de la classe Point
 * Les varaible sont dans le main donc meme si elle sont
 * private cela marche quand meme
 * 
 * Point p = new Point(); permet de creer un objet de la classe Point
 * System.out.println(p.x+""+p.y) permet de print les valeurs des attributs x
 * et y de l'objet de type Point() donc cela marche.

*/

