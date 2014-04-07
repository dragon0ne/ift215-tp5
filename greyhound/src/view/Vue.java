package view;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.UIManager;

public class Vue extends JFrame implements Observer {
	
	private Acceuil accueil = new Acceuil();
	private CalculItineraire calculItineraire = new CalculItineraire();
	private ItinerairesProposees itinerairesProposees = new ItinerairesProposees();
	private ConsultationHoraire consultationHoraire;

	private MainFrame mainFrame;

	public Vue()
	{
		
		// Utiliser le look and feel de l'OS utilis� si possible.		
		try {
        UIManager.setLookAndFeel(
            UIManager.getSystemLookAndFeelClassName());
		} 
		catch (Exception e) {
			System.out.println("Impossible d'utiliser le th�me graphique de l'OS.");
		}
		
		//TODO s'abonner aux �v�nements boutons
		
		
		//TODO Chercher dans le mod�le les villes
		ArrayList<String> villes = new ArrayList<String>();
		villes.add("Montr�al");
		villes.add("Toronto");
		
		consultationHoraire= new ConsultationHoraire(villes);
		
		mainFrame = new MainFrame(accueil, calculItineraire, itinerairesProposees, consultationHoraire);
		mainFrame.setVisible(true);
		mainFrame.showPanel("accueil");
		
	}
	
	
	
	public Acceuil getAcceuil() {
		return accueil;
	}



	public void setAcceuil(Acceuil acceuil) {
		this.accueil = acceuil;
	}
	
	public CalculItineraire getCalculItineraire() {
		return calculItineraire;
	}



	public void setCalculItineraire(CalculItineraire calculItineraire) {
		this.calculItineraire = calculItineraire;
	}




	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}
	
	

}
