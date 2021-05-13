public class Main {

	public static void main(String[] args) {
		
		Punkt punkt1 = new Punkt();
		punkt1.setX(0);
		punkt1.setY(0);
		Punkt punkt2 = new Punkt();
		punkt2.setX(10);
		punkt2.setY(2);
		Punkt punkt4 = new Punkt();
		punkt4.setX(0);
		punkt4.setY(0);
		
		Punkt punkt3 = new Punkt(5, 10);
		
		punkt1.getX();
		punkt1.ausgabeAttribut();
		
		punkt1.bewegeUm(5, 7);
		punkt1.ausgabeAttribut();
		
		System.out.println(punkt1.gibAbstand(punkt2));
		
		
		Rechteck square1 = new Rechteck(punkt1, 5, 5, "Test", java.awt.Color.green);
		square1.ausgabeAttribute();
		
		Spielfeld sp = new Spielfeld();
		Punkt[] punkte = new Punkt[4];
		punkte[0] = punkt4;
		punkte[1] = punkt1;
		punkte[2] = punkt2;
		punkte[3] = punkt3;
		
		Punkt[] x = sp.sorter(punkte, punkt4);
		for(int i = 0; i<4; i++) {
			System.out.println(x[i].getX() +"" + x[i].getY());
		}
	}
	

}
