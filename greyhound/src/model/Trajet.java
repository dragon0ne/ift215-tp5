/**
 * 
 */
package model;

import java.util.Vector;

/**
 * @author birj2002
 *
 */
public class Trajet {
	
	private Vector<Point> trajet;
	private float prix;
	private boolean est_weekend;
	
	
	public Trajet(Vector<Point> trajet, float prix, boolean est_weekend) {
		super();
		this.trajet = trajet;
		this.prix = prix;
		this.est_weekend = est_weekend;
	}
	
	public Trajet() {
		
		this.trajet = new Vector<Point>();
		this.prix = 0.0f;
		this.est_weekend = false;
	}

	public Vector<Point> getTrajet() {
		return trajet;
	}

	public void setTrajet(Vector<Point> trajet) {
		this.trajet = trajet;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public boolean isEst_weekend() {
		return est_weekend;
	}

	public void setEst_weekend(boolean est_weekend) {
		this.est_weekend = est_weekend;
	}
	
	
	
	

}
