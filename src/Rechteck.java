import java.awt.Color;

public class Rechteck {
	Punkt position = new Punkt();
	private int breite;
	private int laenge;
	private String bezeichnung;
	private Color farbe;
	
	public Rechteck(){
		
	}
	public Rechteck(Punkt position, int breite, int laenge, String bezeichnung, Color farbe){
		this.position = position;
		this.breite = breite;
		this.laenge= laenge;
		this.bezeichnung = bezeichnung;
		this.farbe = farbe;
	}
	public Punkt getPosition(){
		return position;
	}
	public void setPosition(Punkt position){
		this.position = position;
	}
	public int getBreite(){
		return breite;
	}
	public void setBreite(int breite){
		this.breite = breite;
	}
	public int getLaenge(){
		return laenge;
	}
	public void setLaenge(int laenge){
		this.laenge = laenge;
	}
	public String getBezeichning(){
		return bezeichnung;
	}
	public void setBezeichnung(String bezeichnung){
		this.bezeichnung = bezeichnung;
	}
	public Color getFarbe(){
		return farbe;
	}
	public void setFarbe(Color farbe){
		
		this.farbe = farbe;
	}
	public void bewegeUm(int dx, int dy) {
		this.position.setX(position.getX() + dx);
		this.position.setY(position.getY() + dy);
	}
	public void bewegeUm(Punkt verschiebevektor) {
		this.position.setX(position.getX() + verschiebevektor.getX());
		this.position.setY(position.getY() + verschiebevektor.getY());
	}
	public void ausgabeAttribute() {
		int x = this.position.getX();
		int y = this.position.getY();
		int breite = this.breite;
		int laenge = this.laenge;
		String bezeichnung = this.bezeichnung;
		Color farbe = this.farbe;
		
		System.out.println("X: " + x + ", Y: " + y + ", Breite: " + breite + ", Laenge: " + laenge + ", Bezeichnung: " + bezeichnung + ", Farbe: " + farbe);
	
	}

}
