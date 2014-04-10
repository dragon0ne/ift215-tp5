package view;

import java.awt.BorderLayout;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

import model.Trajet;

public class ResultatHoraire extends JTabbedPane
{

	/**
	 * Create the panel.
	 */
	public ResultatHoraire(List<Trajet> trajets, String destination) {

		
		JTable table = new HoraireTable(trajets, false, destination);
		JScrollPane semainePanel = new JScrollPane(table);
		addTab("Semaine", null, semainePanel, null);
		
		table = new HoraireTable(trajets, true, destination);
		JScrollPane weekendPanel = new JScrollPane(table);
		addTab("Week-end", null, weekendPanel, null);

	}
}
