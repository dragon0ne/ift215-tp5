package view;

import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import javax.swing.BoxLayout;
import javax.swing.JComboBox;

public class ConsultationHoraire extends JPanel 
{
	private Observable _observableObject = new Observable();
	
	private JButton consulterButton;
	

	/**
	 * Create the panel.
	 */
	public ConsultationHoraire(List<String> villes) 
	{
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.CENTER);
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3);
		
		JLabel lblVilleDeDpart = new JLabel("Ville de d\u00E9part: ");
		panel_3.add(lblVilleDeDpart);
		
		JComboBox comboBox = new JComboBox();
		panel_3.add(comboBox);
		
		DefaultComboBoxModel model = new DefaultComboBoxModel();
		for(String ville : villes)
			model.addElement(ville);
		
		comboBox.setModel(model);
		
		JPanel panel_4 = new JPanel();
		panel.add(panel_4);
		
		JLabel lblVilleDarrive = new JLabel("Ville d'arriv\u00E9e: ");
		panel_4.add(lblVilleDarrive);
		
		model = new DefaultComboBoxModel();
		for(String ville : villes)
			model.addElement(ville);
		
		JComboBox comboBox_1 = new JComboBox(model);
		panel_4.add(comboBox_1);
		
		JPanel panel_1 = new JPanel();
		add(panel_1, BorderLayout.NORTH);
		
		JLabel lblConsultattionDhoraire = new JLabel("Consultation d'horaire: ");
		panel_1.add(lblConsultattionDhoraire);
		
		JPanel panel_2 = new JPanel();
		add(panel_2, BorderLayout.SOUTH);
		
		consulterButton = new JButton("Consulter");
		panel_2.add(consulterButton);
		
	}
	
	public JButton getConsulterButton()
	{
		return this.consulterButton;
	}

}
