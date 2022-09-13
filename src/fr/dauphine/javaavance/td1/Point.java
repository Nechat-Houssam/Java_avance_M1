package fr.dauphine.javaavance.td1;

public class Point {

   private int x;
   private int y;
   
   public void methode()
   {
	   Point p = new Point();
	   System.out.println(p.x+""+p.y);
   }
   
}

/* cela fonctionne car nous avons initialement créer les variables x et y.
 * ces variables sont des attributs de la classe Point
 * 
 * Point p = new Point(); permet de creer un objet de la classe Point
 * System.out.println(p.x+""+p.y) permet de print les valeurs des attributs x
 * et y de l'objet de type Point() donc cela marche.

*/

