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
	 * Cette méthode est appelée lorsqu'il a un changement dans la classe modele
	 */
	public void notifyObserver()
	{
		
		setChanged();		
		notifyObservers();	
	}
	
	private void filedData(){
		Vector<Trajet> montreal = new Vector<Trajet>();
		Vector<Point>trajetTMP = new Vector<Point>();
		
		trajetTMP.add(new Point("Montréal", 7, 0));
		trajetTMP.add(new Point("Sherbrooke", 8, 45));
		montreal.add(new Trajet(trajetTMP,37.95,false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montréal", 9, 0));
		trajetTMP.add(new Point("Sherbrooke", 11, 45));
		montreal.add(new Trajet(trajetTMP,37.95,false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montréal", 12, 0));
		trajetTMP.add(new Point("Sherbrooke", 13, 45));
		montreal.add(new Trajet(trajetTMP,37.95,false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montréal", 14, 0));
		trajetTMP.add(new Point("Sherbrooke", 15, 45));
		montreal.add(new Trajet(trajetTMP,37.95,false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montréal", 17, 0));
		trajetTMP.add(new Point("Sherbrooke", 18, 45));
		montreal.add(new Trajet(trajetTMP,37.95,false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montréal", 20, 0));
		trajetTMP.add(new Point("Sherbrooke", 21, 45));
		montreal.add(new Trajet(trajetTMP,37.95,false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montréal", 22, 0));
		trajetTMP.add(new Point("Sherbrooke", 23, 45));
		montreal.add(new Trajet(trajetTMP,37.95,false));
		//weekend
		trajetTMP.clear();
		trajetTMP.add(new Point("Montréal", 9, 0));
		trajetTMP.add(new Point("Sherbrooke", 11, 45));
		montreal.add(new Trajet(trajetTMP,38.95,true));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montréal", 12, 0));
		trajetTMP.add(new Point("Sherbrooke", 13, 45));
		montreal.add(new Trajet(trajetTMP,38.95,true));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montréal", 14, 0));
		trajetTMP.add(new Point("Sherbrooke", 15, 45));
		montreal.add(new Trajet(trajetTMP,38.95,true));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montréal", 17, 0));
		trajetTMP.add(new Point("Sherbrooke", 18, 45));
		montreal.add(new Trajet(trajetTMP,38.95,true));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montréal", 20, 0));
		trajetTMP.add(new Point("Sherbrooke", 21, 45));
		montreal.add(new Trajet(trajetTMP,38.95,true));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montréal", 22, 0));
		trajetTMP.add(new Point("Sherbrooke", 23, 45));
		montreal.add(new Trajet(trajetTMP,38.95,true));
		
		trajetTMP.clear();
		trajetTMP.add(new Point("Montréal", 7, 0));
		trajetTMP.add(new Point("Trois-Rivières", 8, 45));
		montreal.add(new Trajet(trajetTMP,41.95,false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montréal", 9, 0));
		trajetTMP.add(new Point("Trois-Rivières", 11, 45));
		montreal.add(new Trajet(trajetTMP,41.95,false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montréal", 12, 0));
		trajetTMP.add(new Point("Trois-Rivières", 13, 45));
		montreal.add(new Trajet(trajetTMP,41.95,false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montréal", 14, 0));
		trajetTMP.add(new Point("Trois-Rivières", 15, 45));
		montreal.add(new Trajet(trajetTMP,41.95,false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montréal", 17, 0));
		trajetTMP.add(new Point("Trois-Rivières", 19, 30));
		montreal.add(new Trajet(trajetTMP,41.95,false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montréal", 20, 0));
		trajetTMP.add(new Point("Trois-Rivières", 21, 45));
		montreal.add(new Trajet(trajetTMP,41.95,false));
		//weekend
		trajetTMP.add(new Point("Montréal", 9, 0));
		trajetTMP.add(new Point("Trois-Rivières", 11, 45));
		montreal.add(new Trajet(trajetTMP,42.95,true));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montréal", 12, 0));
		trajetTMP.add(new Point("Trois-Rivières", 13, 45));
		montreal.add(new Trajet(trajetTMP,42.95,true));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montréal", 15, 0));
		trajetTMP.add(new Point("Trois-Rivières", 16, 45));
		montreal.add(new Trajet(trajetTMP,42.95,true));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montréal", 18, 0));
		trajetTMP.add(new Point("Trois-Rivières", 20, 30));
		montreal.add(new Trajet(trajetTMP,42.95,true));
		
		trajetTMP.clear();
		trajetTMP.add(new Point("Montréal", 7, 0));
		trajetTMP.add(new Point("Québec", 10, 45));
		montreal.add(new Trajet(trajetTMP,60.95,false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montréal", 11, 0));
		trajetTMP.add(new Point("Québec", 14, 45));
		montreal.add(new Trajet(trajetTMP,60.95,false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montréal", 14, 0));
		trajetTMP.add(new Point("Québec", 15, 45));
		montreal.add(new Trajet(trajetTMP,60.95,false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montréal", 17, 0));
		trajetTMP.add(new Point("Québec", 20, 45));
		montreal.add(new Trajet(trajetTMP,60.95,false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montréal", 20, 0));
		trajetTMP.add(new Point("Québec", 23, 45));
		montreal.add(new Trajet(trajetTMP,60.95,false));
		//weekend
		trajetTMP.clear();
		trajetTMP.add(new Point("Montréal", 7, 30));
		trajetTMP.add(new Point("Québec", 10, 55));
		montreal.add(new Trajet(trajetTMP,63.95,true));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montréal", 11, 0));
		trajetTMP.add(new Point("Québec", 14, 45));
		montreal.add(new Trajet(trajetTMP,63.95,true));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montréal", 14, 30));
		trajetTMP.add(new Point("Québec", 15, 55));
		montreal.add(new Trajet(trajetTMP,63.95,true));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montréal", 17, 30));
		trajetTMP.add(new Point("Québec", 20, 55));
		montreal.add(new Trajet(trajetTMP,63.95,true));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montréal", 20, 0));
		trajetTMP.add(new Point("Québec", 23, 45));
		montreal.add(new Trajet(trajetTMP,63.95,true));
		
		trajetTMP.clear();
		trajetTMP.add(new Point("Montréal", 7, 0));
		trajetTMP.add(new Point("Toronto", 13,30));
		montreal.add(new Trajet(trajetTMP,110.95,false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montréal", 12, 0));
		trajetTMP.add(new Point("Toronto", 6, 45));
		montreal.add(new Trajet(trajetTMP,110.95,false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montréal", 16, 0));
		trajetTMP.add(new Point("Toronto", 23, 0));
		montreal.add(new Trajet(trajetTMP,110.95,false));
		trajetTMP.clear();
		//weekend
		trajetTMP.add(new Point("Montréal", 8, 0));
		trajetTMP.add(new Point("Toronto", 14,00));
		montreal.add(new Trajet(trajetTMP,115.95,true));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montréal", 12, 0));
		trajetTMP.add(new Point("Toronto", 6, 35));
		montreal.add(new Trajet(trajetTMP,115.95,true));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montréal", 16, 0));
		trajetTMP.add(new Point("Toronto", 22, 0));
		montreal.add(new Trajet(trajetTMP,115.95,true));
		
		trajetTMP.clear();
		trajetTMP.add(new Point("Montréal", 7, 0));
		trajetTMP.add(new Point("New York", 13,30));
		montreal.add(new Trajet(trajetTMP,115.95,false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montréal", 12, 0));
		trajetTMP.add(new Point("New York", 6, 45));
		montreal.add(new Trajet(trajetTMP,115.95,false));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montréal", 16, 0));
		trajetTMP.add(new Point("New York", 23, 0));
		montreal.add(new Trajet(trajetTMP,115.95,false));
		trajetTMP.clear();
		//weekend
		trajetTMP.add(new Point("Montréal", 8, 0));
		trajetTMP.add(new Point("Boston", 12, 0));
		trajetTMP.add(new Point("New York", 14,00));
		montreal.add(new Trajet(trajetTMP,110.95,true));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montréal", 12, 0));
		trajetTMP.add(new Point("New York", 6, 35));
		montreal.add(new Trajet(trajetTMP,110.95,true));
		trajetTMP.clear();
		trajetTMP.add(new Point("Montréal", 16, 0));
		trajetTMP.add(new Point("Boston", 19, 30));
		trajetTMP.add(new Point("New York", 22, 0));
		montreal.add(new Trajet(trajetTMP,110.95,true));
	
					
		this.tousLesTrajets.put("Montréal", montreal);
		
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
