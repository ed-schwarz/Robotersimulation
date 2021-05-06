
import java.lang.Math;

public class Punkt {
	private int x;
	private int y;
	public Punkt (){
		
	}
	public Punkt(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX(){
		return x;
	}
	public void setX(int x){
		this.x = x;
	}
	public int getY(){
		return y;
	}
	public void setY(int y){
		this.y = y;
	}
	public void ausgabeAttribut() {
		x = getX();
		y = getY();
		System.out.println("x: " + x + ", y: " + y);
	}
	public void bewegeUm(int dx, int dy) {
		this.setX(getX() + dx);
		this.setY(getY() + dy);
	}
	public double gibAbstand(Punkt andererPunkt) {
		double abstand = 0;
		int x1 = getX();
		int y1 = getY();
		int x2 = andererPunkt.x;
		int y2 = andererPunkt.y;
		abstand = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
		return abstand;
	}
	
}
