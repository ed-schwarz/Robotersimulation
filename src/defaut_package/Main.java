package defaut_package;

public class Main {

	public static void main(String[] args) {
		
		Punkt punkt1 = new Punkt();
		punkt1.setX(0);
		punkt1.setY(0);
		Punkt punkt2 = new Punkt();
		punkt2.setX(10);
		punkt2.setY(2);
		
		punkt1.ausgabeAttribut();
		
		punkt1.bewegeUm(5, 7);
		punkt1.ausgabeAttribut();
		
		System.out.println(punkt1.gibAbstand(punkt2));
		
	}
	

}
