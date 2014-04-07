/**
 * 
 */
package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * @author birj2002
 *
 */
public class Villes {
	private static List<String> Villes = new ArrayList<String>()
			{{
				add("Montréal");
				add("Toronto");
				add("Québec");
				add("NYC");
				add("Ottawa");
			}};

	
	public Villes() {

		
	}

	public Villes(List<String> villes) {
		super();
		Villes = villes;
	}

	public static List<String> getVilles() {
		return Villes;
	}

	public void setVilles(List<String> villes) {
		Villes = villes;
	}
	
	

}
