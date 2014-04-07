/**
 * 
 */
package model;

import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

/**
 * @author birj2002
 *
 */
public class Model extends Observable {
	private Map<Point, Trajet> tousLesTrajets;

	public Model() {
		// TODO Auto-generated constructor stub
		this.tousLesTrajets = new HashMap<Point, Trajet>();
	}

	public Model(Map<Point, Trajet> tousLesTrajets) {
		super();
		this.tousLesTrajets = tousLesTrajets;
	}

	public Map<Point, Trajet> getTousLesTrajets() {
		return tousLesTrajets;
	}

	public void setTousLesTrajets(Map<Point, Trajet> tousLesTrajets) {
		this.tousLesTrajets = tousLesTrajets;
	} 

	
	/**
	 * notifie la vue
	 * Cette méthode est appelée lorsqu'il a un changement dans la classe modele
	 */
	public void notifyObserver()
	{
		
		setChanged();		
		notifyObservers();	
	}
	

}
