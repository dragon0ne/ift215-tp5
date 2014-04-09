package view;

import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListModel;

import model.Trajet;

public class ResultatItineraire extends JPanel 
{
	private JLabel lblDpart;
	private JLabel lblHeuredpart;
	private JLabel lblArrive;
	private JLabel lblHeurearrive;
	private JLabel lblDure;
	private JButton btnAfficherLesDtails;
	private JButton btnChoisir;
	private JList _list;

	/**
	 * Create the panel.
	 */
	public ResultatItineraire(Trajet trajet) {
		setLayout(new BorderLayout(0, 0));
		
		JPanel topZonePanel = new JPanel();
		add(topZonePanel, BorderLayout.NORTH);
		
		lblDpart = new JLabel("D\u00E9part: ");
		topZonePanel.add(lblDpart);
		
		lblHeuredpart = new JLabel(trajet.getTrajet().firstElement().getHeure());
		topZonePanel.add(lblHeuredpart);
		
		lblArrive = new JLabel("Arriv\u00E9e: ");
		topZonePanel.add(lblArrive);
		
		lblHeurearrive = new JLabel(trajet.getTrajet().lastElement().getHeure());
		topZonePanel.add(lblHeurearrive);
		
		lblDure = new JLabel("Dur\u00E9e: ");
		topZonePanel.add(lblDure);
		
		JLabel lblValueDuree = new JLabel(trajet.getDure());
		topZonePanel.add(lblValueDuree);
		
		JPanel buttonZonePanel = new JPanel();
		add(buttonZonePanel, BorderLayout.SOUTH);
		
		btnAfficherLesDtails = new JButton("Afficher les d\u00E9tails");
		buttonZonePanel.add(btnAfficherLesDtails);
				
		btnChoisir = new JButton("Choisir");
		buttonZonePanel.add(btnChoisir);

		DefaultListModel model = new DefaultListModel();
		for(String detail : trajet.getVillesDetail())
			model.addElement(detail);
		
		this._list = new JList(model);
		
		this.add(_list,BorderLayout.CENTER);
	}

	/**
	 * @return the lblDpart
	 */
	public JLabel getLblDpart() {
		return lblDpart;
	}

	
	/**
	 * @return the lblArrive
	 */
	public JLabel getLblArrive() {
		return lblArrive;
	}


	/**
	 * @return the lblDure
	 */
	public JLabel getLblDure() {
		return lblDure;
	}

	/**
	 * @return the btnAfficherLesDtails
	 */
	public JButton getBtnAfficherLesDtails() {
		return btnAfficherLesDtails;
	}

	/**
	 * @return the btnChoisir
	 */
	public JButton getBtnChoisir() {
		return btnChoisir;
	}

	
	

	
	

}
