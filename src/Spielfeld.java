import java.util.Scanner;
public class Spielfeld {
	int breite = 1000;
	int laenge = 1000;
	public Spielfeld() {
	
	}
	public Punkt[] punkteEingeben() {
		Scanner input = new Scanner(System.in);
		System.out.println("Gebe Anzahl von Punkte");
		int anzahl = input.nextInt();
		Punkt[] punkte = new Punkt[anzahl];
		Punkt ursprung = new Punkt(0, 0);
		
		return punkte;
	}
	public void nextInt(Punkt[]punkteEingeben) {
		
	}
	public void poiSortieren(Punkt[] poi) {
		boolean kleiner = false;
		Punkt[] angefahrte = new Punkt[poi.length];
		Punkt[] nichtAngefahrte = new Punkt[poi.length - 1];
		if (angefahrte.length == poi.length) {
			 
		}
		
		
	}
	
	
	public Punkt[] sorter(Punkt[]punkte, Punkt lastpoint) {
		if(punkte[0].getX() == 0 && punkte[0].getY()==0) {
			Punkt [] nichtAngefahren = new Punkt[punkte.length - 1];
			for(int l = 1; l<punkte.length; l ++) {
			  nichtAngefahren[l - 1] = punkte[l];
			}
			
			return join(sorter(nichtAngefahren, lastpoint), lastpoint);
			
		}
		else if (punkte.length <= 1){
			return punkte;
		}
		else {
			
			double melhordist = Double.MAX_VALUE;
			Punkt melhorp = new Punkt();
			System.out.println("gay");
			for(int i = 0; i < punkte.length; i++) {
				if(punkte[i].gibAbstand(lastpoint) < melhordist) {
					melhordist = punkte[i].gibAbstand(lastpoint);
					melhorp = punkte[i];
					System.out.println(melhordist);
				}
				
			}
			Punkt [] nichtAngefahren = new Punkt[punkte.length - 1];
			for(int l = 1; l<punkte.length; l ++) {
				if(melhorp.getX() != punkte[l].getX() || melhorp.getY() != punkte[l].getY()) {
					nichtAngefahren[l - 1] = punkte[l];
				}
				
			}
			return join(sorter(nichtAngefahren, melhorp), melhorp);					
		}
		
	}
	public Punkt[] join(Punkt[] punkte, Punkt newpoint) {
		Punkt [] list = new Punkt[punkte.length + 1];
		list[0] = newpoint;
		
		for(int i = 0; i < punkte.length; i++) {
			
			list[i+1] = punkte[i];
			
		}
		return list;
	}
	
	
	
	
	public Punkt[] sortieter(Punkt[]punkte) {
		boolean kleiner = false;
		Punkt[] angefahren = new Punkt[punkte.length];
		if(angefahren.length == punkte.length) {
			return angefahren;
		}
		else {
			Punkt [] nichtAngefahren = new Punkt[punkte.length - 1];
			for(int l = 1; l<punkte.length; l ++) {
				punkte[l] = nichtAngefahren[l - 1];
			}
			angefahren [0] = punkte [0];
			for (int k = 1; k < angefahren.length; k++) {
				for (int i = 1; i < sortieter(nichtAngefahren).length; i ++) {
					for (int j = i+1; j<sortieter(nichtAngefahren).length; j++) {
						double abstandi = punkte[i].gibAbstand(punkte[0]);
						double abstandj = punkte[j].gibAbstand(punkte[0]);
						if (abstandi > abstandj) {
							kleiner = false;
							break;
						}
						else {
							kleiner = true;
						}
					}
					if(kleiner == true) {
						angefahren[k] = punkte[i];
						break;
					}
				}
			}
			return angefahren;
		}
		
		
		
		
	}
	

}
