package view;

import java.awt.CardLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MainFrame extends JFrame
{
	private JPanel contentPane;

	
	public MainFrame(Accueil accueil, CalculItineraire calculItineraire, ItinerairesProposees itinerairesProposees, ConsultationHoraire consultationHoraire)
	{
		setResizable(false);
		setTitle("Greyhound");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel(new CardLayout());
		setContentPane(contentPane);
		
		
		contentPane.add(accueil, "accueil");
		contentPane.add(calculItineraire, "calcul");
		contentPane.add(itinerairesProposees, "itinerairesProposees");
		contentPane.add(consultationHoraire , "horaire");
	}
	
	public void showPanel(String panelToShow) {
		CardLayout currentLayout = (CardLayout) (contentPane.getLayout());
		currentLayout.show(contentPane, panelToShow);
		this.setSize(contentPane.getPreferredSize());
		
	}
}
