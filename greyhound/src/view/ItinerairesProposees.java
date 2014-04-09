package view;

import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JScrollPane;

import model.Villes;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.FlowLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollBar;
import java.awt.Component;

public class ItinerairesProposees extends JPanel
{

	private JButton btnItinrairesPlusTot;
	private JButton btnItinrairesPlusTard;
	private JLabel lblItinrairesProposes;
	private JPanel resultsPanel;
	private JButton btnFR;
	private JButton btnEN;
	private JButton btnQuit;
	private JButton btnRetour;
	private JLabel lblAller;
	private JLabel lblRetour;

	/**
	 * Create the panel.
	 */
	public ItinerairesProposees() {
		this.setBounds(100, 100, 600, 400);
		this.setLayout(new BorderLayout(0, 0));
		
		JPanel topZonePanel = new JPanel();
		FlowLayout flowLayout_0 = (FlowLayout) topZonePanel.getLayout();
		flowLayout_0.setHgap(0);
		flowLayout_0.setAlignment(FlowLayout.LEFT);
		add(topZonePanel, BorderLayout.NORTH);
		
		lblItinrairesProposes = new JLabel("Itin\u00E9raires propos\u00E9es: ");
		lblItinrairesProposes.setIcon(new ImageIcon("C:\\Users\\HELL\\Desktop\\ift215 h14\\greyhound\\logo_greyhound_200_67.jpg"));
		lblItinrairesProposes.setForeground(Color.GRAY);
		lblItinrairesProposes.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		
		lblAller = new JLabel("Aller");
		lblAller.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAller.setForeground(Color.BLUE);
		topZonePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		topZonePanel.add(lblItinrairesProposes);
		topZonePanel.add(lblAller);
		
		lblRetour = new JLabel("Retour");
		lblRetour.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRetour.setForeground(Color.RED);
		topZonePanel.add(lblRetour);
		
		JPanel panelSouth = new JPanel();
		panelSouth.setLayout(new BorderLayout());
		this.add(panelSouth, BorderLayout.SOUTH);
		
		JPanel buttonZonePanel = new JPanel();
		panelSouth.add(buttonZonePanel, BorderLayout.NORTH);
		
		btnItinrairesPlusTot = new JButton("<< Itin\u00E9raires jour pr\u00E9c\u00E9dent");
		buttonZonePanel.add(btnItinrairesPlusTot);
		
		btnItinrairesPlusTard = new JButton("Itin\u00E9raires jour suivant tard >>");
		buttonZonePanel.add(btnItinrairesPlusTard);
		
		resultsPanel = new JPanel();
		add(resultsPanel, BorderLayout.CENTER);
		resultsPanel.setLayout(new BoxLayout(resultsPanel, BoxLayout.Y_AXIS));
		
		JScrollPane scrollBar = new JScrollPane(resultsPanel);
		this.add(scrollBar, BorderLayout.CENTER);
		scrollBar.setAlignmentY(Component.TOP_ALIGNMENT);
		scrollBar.setAlignmentX(Component.RIGHT_ALIGNMENT);
		
		
		JPanel panelBas = new JPanel();
		panelSouth.add(panelBas, BorderLayout.SOUTH);
		
		btnFR = new JButton("");
		btnFR.setIcon(new ImageIcon("C:\\Users\\HELL\\Desktop\\ift215 h14\\greyhound\\fr.jpg"));
		
		btnEN = new JButton("");
		btnEN.setIcon(new ImageIcon("C:\\Users\\HELL\\Desktop\\ift215 h14\\greyhound\\en.jpg"));
		
		btnQuit = new JButton("Quit");
		
		btnRetour = new JButton("Retour");
		GroupLayout gl_panelBas = new GroupLayout(panelBas);
		gl_panelBas.setHorizontalGroup(
			gl_panelBas.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelBas.createSequentialGroup()
					.addComponent(btnFR)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnEN)
					.addPreferredGap(ComponentPlacement.RELATED, 332, Short.MAX_VALUE)
					.addComponent(btnRetour)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnQuit))
		);
		gl_panelBas.setVerticalGroup(
			gl_panelBas.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelBas.createSequentialGroup()
					.addContainerGap(16, Short.MAX_VALUE)
					.addGroup(gl_panelBas.createParallelGroup(Alignment.LEADING)
						.addComponent(btnFR, Alignment.TRAILING)
						.addComponent(btnEN, Alignment.TRAILING)
						.addGroup(Alignment.TRAILING, gl_panelBas.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnQuit)
							.addComponent(btnRetour))))
		);
		panelBas.setLayout(gl_panelBas);
	}

	
	
	/**
	 * @return the lblAller
	 */
	public JLabel getLblAller() {
		return lblAller;
	}



	/**
	 * @return the lblRetour
	 */
	public JLabel getLblRetour() {
		return lblRetour;
	}



	/**
	 * @return the btnFr
	 */
	public JButton getBtnFr() {
		return btnFR;
	}


	/**
	 * @return the btnEn
	 */
	public JButton getBtnEn() {
		return btnEN;
	}


	/**
	 * @return the btnQuit
	 */
	public JButton getBtnQuit() {
		return btnQuit;
	}


	/**
	 * @return the btnRetour
	 */
	public JButton getBtnRetour() {
		return btnRetour;
	}


	/**
	 * @return the resultsPanel
	 */
	public JPanel getResultsPanel() {
		return resultsPanel;
	}

	public JButton getBtnItinrairesPlusTot() {
		return btnItinrairesPlusTot;
	}

	public JButton getBtnItinrairesPlusTard() {
		return btnItinrairesPlusTard;
	}

	/**
	 * @return the lblItinrairesProposes
	 */
	public JLabel getLblItinrairesProposes() {
		return lblItinrairesProposes;
	}

}
