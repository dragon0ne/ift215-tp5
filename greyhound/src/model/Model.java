/**
 * 
 */
package model;

import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;

/**
 * @author birj2002
 * 
 */
public class Model extends Observable
{
	private Map<String, Vector<Trajet>> tousLesTrajets;

	public Model() {
		// TODO Auto-generated constructor stub
		this.tousLesTrajets = new HashMap<String, Vector<Trajet>>();
		filedData();
	}

	public Model(Map<String, Vector<Trajet>> tousLesTrajets) {

		this.tousLesTrajets = tousLesTrajets;
	}

	/**
	 * @return the tousLesTrajets
	 */
	public Map<String, Vector<Trajet>> getTousLesTrajets()
	{
		return tousLesTrajets;
	}

	/**
	 * @param tousLesTrajets
	 *            the tousLesTrajets to set
	 */
	public void setTousLesTrajets(Map<String, Vector<Trajet>> tousLesTrajets)
	{
		this.tousLesTrajets = tousLesTrajets;
	}

	/**
	 * notifie la vue Cette m�thode est appel�e lorsqu'il a un changement dans
	 * la classe modele
	 */
	public void notifyObserver()
	{

		setChanged();
		notifyObservers();
	}

	private void filedData()
	{
		Vector<Trajet> montreal = new Vector<Trajet>();
		Vector<Point> trajetTMP = new Vector<Point>();

		trajetTMP.add(new Point("Montr�al", 7, 0));
		trajetTMP.add(new Point("Sherbrooke", 8, 45));
		montreal.add(new Trajet(trajetTMP, 37.95, false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 9, 0));
		trajetTMP.add(new Point("Sherbrooke", 11, 45));
		montreal.add(new Trajet(trajetTMP, 37.95, false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 12, 0));
		trajetTMP.add(new Point("Sherbrooke", 13, 45));
		montreal.add(new Trajet(trajetTMP, 37.95, false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 14, 0));
		trajetTMP.add(new Point("Sherbrooke", 15, 45));
		montreal.add(new Trajet(trajetTMP, 37.95, false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 17, 0));
		trajetTMP.add(new Point("Sherbrooke", 18, 45));
		montreal.add(new Trajet(trajetTMP, 37.95, false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 20, 0));
		trajetTMP.add(new Point("Sherbrooke", 21, 45));
		montreal.add(new Trajet(trajetTMP, 37.95, false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 22, 0));
		trajetTMP.add(new Point("Sherbrooke", 23, 45));
		montreal.add(new Trajet(trajetTMP, 37.95, false));
		// weekend
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 9, 0));
		trajetTMP.add(new Point("Sherbrooke", 11, 45));
		montreal.add(new Trajet(trajetTMP, 38.95, true));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 12, 0));
		trajetTMP.add(new Point("Sherbrooke", 13, 45));
		montreal.add(new Trajet(trajetTMP, 38.95, true));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 14, 0));
		trajetTMP.add(new Point("Sherbrooke", 15, 45));
		montreal.add(new Trajet(trajetTMP, 38.95, true));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 17, 0));
		trajetTMP.add(new Point("Sherbrooke", 18, 45));
		montreal.add(new Trajet(trajetTMP, 38.95, true));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 20, 0));
		trajetTMP.add(new Point("Sherbrooke", 21, 45));
		montreal.add(new Trajet(trajetTMP, 38.95, true));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 22, 0));
		trajetTMP.add(new Point("Sherbrooke", 23, 45));
		montreal.add(new Trajet(trajetTMP, 38.95, true));

		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 7, 0));
		trajetTMP.add(new Point("Trois-Rivi�res", 8, 45));
		montreal.add(new Trajet(trajetTMP, 41.95, false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 9, 0));
		trajetTMP.add(new Point("Trois-Rivi�res", 11, 45));
		montreal.add(new Trajet(trajetTMP, 41.95, false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 12, 0));
		trajetTMP.add(new Point("Trois-Rivi�res", 13, 45));
		montreal.add(new Trajet(trajetTMP, 41.95, false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 14, 0));
		trajetTMP.add(new Point("Trois-Rivi�res", 15, 45));
		montreal.add(new Trajet(trajetTMP, 41.95, false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 17, 0));
		trajetTMP.add(new Point("Trois-Rivi�res", 19, 30));
		montreal.add(new Trajet(trajetTMP, 41.95, false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 20, 0));
		trajetTMP.add(new Point("Trois-Rivi�res", 21, 45));
		montreal.add(new Trajet(trajetTMP, 41.95, false));
		// weekend
		trajetTMP.add(new Point("Montr�al", 9, 0));
		trajetTMP.add(new Point("Trois-Rivi�res", 11, 45));
		montreal.add(new Trajet(trajetTMP, 42.95, true));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 12, 0));
		trajetTMP.add(new Point("Trois-Rivi�res", 13, 45));
		montreal.add(new Trajet(trajetTMP, 42.95, true));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 15, 0));
		trajetTMP.add(new Point("Trois-Rivi�res", 16, 45));
		montreal.add(new Trajet(trajetTMP, 42.95, true));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 18, 0));
		trajetTMP.add(new Point("Trois-Rivi�res", 20, 30));
		montreal.add(new Trajet(trajetTMP, 42.95, true));

		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 7, 0));
		trajetTMP.add(new Point("Qu�bec", 10, 45));
		montreal.add(new Trajet(trajetTMP, 60.95, false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 11, 0));
		trajetTMP.add(new Point("Qu�bec", 14, 45));
		montreal.add(new Trajet(trajetTMP, 60.95, false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 14, 0));
		trajetTMP.add(new Point("Qu�bec", 15, 45));
		montreal.add(new Trajet(trajetTMP, 60.95, false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 17, 0));
		trajetTMP.add(new Point("Qu�bec", 20, 45));
		montreal.add(new Trajet(trajetTMP, 60.95, false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 20, 0));
		trajetTMP.add(new Point("Qu�bec", 23, 45));
		montreal.add(new Trajet(trajetTMP, 60.95, false));
		// weekend
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 7, 30));
		trajetTMP.add(new Point("Qu�bec", 10, 55));
		montreal.add(new Trajet(trajetTMP, 63.95, true));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 11, 0));
		trajetTMP.add(new Point("Qu�bec", 14, 45));
		montreal.add(new Trajet(trajetTMP, 63.95, true));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 14, 30));
		trajetTMP.add(new Point("Qu�bec", 15, 55));
		montreal.add(new Trajet(trajetTMP, 63.95, true));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 17, 30));
		trajetTMP.add(new Point("Qu�bec", 20, 55));
		montreal.add(new Trajet(trajetTMP, 63.95, true));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 20, 0));
		trajetTMP.add(new Point("Qu�bec", 23, 45));
		montreal.add(new Trajet(trajetTMP, 63.95, true));

		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 7, 0));
		trajetTMP.add(new Point("Ottawa", 9, 30));
		montreal.add(new Trajet(trajetTMP, 60.95, false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 11, 0));
		trajetTMP.add(new Point("Ottawa", 13, 35));
		montreal.add(new Trajet(trajetTMP, 60.95, false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 14, 0));
		trajetTMP.add(new Point("Ottawa", 16, 45));
		montreal.add(new Trajet(trajetTMP, 60.95, false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 17, 0));
		trajetTMP.add(new Point("Ottawa", 19, 20));
		montreal.add(new Trajet(trajetTMP, 60.95, false));
		// weekend
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 7, 30));
		trajetTMP.add(new Point("Ottawa", 9, 55));
		montreal.add(new Trajet(trajetTMP, 63.95, true));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 20, 0));
		trajetTMP.add(new Point("Ottawa", 22, 10));
		montreal.add(new Trajet(trajetTMP, 63.95, true));

		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 7, 0));
		trajetTMP.add(new Point("Toronto", 13, 30));
		montreal.add(new Trajet(trajetTMP, 110.95, false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 12, 0));
		trajetTMP.add(new Point("Toronto", 6, 45));
		montreal.add(new Trajet(trajetTMP, 110.95, false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 16, 0));
		trajetTMP.add(new Point("Toronto", 23, 0));
		montreal.add(new Trajet(trajetTMP, 110.95, false));
		trajetTMP.clear();
		// weekend
		trajetTMP.add(new Point("Montr�al", 8, 0));
		trajetTMP.add(new Point("Toronto", 14, 00));
		montreal.add(new Trajet(trajetTMP, 115.95, true));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 12, 0));
		trajetTMP.add(new Point("Toronto", 6, 35));
		montreal.add(new Trajet(trajetTMP, 115.95, true));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 16, 0));
		trajetTMP.add(new Point("Toronto", 22, 0));
		montreal.add(new Trajet(trajetTMP, 115.95, true));

		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 7, 0));
		trajetTMP.add(new Point("New York", 13, 30));
		montreal.add(new Trajet(trajetTMP, 115.95, false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 12, 0));
		trajetTMP.add(new Point("New York", 6, 45));
		montreal.add(new Trajet(trajetTMP, 115.95, false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 16, 0));
		trajetTMP.add(new Point("New York", 23, 0));
		montreal.add(new Trajet(trajetTMP, 115.95, false));
		trajetTMP.clear();
		// weekend
		trajetTMP.add(new Point("Montr�al", 8, 0));
		trajetTMP.add(new Point("Boston", 12, 0));
		trajetTMP.add(new Point("New York", 14, 00));
		montreal.add(new Trajet(trajetTMP, 110.95, true));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 12, 0));
		trajetTMP.add(new Point("New York", 6, 35));
		montreal.add(new Trajet(trajetTMP, 110.95, true));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 16, 0));
		trajetTMP.add(new Point("Boston", 19, 30));
		trajetTMP.add(new Point("New York", 22, 0));
		montreal.add(new Trajet(trajetTMP, 110.95, true));

		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 7, 0));
		trajetTMP.add(new Point("Ottawa", 9, 30));
		trajetTMP.add(new Point("Toronto", 14, 35));
		montreal.add(new Trajet(trajetTMP, 115.95, false));
		trajetTMP.clear();
		// weekend
		trajetTMP.add(new Point("Montr�al", 8, 0));
		trajetTMP.add(new Point("Boston", 12, 0));
		trajetTMP.add(new Point("New York", 14, 00));
		montreal.add(new Trajet(trajetTMP, 110.95, true));
		trajetTMP.clear();

		this.tousLesTrajets.put("Montr�al", montreal);

		Vector<Trajet> quebec = new Vector<Trajet>();

		trajetTMP.clear();
		trajetTMP.add(new Point("Qu�bec", 7, 0));
		trajetTMP.add(new Point("Trois-Rivi�re", 8, 30));
		trajetTMP.add(new Point("Montr�al", 10, 0));
		quebec.add(new Trajet(trajetTMP, 115.95, false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Qu�bec", 12, 0));
		trajetTMP.add(new Point("Trois-Rivi�re", 13, 30));
		quebec.add(new Trajet(trajetTMP, 115.95, false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Qu�bec", 16, 0));
		trajetTMP.add(new Point("Trois-Rivi�re", 17, 30));
		trajetTMP.add(new Point("Montr�al", 19, 0));
		quebec.add(new Trajet(trajetTMP, 115.95, false));
		trajetTMP.clear();
		// weekend
		trajetTMP.add(new Point("Qu�bec", 8, 0));
		trajetTMP.add(new Point("Trois-Rivi�re", 9, 30));
		quebec.add(new Trajet(trajetTMP, 110.95, true));
		trajetTMP.clear();
		trajetTMP.add(new Point("Qu�bec", 12, 0));
		trajetTMP.add(new Point("Trois-Rivi�re", 13, 35));
		trajetTMP.add(new Point("Montr�al", 14, 35));
		quebec.add(new Trajet(trajetTMP, 110.95, true));
		trajetTMP.clear();
		trajetTMP.add(new Point("Qu�bec", 16, 0));
		trajetTMP.add(new Point("Trois-Rivi�re", 17, 30));
		quebec.add(new Trajet(trajetTMP, 110.95, true));

		trajetTMP.clear();
		trajetTMP.add(new Point("Qu�bec", 7, 0));
		trajetTMP.add(new Point("Drummondville", 8, 30));
		trajetTMP.add(new Point("Montr�al", 10, 0));
		quebec.add(new Trajet(trajetTMP, 115.95, false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Qu�bec", 12, 0));
		trajetTMP.add(new Point("Drummondville", 13, 30));
		quebec.add(new Trajet(trajetTMP, 115.95, false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Qu�bec", 16, 0));
		trajetTMP.add(new Point("Drummondville", 17, 30));
		trajetTMP.add(new Point("Montr�al", 19, 0));
		quebec.add(new Trajet(trajetTMP, 115.95, false));
		trajetTMP.clear();
		// weekend
		trajetTMP.add(new Point("Qu�bec", 8, 0));
		trajetTMP.add(new Point("Drummondville", 9, 30));
		quebec.add(new Trajet(trajetTMP, 110.95, true));
		trajetTMP.clear();
		trajetTMP.add(new Point("Qu�bec", 12, 0));
		trajetTMP.add(new Point("Drummondville", 13, 35));
		trajetTMP.add(new Point("Sherbrooke", 14, 35));
		quebec.add(new Trajet(trajetTMP, 110.95, true));
		trajetTMP.clear();
		trajetTMP.add(new Point("Qu�bec", 16, 0));
		trajetTMP.add(new Point("Drummondville", 17, 30));
		quebec.add(new Trajet(trajetTMP, 110.95, true));

		trajetTMP.clear();
		trajetTMP.add(new Point("Qu�bec", 7, 0));
		trajetTMP.add(new Point("Saguenay", 10, 0));
		quebec.add(new Trajet(trajetTMP, 115.95, false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Qu�bec", 12, 0));
		trajetTMP.add(new Point("Saguenay", 15, 0));
		quebec.add(new Trajet(trajetTMP, 115.95, false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Qu�bec", 16, 0));
		trajetTMP.add(new Point("Saguenay", 19, 0));
		quebec.add(new Trajet(trajetTMP, 115.95, false));
		trajetTMP.clear();
		// weekend
		trajetTMP.add(new Point("Qu�bec", 8, 0));
		trajetTMP.add(new Point("Saguenay", 11, 0));
		quebec.add(new Trajet(trajetTMP, 110.95, true));
		trajetTMP.clear();
		trajetTMP.add(new Point("Qu�bec", 16, 0));
		trajetTMP.add(new Point("Saguenay", 19, 0));
		quebec.add(new Trajet(trajetTMP, 110.95, true));

		this.tousLesTrajets.put("Qu�bec", quebec);

		Vector<Trajet> ottawa = new Vector<Trajet>();

		trajetTMP.clear();
		trajetTMP.add(new Point("Ottawa", 7, 0));
		trajetTMP.add(new Point("Montr�al", 9, 30));
		ottawa.add(new Trajet(trajetTMP, 115.95, false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Ottawa", 9, 0));
		trajetTMP.add(new Point("Montr�al", 11, 35));
		ottawa.add(new Trajet(trajetTMP, 115.95, false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Ottawa", 12, 0));
		trajetTMP.add(new Point("Montr�al", 14, 25));
		ottawa.add(new Trajet(trajetTMP, 115.95, false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Ottawa", 18, 0));
		trajetTMP.add(new Point("Montr�al", 20, 20));
		ottawa.add(new Trajet(trajetTMP, 110.95, false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Ottawa", 21, 0));
		trajetTMP.add(new Point("Montr�al", 23, 0));
		ottawa.add(new Trajet(trajetTMP, 110.95, false));
		trajetTMP.clear();
		// weekend
		trajetTMP.add(new Point("Ottawa", 8, 0));
		trajetTMP.add(new Point("Montr�al", 11, 30));
		ottawa.add(new Trajet(trajetTMP, 110.95, true));
		trajetTMP.clear();
		trajetTMP.add(new Point("Ottawa", 12, 0));
		trajetTMP.add(new Point("Montr�al", 14, 0));
		ottawa.add(new Trajet(trajetTMP, 110.95, true));
		trajetTMP.clear();
		trajetTMP.add(new Point("Ottawa", 16, 0));
		trajetTMP.add(new Point("Montr�al", 19, 0));
		ottawa.add(new Trajet(trajetTMP, 110.95, true));

		trajetTMP.clear();
		trajetTMP.add(new Point("Ottawa", 7, 0));
		trajetTMP.add(new Point("Toronto", 12, 10));
		ottawa.add(new Trajet(trajetTMP, 115.95, false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Ottawa", 9, 0));
		trajetTMP.add(new Point("Toronto", 14, 20));
		ottawa.add(new Trajet(trajetTMP, 115.95, false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Ottawa", 12, 0));
		trajetTMP.add(new Point("Toronto", 17, 05));
		ottawa.add(new Trajet(trajetTMP, 115.95, false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Ottawa", 16, 0));
		trajetTMP.add(new Point("Toronto", 21, 2));
		ottawa.add(new Trajet(trajetTMP, 110.95, false));
		trajetTMP.clear();
		// weekend
		trajetTMP.add(new Point("Ottawa", 8, 0));
		trajetTMP.add(new Point("Toronto", 11, 30));
		ottawa.add(new Trajet(trajetTMP, 110.95, true));
		trajetTMP.clear();
		trajetTMP.add(new Point("Ottawa", 12, 0));
		trajetTMP.add(new Point("Toronto", 14, 0));
		ottawa.add(new Trajet(trajetTMP, 110.95, true));

		this.tousLesTrajets.put("Ottawa", ottawa);

		Vector<Trajet> ny = new Vector<Trajet>();

		trajetTMP.clear();
		trajetTMP.add(new Point("New York", 7, 0));
		trajetTMP.add(new Point("Montr�al", 9, 30));
		ny.add(new Trajet(trajetTMP, 115.95, false));
		trajetTMP.clear();
		trajetTMP.add(new Point("New York", 9, 0));
		trajetTMP.add(new Point("Montr�al", 11, 35));
		ny.add(new Trajet(trajetTMP, 115.95, false));
		trajetTMP.clear();
		trajetTMP.add(new Point("New York", 12, 0));
		trajetTMP.add(new Point("Montr�al", 14, 25));
		ny.add(new Trajet(trajetTMP, 115.95, false));
		trajetTMP.clear();
		trajetTMP.add(new Point("New York", 18, 0));
		trajetTMP.add(new Point("Montr�al", 20, 20));
		ny.add(new Trajet(trajetTMP, 110.95, false));
		trajetTMP.clear();
		trajetTMP.add(new Point("New York", 21, 0));
		trajetTMP.add(new Point("Montr�al", 23, 0));
		ny.add(new Trajet(trajetTMP, 110.95, false));
		trajetTMP.clear();
		// weekend
		trajetTMP.add(new Point("New York", 8, 0));
		trajetTMP.add(new Point("Montr�al", 11, 30));
		ny.add(new Trajet(trajetTMP, 110.95, true));
		trajetTMP.clear();
		trajetTMP.add(new Point("New York", 12, 0));
		trajetTMP.add(new Point("Montr�al", 14, 0));
		ny.add(new Trajet(trajetTMP, 110.95, true));
		trajetTMP.clear();
		trajetTMP.add(new Point("New York", 16, 0));
		trajetTMP.add(new Point("Montr�al", 19, 0));
		ny.add(new Trajet(trajetTMP, 110.95, true));

		trajetTMP.clear();
		trajetTMP.add(new Point("New York", 7, 0));
		trajetTMP.add(new Point("Washington DC", 11, 0));
		ny.add(new Trajet(trajetTMP, 115.95, false));
		trajetTMP.clear();
		trajetTMP.add(new Point("New York", 9, 0));
		trajetTMP.add(new Point("Washington DC", 13, 5));
		ny.add(new Trajet(trajetTMP, 115.95, false));
		trajetTMP.clear();
		trajetTMP.add(new Point("New York", 12, 0));
		trajetTMP.add(new Point("Washington DC", 16, 05));
		ny.add(new Trajet(trajetTMP, 115.95, false));
		trajetTMP.clear();
		trajetTMP.add(new Point("New York", 16, 0));
		trajetTMP.add(new Point("Washington DC", 20, 2));
		ny.add(new Trajet(trajetTMP, 110.95, false));
		trajetTMP.clear();
		// weekend
		trajetTMP.add(new Point("New York", 8, 0));
		trajetTMP.add(new Point("Washington DC", 12, 10));
		ny.add(new Trajet(trajetTMP, 110.95, true));
		trajetTMP.clear();
		trajetTMP.add(new Point("New York", 12, 0));
		trajetTMP.add(new Point("Washington DC", 15, 55));
		ny.add(new Trajet(trajetTMP, 110.95, true));

		this.tousLesTrajets.put("New York", ny);
		
Vector<Trajet> wasDC = new Vector<Trajet>();
		
		trajetTMP.clear();
		trajetTMP.add(new Point("Washington DC", 7, 0));
		trajetTMP.add(new Point("New York", 9,30));
		wasDC.add(new Trajet(trajetTMP,115.95,false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Washington DC", 9, 0));
		trajetTMP.add(new Point("New York", 11, 35));
		wasDC.add(new Trajet(trajetTMP,115.95,false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Washington DC", 12, 0));
		trajetTMP.add(new Point("New York", 14, 25));
		wasDC.add(new Trajet(trajetTMP,115.95,false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Washington DC", 18, 0));
		trajetTMP.add(new Point("New York", 20, 20));
		wasDC.add(new Trajet(trajetTMP,110.95,false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Washington DC", 21, 0));
		trajetTMP.add(new Point("New York", 23, 0));
		wasDC.add(new Trajet(trajetTMP,110.95,false));
		trajetTMP.clear();
		//weekend
		trajetTMP.add(new Point("Washington DC", 8, 0));
		trajetTMP.add(new Point("New York", 11, 30));
		wasDC.add(new Trajet(trajetTMP,110.95,true));
		trajetTMP.clear();
		trajetTMP.add(new Point("Washington DC", 12, 0));
		trajetTMP.add(new Point("New York", 14, 0));
		wasDC.add(new Trajet(trajetTMP,110.95,true));
		trajetTMP.clear();
		trajetTMP.add(new Point("Washington DC", 16, 0));
		trajetTMP.add(new Point("New York", 19, 0));
		wasDC.add(new Trajet(trajetTMP,110.95,true));

		
		this.tousLesTrajets.put("Washington DC", wasDC);

	}

	public Map<String, Integer> getVillesDestination(String villeDepart)
	{

		Map<String, Integer> VilleDestTMP = new HashMap<String, Integer>();
		for (int i = 0; i < this.tousLesTrajets.get(villeDepart).size(); i++)
		{
			VilleDestTMP.put(this.tousLesTrajets.get(villeDepart).get(i)
					.getTrajet().lastElement().getVille(), 0);
		}

		return VilleDestTMP;

	}

	public Vector<String> getVillesDepart()
	{
		Vector<String> villesDepart = new Vector<String>();

		for (String key : this.tousLesTrajets.keySet())
		{
			villesDepart.add(key);
		}

		return villesDepart;

	}

	public Vector<Trajet> getTrajet(String depart, String destination,
			boolean isWeekend)
	{
		Vector<Trajet> trajets = new Vector<Trajet>();

		for (Trajet trajet : this.tousLesTrajets.get(depart))
		{
			if (trajet.getTrajet().lastElement().getVille().equals(destination)
					&& trajet.isEst_weekend() == isWeekend)
			{
				trajets.add(trajet);
			}
		}

		return trajets;

	}

	// il fo faire une focntion pour get les trajet par destination et week ou
	// weekend;
}
