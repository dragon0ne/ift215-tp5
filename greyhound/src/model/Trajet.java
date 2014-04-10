/**
 * 
 */
package model;


import java.util.ArrayList;
import java.util.Vector;
import java.util.List;

/**
 * @author birj2002
 *
 */
public class Trajet {
	
	private Vector<Point> trajet;
	private double prix;
	private boolean est_weekend;
	
	
	public Trajet(Vector<Point> trajet, double prix, boolean est_weekend) {
		this.trajet = new Vector<Point>();
		for(int i = 0 ; i<trajet.size();i++){
			this.trajet.add(trajet.get(i));
		}
		this.prix = prix;
		this.est_weekend = est_weekend;
	}
	
	public Trajet() {
		
		this.trajet = new Vector<Point>();
		this.prix = 0.0;
		this.est_weekend = false;
	}

	public Vector<Point> getTrajet() {
		return trajet;
	}

	public void setTrajet(Vector<Point> trajet) {
		for(int i = 0 ; i<trajet.size();i++){
			this.trajet.add(trajet.get(i));
		}
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public boolean isEst_weekend() {
		return est_weekend;
	}

	public void setEst_weekend(boolean est_weekend) {
		this.est_weekend = est_weekend;
	}
	
	public String getDure(Point p2)
	{
		int tmp = ((p2.getHH()*60)+p2.getMM())-((this.trajet.firstElement().getHH()*60)+this.trajet.firstElement().getMM());	
		
		int hh = tmp/60;
		int mm = tmp%60;
		return (hh+":"+ (mm<10? "0" + mm : mm));
	}
	
	public String getDure(){
		int hh = 0;
		int mm = 0;
		int tmp = ((this.trajet.lastElement().getHH()*60)+this.trajet.lastElement().getMM())-((this.trajet.firstElement().getHH()*60)+this.trajet.firstElement().getMM());	
		hh = tmp/60;
		mm = tmp%60;
		return (hh+":"+ (mm<10? "0" + mm : mm));
	}
	
	public List<String> getVillesDetail(){
		List<String> villes = new ArrayList<String>();
		for(Point ville : this.trajet){
			villes.add(ville.getVille());
		}
		return(villes);
	}
	
	

}
