package view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JList;

public class Plop extends JPanel {

	/**
	 * Create the panel.
	 */
	public Plop() {
setLayout(new BorderLayout(0, 0));
		
		JPanel topZonePanel = new JPanel();
		add(topZonePanel, BorderLayout.NORTH);
		
		JLabel lblItinrairesProposes = new JLabel("Itin\u00E9raires propos\u00E9es: ");
		topZonePanel.add(lblItinrairesProposes);
		
		JLabel lblRappel = new JLabel("Rappel");
		topZonePanel.add(lblRappel);
		
		JPanel buttonZonePanel = new JPanel();
		add(buttonZonePanel, BorderLayout.SOUTH);
		
		JButton btnItinrairesPlusTt = new JButton("Itin\u00E9raires plus t\u00F4t");
		buttonZonePanel.add(btnItinrairesPlusTt);
		
		JButton btnItinrairesPlusTard = new JButton("Itin\u00E9raires plus tard");
		buttonZonePanel.add(btnItinrairesPlusTard);
		
		JPanel resultsPanel = new JPanel();
		add(resultsPanel, BorderLayout.CENTER);

		List<String> details =  new ArrayList<String>();
		details.add("plop");
		details.add("test");
		resultsPanel.add(new ResultatItineraire("h1", "h2", "d1",details));
		resultsPanel.add(new ResultatItineraire("h1", "h2", "d1",details));
		resultsPanel.add(new ResultatItineraire("h1", "h2", "d1", details));
		
		JList list = new JList();
		resultsPanel.add(list);
		
	}

}
