package view;

import java.awt.BorderLayout;
import java.awt.Component;
import java.util.List;
import java.util.Observable;

import javax.swing.AbstractButton;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;

import model.Trajet;
import java.awt.CardLayout;

public class ConsultationHoraire extends JPanel {
	private Observable _observableObject = new Observable();

	private JButton consulterButton;

	private AbstractButton btnFR;

	private JButton btnEN;

	private JButton btnQuit;

	private JButton btnAnnuler;

	private JPanel resultPanel;

	private JComboBox comboBoxDepart;

	private JComboBox comboBoxDestination;

	/**
	 * Create the panel.
	 */
	public ConsultationHoraire(List<String> villes) {
		setLayout(new BorderLayout(0, 0));

		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);

		DefaultComboBoxModel model = new DefaultComboBoxModel();
		for (String ville : villes)
			model.addElement(ville);

		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		JPanel selectionPanel = new JPanel();
		selectionPanel.setAlignmentY(Component.TOP_ALIGNMENT);
		panel.add(selectionPanel);

		JPanel panel_3 = new JPanel();
		selectionPanel.add(panel_3);

		JLabel lblVilleDeDpart = new JLabel("Ville de d\u00E9part: ");
		panel_3.add(lblVilleDeDpart);

		comboBoxDepart = new JComboBox(model);
		panel_3.add(comboBoxDepart);

		model = new DefaultComboBoxModel();
		for (String ville : villes)
			model.addElement(ville);

		JPanel panel_4 = new JPanel();
		selectionPanel.add(panel_4);

		JLabel lblVilleDarrive = new JLabel("Ville d'arriv\u00E9e: ");
		panel_4.add(lblVilleDarrive);

		comboBoxDestination = new JComboBox(model);
		panel_4.add(comboBoxDestination);

		consulterButton = new JButton("Consulter");
		selectionPanel.add(consulterButton);

		resultPanel = new JPanel();
		panel.add(resultPanel);
		resultPanel.setLayout(new CardLayout(0, 0));

		JPanel topPanel = new JPanel();
		add(topPanel, BorderLayout.NORTH);

		JLabel lblConsultattionDhoraire = new JLabel("Consultation d'horaire: ");
		topPanel.add(lblConsultattionDhoraire);

		JPanel panelDrapeaux = new JPanel();
		this.add(panelDrapeaux, BorderLayout.SOUTH);

		btnFR = new JButton("");
		btnFR.setHorizontalAlignment(SwingConstants.LEFT);
		btnFR.setIcon(new ImageIcon("fr.jpg"));

		btnEN = new JButton("");

		btnEN.setHorizontalAlignment(SwingConstants.LEFT);
		btnEN.setIcon(new ImageIcon("en.jpg"));

		btnQuit = new JButton("Quit");

		btnAnnuler = new JButton("Retour");
		GroupLayout gl_panelDrapeaux = new GroupLayout(panelDrapeaux);
		gl_panelDrapeaux.setHorizontalGroup(gl_panelDrapeaux
				.createParallelGroup(Alignment.LEADING).addGroup(
						gl_panelDrapeaux
								.createSequentialGroup()
								.addComponent(btnFR)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(btnEN)
								.addPreferredGap(ComponentPlacement.RELATED,
										490, Short.MAX_VALUE)
								.addComponent(btnAnnuler)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(btnQuit)));
		gl_panelDrapeaux
				.setVerticalGroup(gl_panelDrapeaux
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								gl_panelDrapeaux
										.createSequentialGroup()
										.addContainerGap(47, Short.MAX_VALUE)
										.addGroup(
												gl_panelDrapeaux
														.createParallelGroup(
																Alignment.LEADING)
														.addComponent(
																btnFR,
																Alignment.TRAILING)
														.addComponent(
																btnEN,
																Alignment.TRAILING)
														.addGroup(
																Alignment.TRAILING,
																gl_panelDrapeaux
																		.createParallelGroup(
																				Alignment.BASELINE)
																		.addComponent(
																				btnQuit)
																		.addComponent(
																				btnAnnuler)))));
		panelDrapeaux.setLayout(gl_panelDrapeaux);

	}

	public JButton getConsulterButton() {
		return this.consulterButton;
	}

	public JButton getBtnConsulter() {
		return this.consulterButton;

	}

	public JButton getBtnRetour() {
		return btnAnnuler;
	}

	public JButton getBtnQuit() {
		return btnQuit;
	}

	ResultatHoraire resultatHoraire;

	public void displayHoraries(List<Trajet> trajets, String destination) {
		if (resultatHoraire != null)
			resultPanel.removeAll();

		resultPanel.add(new ResultatHoraire(trajets, destination));
		this.repaint();
		//consulterButton.doClick(); // Bricolage, je sais pas pourquoi
	}

	public JComboBox getCbDepart() {
		return comboBoxDepart;
	}

	public JComboBox getCbDest() {
		return comboBoxDestination;
	}

	public String getDepart() {
		return comboBoxDepart.getSelectedItem().toString();
	}

	public String getDest() {
		return comboBoxDestination.getSelectedItem().toString();
	}

}
