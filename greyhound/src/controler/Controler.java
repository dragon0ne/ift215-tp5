/**
 * 
 */
package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Textes;

import view.Acceuil;
import view.CalculItineraire;
import view.Vue;

/**
 * @author HELL
 *
 */
public class Controler {
	private Acceuil acceuil;
	private CalculItineraire calculItineraire;
	private Vue vue;
	private Textes textes;

	public Controler() {
		// TODO Auto-generated constructor stub
		this.textes = new Textes();
		this.vue = new Vue();
		
		acceuil = vue.getAcceuil();
		calculItineraire = vue.getCalculItineraire();
		//acceuil.setVisible(true);
		
		acceuil.getBtnEN().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				acceuil.getLblBienvenueAuGreyhound().setText(textes.getAcceuil_en().get(0));
				acceuil.getBtn_calculer().setText(textes.getAcceuil_en().get(1));
				acceuil.getBtn_consulter().setText(textes.getAcceuil_en().get(2));
			}
		});
		
		acceuil.getBtnFR().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				acceuil.getLblBienvenueAuGreyhound().setText(textes.getAcceuil_fr().get(0));
				acceuil.getBtn_calculer().setText(textes.getAcceuil_fr().get(1));
				acceuil.getBtn_consulter().setText(textes.getAcceuil_fr().get(2));
			}
		});
		
		acceuil.getBtn_calculer().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calculItineraire.setVisible(true);
				acceuil.setVisible(false);
			}
		});
			
	}
	
}
