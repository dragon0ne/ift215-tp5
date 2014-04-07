package view;

import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JButton;

import model.Villes;

public class ItinerairesProposees extends JPanel
{

	private JButton btnItinrairesPlusTt;
	private JButton btnItinrairesPlusTard;

	/**
	 * Create the panel.
	 */
	public ItinerairesProposees() {
		setLayout(new BorderLayout(0, 0));
		
		JPanel topZonePanel = new JPanel();
		add(topZonePanel, BorderLayout.NORTH);
		
		JLabel lblItinrairesProposes = new JLabel("Itin\u00E9raires propos\u00E9es: ");
		topZonePanel.add(lblItinrairesProposes);
		
		JLabel lblRappel = new JLabel("Rappel");
		topZonePanel.add(lblRappel);
		
		JPanel buttonZonePanel = new JPanel();
		add(buttonZonePanel, BorderLayout.SOUTH);
		
		btnItinrairesPlusTt = new JButton("Itin\u00E9raires plus t\u00F4t");
		buttonZonePanel.add(btnItinrairesPlusTt);
		
		btnItinrairesPlusTard = new JButton("Itin\u00E9raires plus tard");
		buttonZonePanel.add(btnItinrairesPlusTard);
		
		JPanel resultsPanel = new JPanel();
		add(resultsPanel, BorderLayout.CENTER);
		resultsPanel.setLayout(new BoxLayout(resultsPanel, BoxLayout.Y_AXIS));
		
		
		resultsPanel.add(new ResultatItineraire("h1", "h2", "d1", Villes.getVilles()));
		resultsPanel.add(new ResultatItineraire("h1", "h2", "d1", Villes.getVilles()));
		resultsPanel.add(new ResultatItineraire("h1", "h2", "d1", Villes.getVilles()));	
	}

	public JButton getBtnItinrairesPlusTot() {
		return btnItinrairesPlusTt;
	}

	public JButton getBtnItinrairesPlusTard() {
		return btnItinrairesPlusTard;
	}

}
