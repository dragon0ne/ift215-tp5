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
	private Vector<String> CalculIt_fr;
	private Vector<String> CalculIt_en;
	private Vector<String> ItProposees_fr;
	private Vector<String> ItProposees_en;
	private Vector<String> ResultIt_fr;
	private Vector<String> ResultIt_en;
	
	public Textes() {
		// TODO Auto-generated constructor stub
		this.Acceuil_fr = new Vector<String>();
		this.Acceuil_en = new Vector<String>();
		this.CalculIt_fr = new Vector<String>();
		this.CalculIt_en = new Vector<String>();
		this.ItProposees_fr = new Vector<String>();
		this.ItProposees_en = new Vector<String>();
		this.ResultIt_fr = new Vector<String>();
		this.ResultIt_en = new Vector<String>();
		
		this.Acceuil_fr.add("Bienvenue à Greyhound");
		this.Acceuil_fr.add("Calculer Itinéraire");
		this.Acceuil_fr.add("Consulter Horaire");
		
		this.Acceuil_en.add("Welcome to Greyhound");
		this.Acceuil_en.add("Calculate Itinery");
		this.Acceuil_en.add("Consult Schedule");
		
		this.CalculIt_fr.add("Calculer Itinéraire");
		this.CalculIt_fr.add("Lieu de départ :");
		this.CalculIt_fr.add("Lieu d'arrivé :");
		this.CalculIt_fr.add("Aller - Retour");
		this.CalculIt_fr.add("Aller - Simple");
		this.CalculIt_fr.add("Date de départ :");
		this.CalculIt_fr.add("Date de retour :");
		this.CalculIt_fr.add("Billets");
		this.CalculIt_fr.add("Adultes :");
		this.CalculIt_fr.add("Étudiants :");
		this.CalculIt_fr.add("Enfants :");
		this.CalculIt_fr.add("Retour");
		this.CalculIt_fr.add("Calculer");
		
		this.CalculIt_en.add("Calculate Itinery");
		this.CalculIt_en.add("Departure City :");
		this.CalculIt_en.add("Destination City :");
		this.CalculIt_en.add("Round Way");
		this.CalculIt_en.add("One Way");
		this.CalculIt_en.add("Departure Date :");
		this.CalculIt_en.add("Return Date :");
		this.CalculIt_en.add("Tickets");
		this.CalculIt_en.add("Adults :");
		this.CalculIt_en.add("Students :");
		this.CalculIt_en.add("Child :");
		this.CalculIt_en.add("Back");
		this.CalculIt_en.add("Calculate");
		
		this.ItProposees_fr.add("Itinéraires proposées: ");
		this.ItProposees_fr.add("Aller ");
		this.ItProposees_fr.add("Retour");
		this.ItProposees_fr.add("<< Itinéraires jour précédent");
		this.ItProposees_fr.add("Itinéraires jour suivant tard >>");
		this.ItProposees_fr.add("Retour");
		
		this.ItProposees_en.add("Proposed Itinery ");
		this.ItProposees_en.add("Go ");
		this.ItProposees_en.add("Return");
		this.ItProposees_en.add("<< Itinery Last Day");
		this.ItProposees_en.add("Itinery Next Day >>");
		this.ItProposees_en.add("Back");
		
		this.ResultIt_fr.add("");
		
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

	/**
	 * @return the calculIt_fr
	 */
	public Vector<String> getCalculIt_fr() {
		return CalculIt_fr;
	}

	/**
	 * @return the calculIt_en
	 */
	public Vector<String> getCalculIt_en() {
		return CalculIt_en;
	}
	
	

}
