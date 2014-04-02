/**
 * 
 */
package model;

import java.util.HashMap;
import java.util.Map;

/**
 * @author birj2002
 *
 */
public class Model {
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

	
	
	

}
