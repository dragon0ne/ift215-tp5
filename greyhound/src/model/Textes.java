package model;
import java.util.Vector;

/**
 * 
 */

/**
 * @author HELL
 *
 */
public class Textes {
	private Vector<String> Acceuil_fr;
	private Vector<String> Acceuil_en;
	
	public Textes() {
		// TODO Auto-generated constructor stub
		this.Acceuil_fr = new Vector<String>();
		this.Acceuil_en = new Vector<String>();
		
		this.Acceuil_fr.add("Bienvenue à Greyhound");
		this.Acceuil_fr.add("Calculer Itinéraire");
		this.Acceuil_fr.add("Consulter Horaire");
		
		this.Acceuil_en.add("Welcome to Greyhound");
		this.Acceuil_en.add("Calculate Itinery");
		this.Acceuil_en.add("Consult Schedule");
	}

	/**
	 * @return the acceuil_fr
	 */
	public Vector<String> getAcceuil_fr() {
		return Acceuil_fr;
	}

	/**
	 * @return the acceuil_en
	 */
	public Vector<String> getAcceuil_en() {
		return Acceuil_en;
	}
	
	

}
