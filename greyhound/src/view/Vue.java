package view;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.UIManager;

public class Vue extends JFrame implements Observer {
	
	private Accueil accueil = new Accueil();
	private CalculItineraire calculItineraire = new CalculItineraire();
	private ItinerairesProposees itinerairesProposees = new ItinerairesProposees();
	private ConsultationHoraire consultationHoraire;

	private MainFrame mainFrame;

	public Vue(ConsultationHoraire consultationH)
	{
		this.consultationHoraire = consultationH;
		
		// Utiliser le look and feel de l'OS utilisé si possible.		
		try {
        UIManager.setLookAndFeel(
            UIManager.getSystemLookAndFeelClassName());
		} 
		catch (Exception e) {
			System.out.println("Impossible d'utiliser le thème graphique de l'OS.");
		}
		
		//TODO s'abonner aux évènements boutons
		
		

		
		mainFrame = new MainFrame(accueil, calculItineraire, itinerairesProposees, consultationH);
		mainFrame.setVisible(true);
		mainFrame.showPanel("accueil");
		
	}
	
	
	
	/**
	 * @return the accueil
	 */
	public Accueil getAccueil() {
		return accueil;
	}



	/**
	 * @param accueil the accueil to set
	 */
	public void setAccueil(Accueil accueil) {
		this.accueil = accueil;
	}



	/**
	 * @return the itinerairesProposees
	 */
	public ItinerairesProposees getItinerairesProposees() {
		return itinerairesProposees;
	}



	/**
	 * @param itinerairesProposees the itinerairesProposees to set
	 */
	public void setItinerairesProposees(ItinerairesProposees itinerairesProposees) {
		this.itinerairesProposees = itinerairesProposees;
	}



	/**
	 * @return the consultationHoraire
	 */
	public ConsultationHoraire getConsultationHoraire() {
		return consultationHoraire;
	}



	/**
	 * @param consultationHoraire the consultationHoraire to set
	 */
	public void setConsultationHoraire(ConsultationHoraire consultationHoraire) {
		this.consultationHoraire = consultationHoraire;
	}



	/**
	 * @return the mainFrame
	 */
	public MainFrame getMainFrame() {
		return mainFrame;
	}



	/**
	 * @param mainFrame the mainFrame to set
	 */
	public void setMainFrame(MainFrame mainFrame) {
		this.mainFrame = mainFrame;
	}

	


	/**
	 * @return the calculItineraire
	 */
	public CalculItineraire getCalculItineraire() {
		return calculItineraire;
	}



	/**
	 * @param calculItineraire the calculItineraire to set
	 */
	public void setCalculItineraire(CalculItineraire calculItineraire) {
		this.calculItineraire = calculItineraire;
	}



	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}
	
	

}
