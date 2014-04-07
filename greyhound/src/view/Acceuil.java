package view;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.Font;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.SwingConstants;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Acceuil extends JPanel {

	
	private JLabel lblBienvenueAuGreyhound;
	private JButton btnFR;
	private JButton btnEN;
	private JButton btn_calculer;
	private JButton btn_consulter;

	/**
	 * Create the frame.
	 */
	public Acceuil() {
		

		this.setLayout(new BorderLayout());
		
		lblBienvenueAuGreyhound = new JLabel("Bienvenue au Greyhound");
		lblBienvenueAuGreyhound.setForeground(Color.GRAY);
		lblBienvenueAuGreyhound.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblBienvenueAuGreyhound.setIcon(new ImageIcon("logo_greyhound_200_67.jpg"));
		this.add(lblBienvenueAuGreyhound, BorderLayout.NORTH);
		
		this.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		
		JPanel panel = new JPanel();
		this.add(panel, BorderLayout.SOUTH);
		
		btnFR = new JButton("");
		btnFR.setHorizontalAlignment(SwingConstants.LEFT);
		btnFR.setIcon(new ImageIcon("fr.jpg"));
		
		btnEN = new JButton("");
		
		btnEN.setHorizontalAlignment(SwingConstants.LEFT);
		btnEN.setIcon(new ImageIcon("en.jpg"));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(btnFR)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnEN)
					.addGap(312))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(16, Short.MAX_VALUE)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnFR, Alignment.TRAILING)
						.addComponent(btnEN, Alignment.TRAILING)))
		);
		panel.setLayout(gl_panel);
		
		JPanel panel_1 = new JPanel();
		this.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(0, 2));
		
		btn_calculer = new JButton("Calculer Itinéraire");
		panel_1.add(btn_calculer);
		
		btn_consulter = new JButton("Consulter Horaire");
		panel_1.add(btn_consulter);
		
		
	}

	/**
	 * @return the lblBienvenueAuGreyhound
	 */
	public JLabel getLblBienvenueAuGreyhound() {
		return lblBienvenueAuGreyhound;
	}

	/**
	 * @param lblBienvenueAuGreyhound the lblBienvenueAuGreyhound to set
	 */
	public void setLblBienvenueAuGreyhound(JLabel lblBienvenueAuGreyhound) {
		this.lblBienvenueAuGreyhound = lblBienvenueAuGreyhound;
	}

	/**
	 * @return the btnFR
	 */
	public JButton getBtnFR() {
		return btnFR;
	}

	/**
	 * @param btnFR the btnFR to set
	 */
	public void setBtnFR(JButton btnFR) {
		this.btnFR = btnFR;
	}

	/**
	 * @return the btnEN
	 */
	public JButton getBtnEN() {
		return btnEN;
	}

	/**
	 * @param btnEN the btnEN to set
	 */
	public void setBtnEN(JButton btnEN) {
		this.btnEN = btnEN;
	}

	/**
	 * @return the btn_calculer
	 */
	public JButton getBtn_calculer() {
		return btn_calculer;
	}

	/**
	 * @param btn_calculer the btn_calculer to set
	 */
	public void setBtn_calculer(JButton btn_calculer) {
		this.btn_calculer = btn_calculer;
	}

	/**
	 * @return the btn_consulter
	 */
	public JButton getBtn_consulter() {
		return btn_consulter;
	}

	/**
	 * @param btn_consulter the btn_consulter to set
	 */
	public void setBtn_consulter(JButton btn_consulter) {
		this.btn_consulter = btn_consulter;
	}
	
	

}
