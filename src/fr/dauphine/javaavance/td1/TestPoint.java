package fr.dauphine.javaavance.td1;

public class TestPoint {
    
	   private int x;
	   private int y;
	   
	   public void methode()
	   {
		   Point p = new Point();
		   System.out.println(p.x+""+p.y);
	   }
}

/*  
 * Q2 les variables en privates sont maintenant inacessibles donc
 * sa ne marche plus 
 * 
 * Q3 cela sert a bien séparer la classe avec les autres classes du projet
 * 
 * Q4 l'acesseur est une methode permet d'acceder en lecture et en ecriture a une classe
 *    (aux elements de la classe)
 * 
 * Q5 cela ne compile pas
 * 
 * Q6 cela equivaut a mettre une variable dans une variable, il faudrait ajouter un this.x
 * 
 * Q7 il faut une varaible static pour compter ainsi qune methode elle aussi static
 * 
 * Q8 un des constructeur prend un element en parametre tandis que lautre non
 * 
 * 
 * 
 *
 * */
 */