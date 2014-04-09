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
public class Model extends Observable {
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
	public Map<String, Vector<Trajet>> getTousLesTrajets() {
		return tousLesTrajets;
	}




	/**
	 * @param tousLesTrajets the tousLesTrajets to set
	 */
	public void setTousLesTrajets(Map<String, Vector<Trajet>> tousLesTrajets) {
		this.tousLesTrajets = tousLesTrajets;
	}




	/**
	 * notifie la vue
	 * Cette m�thode est appel�e lorsqu'il a un changement dans la classe modele
	 */
	public void notifyObserver()
	{
		
		setChanged();		
		notifyObservers();	
	}
	
	private void filedData(){
		Vector<Trajet> montreal = new Vector<Trajet>();
		Vector<Point>trajetTMP = new Vector<Point>();
		
		trajetTMP.add(new Point("Montr�al", 7, 0));
		trajetTMP.add(new Point("Sherbrooke", 8, 45));
		montreal.add(new Trajet(trajetTMP,37.95,false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 9, 0));
		trajetTMP.add(new Point("Sherbrooke", 11, 45));
		montreal.add(new Trajet(trajetTMP,37.95,false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 12, 0));
		trajetTMP.add(new Point("Sherbrooke", 13, 45));
		montreal.add(new Trajet(trajetTMP,37.95,false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 14, 0));
		trajetTMP.add(new Point("Sherbrooke", 15, 45));
		montreal.add(new Trajet(trajetTMP,37.95,false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 17, 0));
		trajetTMP.add(new Point("Sherbrooke", 18, 45));
		montreal.add(new Trajet(trajetTMP,37.95,false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 20, 0));
		trajetTMP.add(new Point("Sherbrooke", 21, 45));
		montreal.add(new Trajet(trajetTMP,37.95,false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 22, 0));
		trajetTMP.add(new Point("Sherbrooke", 23, 45));
		montreal.add(new Trajet(trajetTMP,37.95,false));
		//weekend
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 9, 0));
		trajetTMP.add(new Point("Sherbrooke", 11, 45));
		montreal.add(new Trajet(trajetTMP,38.95,true));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 12, 0));
		trajetTMP.add(new Point("Sherbrooke", 13, 45));
		montreal.add(new Trajet(trajetTMP,38.95,true));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 14, 0));
		trajetTMP.add(new Point("Sherbrooke", 15, 45));
		montreal.add(new Trajet(trajetTMP,38.95,true));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 17, 0));
		trajetTMP.add(new Point("Sherbrooke", 18, 45));
		montreal.add(new Trajet(trajetTMP,38.95,true));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 20, 0));
		trajetTMP.add(new Point("Sherbrooke", 21, 45));
		montreal.add(new Trajet(trajetTMP,38.95,true));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 22, 0));
		trajetTMP.add(new Point("Sherbrooke", 23, 45));
		montreal.add(new Trajet(trajetTMP,38.95,true));
		
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 7, 0));
		trajetTMP.add(new Point("Trois-Rivi�res", 8, 45));
		montreal.add(new Trajet(trajetTMP,41.95,false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 9, 0));
		trajetTMP.add(new Point("Trois-Rivi�res", 11, 45));
		montreal.add(new Trajet(trajetTMP,41.95,false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 12, 0));
		trajetTMP.add(new Point("Trois-Rivi�res", 13, 45));
		montreal.add(new Trajet(trajetTMP,41.95,false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 14, 0));
		trajetTMP.add(new Point("Trois-Rivi�res", 15, 45));
		montreal.add(new Trajet(trajetTMP,41.95,false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 17, 0));
		trajetTMP.add(new Point("Trois-Rivi�res", 19, 30));
		montreal.add(new Trajet(trajetTMP,41.95,false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 20, 0));
		trajetTMP.add(new Point("Trois-Rivi�res", 21, 45));
		montreal.add(new Trajet(trajetTMP,41.95,false));
		//weekend
		trajetTMP.add(new Point("Montr�al", 9, 0));
		trajetTMP.add(new Point("Trois-Rivi�res", 11, 45));
		montreal.add(new Trajet(trajetTMP,42.95,true));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 12, 0));
		trajetTMP.add(new Point("Trois-Rivi�res", 13, 45));
		montreal.add(new Trajet(trajetTMP,42.95,true));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 15, 0));
		trajetTMP.add(new Point("Trois-Rivi�res", 16, 45));
		montreal.add(new Trajet(trajetTMP,42.95,true));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 18, 0));
		trajetTMP.add(new Point("Trois-Rivi�res", 20, 30));
		montreal.add(new Trajet(trajetTMP,42.95,true));
		
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 7, 0));
		trajetTMP.add(new Point("Qu�bec", 10, 45));
		montreal.add(new Trajet(trajetTMP,60.95,false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 11, 0));
		trajetTMP.add(new Point("Qu�bec", 14, 45));
		montreal.add(new Trajet(trajetTMP,60.95,false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 14, 0));
		trajetTMP.add(new Point("Qu�bec", 15, 45));
		montreal.add(new Trajet(trajetTMP,60.95,false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 17, 0));
		trajetTMP.add(new Point("Qu�bec", 20, 45));
		montreal.add(new Trajet(trajetTMP,60.95,false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 20, 0));
		trajetTMP.add(new Point("Qu�bec", 23, 45));
		montreal.add(new Trajet(trajetTMP,60.95,false));
		//weekend
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 7, 30));
		trajetTMP.add(new Point("Qu�bec", 10, 55));
		montreal.add(new Trajet(trajetTMP,63.95,true));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 11, 0));
		trajetTMP.add(new Point("Qu�bec", 14, 45));
		montreal.add(new Trajet(trajetTMP,63.95,true));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 14, 30));
		trajetTMP.add(new Point("Qu�bec", 15, 55));
		montreal.add(new Trajet(trajetTMP,63.95,true));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 17, 30));
		trajetTMP.add(new Point("Qu�bec", 20, 55));
		montreal.add(new Trajet(trajetTMP,63.95,true));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 20, 0));
		trajetTMP.add(new Point("Qu�bec", 23, 45));
		montreal.add(new Trajet(trajetTMP,63.95,true));
		
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 7, 0));
		trajetTMP.add(new Point("Toronto", 13,30));
		montreal.add(new Trajet(trajetTMP,110.95,false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 12, 0));
		trajetTMP.add(new Point("Toronto", 6, 45));
		montreal.add(new Trajet(trajetTMP,110.95,false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 16, 0));
		trajetTMP.add(new Point("Toronto", 23, 0));
		montreal.add(new Trajet(trajetTMP,110.95,false));
		trajetTMP.clear();
		//weekend
		trajetTMP.add(new Point("Montr�al", 8, 0));
		trajetTMP.add(new Point("Toronto", 14,00));
		montreal.add(new Trajet(trajetTMP,115.95,true));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 12, 0));
		trajetTMP.add(new Point("Toronto", 6, 35));
		montreal.add(new Trajet(trajetTMP,115.95,true));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 16, 0));
		trajetTMP.add(new Point("Toronto", 22, 0));
		montreal.add(new Trajet(trajetTMP,115.95,true));
		
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 7, 0));
		trajetTMP.add(new Point("New York", 13,30));
		montreal.add(new Trajet(trajetTMP,115.95,false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 12, 0));
		trajetTMP.add(new Point("New York", 6, 45));
		montreal.add(new Trajet(trajetTMP,115.95,false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 16, 0));
		trajetTMP.add(new Point("New York", 23, 0));
		montreal.add(new Trajet(trajetTMP,115.95,false));
		trajetTMP.clear();
		//weekend
		trajetTMP.add(new Point("Montr�al", 8, 0));
		trajetTMP.add(new Point("Boston", 12, 0));
		trajetTMP.add(new Point("New York", 14,00));
		montreal.add(new Trajet(trajetTMP,110.95,true));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 12, 0));
		trajetTMP.add(new Point("New York", 6, 35));
		montreal.add(new Trajet(trajetTMP,110.95,true));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montr�al", 16, 0));
		trajetTMP.add(new Point("Boston", 19, 30));
		trajetTMP.add(new Point("New York", 22, 0));
		montreal.add(new Trajet(trajetTMP,110.95,true));
	
					
		this.tousLesTrajets.put("Montr�al", montreal);
		
	}
	
	public Map<String,Integer> getVillesDestination(String villeDepart) {
		
		Map<String,Integer>VilleDestTMP = new HashMap<String, Integer>();
		for(int i =0 ; i<this.tousLesTrajets.get(villeDepart).size();i++){
			VilleDestTMP.put(this.tousLesTrajets.get(villeDepart).get(i).getTrajet().lastElement().getVille(),0);
		}
		
			
		return VilleDestTMP;
			
	}

	public Vector<String> getVillesDepart() {
		Vector<String> villesDepart = new Vector<String>();
		
		for(String key : this.tousLesTrajets.keySet()){
			villesDepart.add(key);
		}
				
		return villesDepart;
			
	}
	
	public Vector<Trajet> getTrajet(String depart,String destination, boolean isWeekend) {
		Vector<Trajet> trajets = new Vector<Trajet>();
		
		for(Trajet trajet : this.tousLesTrajets.get(depart)){
			if(trajet.getTrajet().lastElement().getVille().equals(destination) && trajet.isEst_weekend()== isWeekend){
				trajets.add(trajet);
			}
		}
					
		return trajets;
			
	}
	
	//il fo faire une focntion pour get les trajet par destination et week ou weekend;
}
