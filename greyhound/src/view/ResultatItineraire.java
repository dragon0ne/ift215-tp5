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

public class ResultatItineraire extends JPanel implements ActionListener
{

	/**
	 * Create the panel.
	 */
	public ResultatItineraire(String heureDepart, String heureArrivee, String duree, List<String> details) {
		setLayout(new BorderLayout(0, 0));
		
		JPanel topZonePanel = new JPanel();
		add(topZonePanel, BorderLayout.NORTH);
		
		JLabel lblDpart = new JLabel("D\u00E9part: ");
		topZonePanel.add(lblDpart);
		
		JLabel lblHeuredpart = new JLabel(heureDepart);
		topZonePanel.add(lblHeuredpart);
		
		JLabel lblArrive = new JLabel("Arriv\u00E9e: ");
		topZonePanel.add(lblArrive);
		
		JLabel lblHeurearrive = new JLabel(heureArrivee);
		topZonePanel.add(lblHeurearrive);
		
		JLabel lblDure = new JLabel("Dur\u00E9e: ");
		topZonePanel.add(lblDure);
		
		JLabel lblValueDuree = new JLabel(duree);
		topZonePanel.add(lblValueDuree);
		
		JPanel buttonZonePanel = new JPanel();
		add(buttonZonePanel, BorderLayout.SOUTH);
		
		JButton btnAfficherLesDtails = new JButton("Afficher les d\u00E9tails");
		buttonZonePanel.add(btnAfficherLesDtails);
		btnAfficherLesDtails.addActionListener(this);
		
		JButton btnChoisir = new JButton("Choisir");
		buttonZonePanel.add(btnChoisir);

		DefaultListModel model = new DefaultListModel();
		for(String detail : details)
			model.addElement(detail);
		
		this._list = new JList(model);
	}

	private JList _list;
	
	private boolean isDeployed = false;
	
	public void actionPerformed(ActionEvent e) {
	 System.out.println("plop");
		if(isDeployed)
			this.remove(_list);
		else
			this.add(_list);
		
		System.out.println(_list.getModel().getSize());
		

		JFrame frame = new JFrame();
		frame.add(_list);
		frame.setVisible(true);
		
		isDeployed = !isDeployed;
	}

}
