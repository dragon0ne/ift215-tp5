package view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.Calendar;
import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import net.sourceforge.jdatepicker.JDatePicker;
import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;

public class CalculItineraire extends JPanel {

	private JPanel contentPane;
	private JComboBox cbLieuDepart;
	private JComboBox cbLieuArrive;

	private JTextField textDateRetour;
	private ButtonGroup buttons;
	private JRadioButton btnAllerSimple;
	private JRadioButton btnAllerRetour;
	private JSpinner spinnerAdultes;
	private JSpinner spinnerEtudiants;
	private JSpinner spinnerEnfants; 
	private JButton btnFR;
	private JButton btnEN;
	private JLabel labelLieuDepart;
	private JLabel labelLieuArrive;
	private JLabel labelDateDepart;
	private JLabel labelDateRetour;
	private JLabel lblAdultes;
	private JLabel lblEtudiants;
	private JLabel lblEnfants;
	private JLabel label;
	private JLabel labelLogo;
	private JButton btnAnnuler;
	private JButton btnCalculer;
	private JLabel label_1;
	private TitledBorder titled; 
	private JButton btnQuit;

	JDatePickerImpl datepDepart = new JDatePickerImpl(new JDatePanelImpl(new UtilDateModel(new Date())));
	JDatePickerImpl datepRetour = new JDatePickerImpl(new JDatePanelImpl(new UtilDateModel(new Date())));
	private JPanel panelDate;
	
	
	
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
		this.setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		this.setSize(700, 500);
		this.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panelLogo = new JPanel();
		FlowLayout flowLayout_0 = (FlowLayout) panelLogo.getLayout();
		flowLayout_0.setHgap(0);
		flowLayout_0.setAlignment(FlowLayout.LEFT);
		this.add(panelLogo);
		
		labelLogo = new JLabel("Calculer Itineraire");
		labelLogo.setIcon(new ImageIcon("C:\\Users\\HELL\\Desktop\\ift215 h14\\greyhound\\logo_greyhound_200_67.jpg"));
		labelLogo.setForeground(Color.GRAY);
		labelLogo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		panelLogo.add(labelLogo);
		
		
		
