package fr.dauphine.javaavance.td3;

import java.util.ArrayList;

public class mon_main {
	
	Car a = new Car("Audi", 10000);
	Car b = new Car("BMW", 9000);
	Car c = new Car("BMW", 9000);
	Car d = a;
	
	System.out.println(a==b);
	System.out.println(b==c);
	System.out.println(a==d);
	System.out.println(a.equals(b));
	System.out.println(b.equals(c));
	System.out.println(a.equals(d));
	
	
	ArrayList<Car> list = new ArrayList<>();
	list.add(a);
	list.add(b);
	System.out.println(list.indexOf(a));
	System.out.println(list.indexOf(b));
	System.out.println(list.indexOf(c));
	System.out.println(b.equals(c));
	
	
	HashSet<Car> set = new HashSet<Car>();
	set.add(b);
	System.out.println(set.contains(c));
}

/* 
 * 1)
 * comme c et b ne sont pas le meme objet alors faux 
 * a b et c ne sont pas les meme objet
 * d et a sont le meme objet donc true
 * 
 * donc f , f , t , f , f , t^
 * 
 * 2)
 * 
 * on aura  0 1 -1 puis true
 * comme equals ne doit pas prendre en compte lappartenance
 * a la liste alors le comportement est normal.
 * 
 * 3)
 * 
 * on aura un false car b et c ne sont pas le meme objeet
 * */
 */