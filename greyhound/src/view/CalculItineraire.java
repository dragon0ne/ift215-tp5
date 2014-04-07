package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class CalculItineraire extends JPanel {

	private JPanel contentPane;
	private JTextField textLieuDepart;
	private JTextField textLieuArrive;
	private JTextField textDateDepart;
	private JTextField textDateRetour;
	private ButtonGroup buttons;
	private JRadioButton btnAllerSimple;
	private JRadioButton btnAllerRetour;
	private JSpinner spinnerAdultes;
	private JSpinner spinnerEtudiants;
	private JSpinner spinnerEnfants; 
	private JButton btnFR;
	private JButton btnEN;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculItineraire frame = new CalculItineraire();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public CalculItineraire() {
		setBounds(100, 100, 817, 586);
		contentPane = new JPanel();
		this.setSize(20, 200);
		GridBagLayout gbl_this = new GridBagLayout();
		gbl_this.columnWidths = new int[]{613, 0};
		gbl_this.rowHeights = new int[]{60, 39, 51, 88, 293, 0};
		gbl_this.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_this.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		this.setLayout(gbl_this);
		
		
		
		
		JPanel panelLabelLieu = new JPanel();
		GridBagConstraints gbc_panelLabelLieu = new GridBagConstraints();
		gbc_panelLabelLieu.anchor = GridBagConstraints.WEST;
		gbc_panelLabelLieu.insets = new Insets(0, 0, 5, 0);
		gbc_panelLabelLieu.gridx = 0;
		gbc_panelLabelLieu.gridy = 0;
		this.add(panelLabelLieu, gbc_panelLabelLieu);
		panelLabelLieu.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 5));
		
		JLabel labelLieuDepart = new JLabel("Lieu de d\u00E9part :   ");
		panelLabelLieu.add(labelLieuDepart);
		labelLieuDepart.setHorizontalAlignment(SwingConstants.CENTER);
		
		textLieuDepart = new JTextField();
		panelLabelLieu.add(textLieuDepart);
		textLieuDepart.setColumns(10);
		
		JLabel labelLieuArrive = new JLabel("Lieu d'arriv\u00E9e :   ");
		panelLabelLieu.add(labelLieuArrive);
		labelLieuArrive.setHorizontalAlignment(SwingConstants.CENTER);
		
		textLieuArrive = new JTextField();
		panelLabelLieu.add(textLieuArrive);
		textLieuArrive.setColumns(10);
		
		JPanel panelRadioBouton = new JPanel();
		GridBagConstraints gbc_panelRadioBouton = new GridBagConstraints();
		gbc_panelRadioBouton.anchor = GridBagConstraints.WEST;
		gbc_panelRadioBouton.insets = new Insets(0, 0, 5, 0);
		gbc_panelRadioBouton.gridx = 0;
		gbc_panelRadioBouton.gridy = 1;
		this.add(panelRadioBouton, gbc_panelRadioBouton);
		FlowLayout flowLayout_2 = (FlowLayout) panelRadioBouton.getLayout();
		flowLayout_2.setHgap(15);
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		
		
		buttons = new ButtonGroup();
		
		
		btnAllerRetour = new JRadioButton("Aller - Retour");
		btnAllerRetour.setSelected(true);
		
		
		
		panelRadioBouton.add(btnAllerRetour);
		
		btnAllerSimple = new JRadioButton("Aller - Simple");
		panelRadioBouton.add(btnAllerSimple);
		
		
		buttons.add(btnAllerRetour);
		buttons.add(btnAllerSimple);
		
		
		JPanel panelDate = new JPanel();
		FlowLayout flowLayout_3 = (FlowLayout) panelDate.getLayout();
		flowLayout_3.setHgap(20);
		flowLayout_3.setAlignment(FlowLayout.LEFT);
		GridBagConstraints gbc_panelDate = new GridBagConstraints();
		gbc_panelDate.anchor = GridBagConstraints.WEST;
		gbc_panelDate.insets = new Insets(0, 0, 5, 0);
		gbc_panelDate.gridx = 0;
		gbc_panelDate.gridy = 2;
		this.add(panelDate, gbc_panelDate);
		
		JLabel labelDateDepart = new JLabel("Date de d\u00E9part : ");
		panelDate.add(labelDateDepart);
		
		textDateDepart = new JTextField();
		panelDate.add(textDateDepart);
		textDateDepart.setColumns(10);
		
		JLabel labelDateRetour = new JLabel("Date de retour : ");
		panelDate.add(labelDateRetour);
		
		textDateRetour = new JTextField();
		panelDate.add(textDateRetour);
		textDateRetour.setColumns(10);
		
		
		TitledBorder titled;   
		Border blackline = BorderFactory.createLineBorder(Color.black);
		titled = BorderFactory.createTitledBorder(blackline,"Billets");
		titled.setTitleJustification(TitledBorder.CENTER);
		titled.setTitlePosition(TitledBorder.DEFAULT_POSITION);

		
		
		
		JPanel panelBillets = new JPanel();
		panelBillets.setBorder(titled);
		FlowLayout flowLayout_4 = (FlowLayout) panelBillets.getLayout();
		flowLayout_4.setHgap(20);
		flowLayout_4.setAlignment(FlowLayout.LEFT);
		GridBagConstraints gbc_panelBillets = new GridBagConstraints();
		gbc_panelBillets.anchor = GridBagConstraints.WEST;
		gbc_panelBillets.insets = new Insets(0, 0, 5, 0);
		gbc_panelBillets.gridx = 0;
		gbc_panelBillets.gridy = 3;
		this.add(panelBillets, gbc_panelBillets);
		
		JLabel lblAdultes = new JLabel("Adultes : ");
		panelBillets.add(lblAdultes);
		
		spinnerAdultes = new JSpinner();
		panelBillets.add(spinnerAdultes);
		
		JLabel lblEtudiants = new JLabel("\u00C9tudiants : ");
		panelBillets.add(lblEtudiants);
		
		spinnerEtudiants = new JSpinner();
		panelBillets.add(spinnerEtudiants);
		
		JLabel lblEnfants = new JLabel("Enfants");
		panelBillets.add(lblEnfants);
		
		spinnerEnfants = new JSpinner();
		panelBillets.add(spinnerEnfants);
		
		JPanel panelDrapeaux = new JPanel();
		FlowLayout flowLayout_5 = (FlowLayout) panelDrapeaux.getLayout();
		flowLayout_5.setHgap(20);
		flowLayout_5.setAlignment(FlowLayout.LEFT);
		GridBagConstraints gbc_panelDrapeaux = new GridBagConstraints();
		gbc_panelDrapeaux.anchor = GridBagConstraints.SOUTHWEST;
		gbc_panelDrapeaux.gridx = 0;
		gbc_panelDrapeaux.gridy = 4;
		this.add(panelDrapeaux, gbc_panelDrapeaux);
		
		btnFR = new JButton("");
		btnFR.setHorizontalAlignment(SwingConstants.LEFT);
		btnFR.setIcon(new ImageIcon("fr.jpg"));
		
		btnEN = new JButton("");
		
		btnEN.setHorizontalAlignment(SwingConstants.LEFT);
		btnEN.setIcon(new ImageIcon("en.jpg"));
		
		panelDrapeaux.add(btnFR);
		panelDrapeaux.add(btnEN);
		
		
	}

	

	public JTextField getTextLieuDepart() {
		return textLieuDepart;
	}

	public void setTextLieuDepart(JTextField textLieuDepart) {
		this.textLieuDepart = textLieuDepart;
	}

	public JTextField getTextLieuArrive() {
		return textLieuArrive;
	}

	public void setTextLieuArrive(JTextField textLieuArrive) {
		this.textLieuArrive = textLieuArrive;
	}

	public JTextField getTextDateDepart() {
		return textDateDepart;
	}

	public void setTextDateDepart(JTextField textDateDepart) {
		this.textDateDepart = textDateDepart;
	}

	public JTextField getTextDateRetour() {
		return textDateRetour;
	}

	public void setTextDateRetour(JTextField textDateRetour) {
		this.textDateRetour = textDateRetour;
	}

	public ButtonGroup getButtons() {
		return buttons;
	}

	public void setButtons(ButtonGroup buttons) {
		this.buttons = buttons;
	}

	public JRadioButton getBtnAllerSimple() {
		return btnAllerSimple;
	}

	public void setBtnAllerSimple(JRadioButton btnAllerSimple) {
		this.btnAllerSimple = btnAllerSimple;
	}

	public JRadioButton getBtnAllerRetour() {
		return btnAllerRetour;
	}

	public void setBtnAllerRetour(JRadioButton btnAllerRetour) {
		this.btnAllerRetour = btnAllerRetour;
	}

	public JSpinner getSpinnerAdultes() {
		return spinnerAdultes;
	}

	public void setSpinnerAdultes(JSpinner spinnerAdultes) {
		this.spinnerAdultes = spinnerAdultes;
	}

	public JSpinner getSpinnerEtudiants() {
		return spinnerEtudiants;
	}

	public void setSpinnerEtudiants(JSpinner spinnerEtudiants) {
		this.spinnerEtudiants = spinnerEtudiants;
	}

	public JSpinner getSpinnerEnfants() {
		return spinnerEnfants;
	}

	public void setSpinnerEnfants(JSpinner spinnerEnfants) {
		this.spinnerEnfants = spinnerEnfants;
	}

	public JButton getBtnFR() {
		return btnFR;
	}

	public void setBtnFR(JButton btnFR) {
		this.btnFR = btnFR;
	}

	public JButton getBtnEN() {
		return btnEN;
	}

	public void setBtnEN(JButton btnEN) {
		this.btnEN = btnEN;
	}
	
	

}