		JPanel panelLieu = new JPanel();
		this.add(panelLieu);
		panelLieu.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 5));
		
		labelLieuDepart = new JLabel("Lieu de d\u00E9part:   ");
		panelLieu.add(labelLieuDepart);
		labelLieuDepart.setHorizontalAlignment(SwingConstants.CENTER);
		
		cbLieuDepart = new JComboBox();
		panelLieu.add(cbLieuDepart);
		
		labelLieuArrive = new JLabel("Lieu d'arriv\u00E9e:   ");
		panelLieu.add(labelLieuArrive);
		labelLieuArrive.setHorizontalAlignment(SwingConstants.CENTER);
		
		cbLieuArrive = new JComboBox();
		panelLieu.add(cbLieuArrive);
		
		JPanel panelRadioBouton = new JPanel();
		this.add(panelRadioBouton);
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
		
		
		panelDate = new JPanel();
		FlowLayout flowLayout_3 = (FlowLayout) panelDate.getLayout();
		flowLayout_3.setHgap(20);
		flowLayout_3.setAlignment(FlowLayout.LEFT);
		this.add(panelDate);
		
		labelDateDepart = new JLabel("Date de d\u00E9part : ");
		panelDate.add(labelDateDepart);
		
			
	
		panelDate.add(datepDepart);
		
		
		
		labelDateRetour = new JLabel("Date de retour : ");
		panelDate.add(labelDateRetour);
		
		panelDate.add(datepRetour);
		
		
		  
		Border blackline = BorderFactory.createLineBorder(Color.black);
		titled = BorderFactory.createTitledBorder(blackline,"Billets/Tickets");
		
		titled.setTitle("Billets");
		titled.setTitleJustification(TitledBorder.CENTER);
		titled.setTitlePosition(TitledBorder.DEFAULT_POSITION);
		
		
		
		JPanel panelBillets = new JPanel();
		panelBillets.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Billets/Tickets", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		FlowLayout flowLayout_4 = (FlowLayout) panelBillets.getLayout();
		flowLayout_4.setHgap(20);
		flowLayout_4.setAlignment(FlowLayout.LEFT);
		this.add(panelBillets);
		panelBillets.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblAdultes = new JLabel("Adultes : ");
		panelBillets.add(lblAdultes);
		
		spinnerAdultes = new JSpinner();
		spinnerAdultes.setModel(new SpinnerNumberModel(0, 0, 20, 1));
		panelBillets.add(spinnerAdultes);
		
		lblEtudiants = new JLabel("\u00C9tudiants : ");
		panelBillets.add(lblEtudiants);
		
		spinnerEtudiants = new JSpinner();
		spinnerEtudiants.setModel(new SpinnerNumberModel(0, 0, 20, 1));
		panelBillets.add(spinnerEtudiants);
		
		lblEnfants = new JLabel("Enfants :");
		panelBillets.add(lblEnfants);
		
		spinnerEnfants = new JSpinner();
		spinnerEnfants.setModel(new SpinnerNumberModel(0, 0, 20, 1));
		panelBillets.add(spinnerEnfants);
		
		JPanel panelBtnAction = new JPanel();
		FlowLayout flowLayout_btn = (FlowLayout) panelBtnAction.getLayout();
		flowLayout_btn.setHgap(0);
		flowLayout_btn.setAlignment(FlowLayout.RIGHT);
		this.add(panelBtnAction);
		
		label_1 = new JLabel("  ");
		panelBtnAction.add(label_1);
		
		btnCalculer = new JButton("Calculer");
		panelBtnAction.add(btnCalculer);
		
		JPanel panelDrapeaux = new JPanel();
		this.add(panelDrapeaux);
		
		
		btnFR = new JButton("");
		btnFR.setHorizontalAlignment(SwingConstants.LEFT);
		btnFR.setIcon(new ImageIcon("fr.jpg"));
		
		btnEN = new JButton("");
		
		btnEN.setHorizontalAlignment(SwingConstants.LEFT);
		btnEN.setIcon(new ImageIcon("en.jpg"));
		
		btnQuit = new JButton("Quit");
		
		btnAnnuler = new JButton("Retour");
		GroupLayout gl_panelDrapeaux = new GroupLayout(panelDrapeaux);
		gl_panelDrapeaux.setHorizontalGroup(
			gl_panelDrapeaux.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelDrapeaux.createSequentialGroup()
					.addComponent(btnFR)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnEN)
					.addPreferredGap(ComponentPlacement.RELATED, 490, Short.MAX_VALUE)
					.addComponent(btnAnnuler)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnQuit))
		);
		gl_panelDrapeaux.setVerticalGroup(
			gl_panelDrapeaux.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelDrapeaux.createSequentialGroup()
					.addContainerGap(47, Short.MAX_VALUE)
					.addGroup(gl_panelDrapeaux.createParallelGroup(Alignment.LEADING)
						.addComponent(btnFR, Alignment.TRAILING)
						.addComponent(btnEN, Alignment.TRAILING)
						.addGroup(Alignment.TRAILING, gl_panelDrapeaux.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnQuit)
							.addComponent(btnAnnuler))))
		);
		panelDrapeaux.setLayout(gl_panelDrapeaux);
		
		
	}

	

	/**
	 * @return the btnQuit
	 */
	public JButton getBtnQuit() {
		return btnQuit;
	}



	/**
	 * @return the btnAnnuler
	 */
	public JButton getBtnAnnuler() {
		return btnAnnuler;
	}



	/**
	 * @return the btnCalculer
	 */
	public JButton getBtnCalculer() {
		return btnCalculer;
	}



	/**
	 * @return the labelLogo
	 */
	public JLabel getLabelLogo() {
		return labelLogo;
	}



	/**
	 * @return the dateDepart
	 */
	public JDatePickerImpl getDateDepart() {
		return datepDepart;
	}



	/**
	 * @return the dateRetour
	 */
	public JDatePickerImpl getDateRetour() {
		return datepRetour;
		
	}

	boolean departhiden = false;
	
	public void HideDepartDatep(boolean toHide)
	{
		if(toHide == departhiden)
			return;
		
		if(toHide)
		{

			panelDate.remove(labelDateRetour);
			panelDate.remove(datepRetour);
		}
		else
		{
			panelDate.add(labelDateRetour);
			panelDate.add(datepRetour);
		}
		
		panelDate.repaint();
		
		departhiden = !departhiden;
			
	}


	/**
	 * @return the labelLieuDepart
	 */
	public JLabel getLabelLieuDepart() {
		return labelLieuDepart;
	}



	/**
	 * @return the labelLieuArrive
	 */
	public JLabel getLabelLieuArrive() {
		return labelLieuArrive;
	}



	/**
	 * @return the labelDateDepart
	 */
	public JLabel getLabelDateDepart() {
		return labelDateDepart;
	}



	/**
	 * @return the labelDateRetour
	 */
	public JLabel getLabelDateRetour() {
		return labelDateRetour;
	}



	/**
	 * @return the titled
	 */
	public TitledBorder getTitled() {
		return titled;
	}



	/**
	 * @return the lblAdultes
	 */
	public JLabel getLblAdultes() {
		return lblAdultes;
	}



	/**
	 * @return the lblEtudiants
	 */
	public JLabel getLblEtudiants() {
		return lblEtudiants;
	}



	/**
	 * @return the lblEnfants
	 */
	public JLabel getLblEnfants() {
		return lblEnfants;
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



	/**
	 * @return the cbLieuDepart
	 */
	public JComboBox getCbLieuDepart() {
		return cbLieuDepart;
	}



	/**
	 * @param cbLieuDepart the cbLieuDepart to set
	 */
	public void setCbLieuDepart(JComboBox cbLieuDepart) {
		this.cbLieuDepart = cbLieuDepart;
	}



	/**
	 * @return the cbLieuArrive
	 */
	public JComboBox getCbLieuArrive() {
		return cbLieuArrive;
	}



	/**
	 * @param cbLieuArrive the cbLieuArrive to set
	 */
	public void setCbLieuArrive(JComboBox cbLieuArrive) {
		this.cbLieuArrive = cbLieuArrive;
	}
	
	

}
