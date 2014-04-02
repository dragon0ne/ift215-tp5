/**
 * 
 */
package model;

/**
 * @author birj2002
 *
 */
public class Point {
	private String ville;
	private int HH; // heure en entiers
	private int MM;// minute en entiers
	public Point() {
		super();
		// TODO Auto-generated constructor stub
		this.ville = "";
		this.HH =0;
		this.MM = 0;
		
	}
	public Point(String ville, int hH, int mM) {
		super();
		this.ville = ville;
		HH = hH;
		MM = mM;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public int getHH() {
		return HH;
	}
	public void setHH(int hH) {
		HH = hH;
	}
	public int getMM() {
		return MM;
	}
	public void setMM(int mM) {
		MM = mM;
	}
	
	
	

}
