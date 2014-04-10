/**
 * 
 */
package controler;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JButton;

import model.Model;
import model.Textes;
import model.Trajet;
import view.Accueil;
import view.CalculItineraire;
import view.ConsultationHoraire;
import view.ItinerairesProposees;
import view.ResultatItineraire;
import view.Vue;

/**
 * @author HELL
 * 
 */
public class Controler {
	private Accueil acceuil;
	private CalculItineraire calculItineraire;
	private ItinerairesProposees itinerairesProposees;
	private Vue vue;
	private Textes textes;
	private Model model;
	private ConsultationHoraire consultationHoraire;

	public Controler() {
		// TODO Auto-generated constructor stub
		this.textes = new Textes();

		// acceuil.setVisible(true);
		this.model = new Model();
		this.vue = new Vue(new ConsultationHoraire(model.getVillesDepart()));
		this.acceuil = vue.getAccueil();
		this.calculItineraire = vue.getCalculItineraire();
		this.itinerairesProposees = vue.getItinerairesProposees();
		this.consultationHoraire = vue.getConsultationHoraire();

		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		vue.getMainFrame().setMaximumSize(new Dimension(screenSize.width, screenSize.height-500));
		
		// START Acceuil page
		acceuil.getBtnEN().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				acceuil.getLblBienvenueAuGreyhound().setText(
						textes.getAcceuil_en().get(0));
				acceuil.getBtn_calculer()
						.setText(textes.getAcceuil_en().get(1));
				acceuil.getBtn_consulter().setText(
						textes.getAcceuil_en().get(2));
			}
		});

		acceuil.getBtnFR().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				acceuil.getLblBienvenueAuGreyhound().setText(
						textes.getAcceuil_fr().get(0));
				acceuil.getBtn_calculer()
						.setText(textes.getAcceuil_fr().get(1));
				acceuil.getBtn_consulter().setText(
						textes.getAcceuil_fr().get(2));
			}
		});

		acceuil.getBtn_calculer().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vue.getMainFrame().showPanel("calcul");
				for (String villeDepart : model.getTousLesTrajets().keySet()) {
					calculItineraire.getCbLieuDepart().addItem(villeDepart);
				}
			}
		});

		acceuil.getBtn_consulter().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vue.getMainFrame().showPanel("horaire");
				consultationHoraire.getCbDepart().setSelectedIndex(0);
			}
		});

		acceuil.getBtnQuit().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vue.getMainFrame().setVisible(false);
			}
		});
		// END Acceuil page

		// START CALCULITINERAIRE PAGE
		calculItineraire.getBtnFR().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calculItineraire.getLabelLogo().setText(
						textes.getCalculIt_fr().get(0));
				calculItineraire.getLabelLieuDepart().setText(
						textes.getCalculIt_fr().get(1));
				calculItineraire.getLabelLieuArrive().setText(
						textes.getCalculIt_fr().get(2));
				calculItineraire.getBtnAllerRetour().setText(
						textes.getCalculIt_fr().get(3));
				calculItineraire.getBtnAllerSimple().setText(
						textes.getCalculIt_fr().get(4));
				calculItineraire.getLabelDateDepart().setText(
						textes.getCalculIt_fr().get(5));
				calculItineraire.getLabelDateRetour().setText(
						textes.getCalculIt_fr().get(6));
				calculItineraire.getLblAdultes().setText(
						textes.getCalculIt_fr().get(8));
				calculItineraire.getLblEtudiants().setText(
						textes.getCalculIt_fr().get(9));
				calculItineraire.getLblEnfants().setText(
						textes.getCalculIt_fr().get(10));
				calculItineraire.getBtnAnnuler().setText(
						textes.getCalculIt_fr().get(11));
				calculItineraire.getBtnCalculer().setText(
						textes.getCalculIt_fr().get(12));
			}
		});
		calculItineraire.getBtnEN().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				calculItineraire.getLabelLogo().setText(
						textes.getCalculIt_en().get(0));
				calculItineraire.getLabelLieuDepart().setText(
						textes.getCalculIt_en().get(1));
				calculItineraire.getLabelLieuArrive().setText(
						textes.getCalculIt_en().get(2));
				calculItineraire.getBtnAllerRetour().setText(
						textes.getCalculIt_en().get(3));
				calculItineraire.getBtnAllerSimple().setText(
						textes.getCalculIt_en().get(4));
				calculItineraire.getLabelDateDepart().setText(
						textes.getCalculIt_en().get(5));
				calculItineraire.getLabelDateRetour().setText(
						textes.getCalculIt_en().get(6));
				calculItineraire.getLblAdultes().setText(
						textes.getCalculIt_en().get(8));
				calculItineraire.getLblEtudiants().setText(
						textes.getCalculIt_en().get(9));
				calculItineraire.getLblEnfants().setText(
						textes.getCalculIt_en().get(10));
				calculItineraire.getBtnAnnuler().setText(
						textes.getCalculIt_en().get(11));
				calculItineraire.getBtnCalculer().setText(
						textes.getCalculIt_en().get(12));
			}
		});

		calculItineraire.getCbLieuDepart().addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						calculItineraire.getCbLieuArrive().removeAllItems();
						for (String villeDestination : model
								.getVillesDestination(
										calculItineraire.getCbLieuDepart()
												.getSelectedItem().toString())
								.keySet())
							calculItineraire.getCbLieuArrive().addItem(
									villeDestination);
					}
				});

		calculItineraire.getBtnAllerSimple().addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						calculItineraire.HideDepartDatep(true);
					}
				});

		calculItineraire.getBtnAllerRetour().addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						calculItineraire.HideDepartDatep(false);
					}
				});

		calculItineraire.getBtnAnnuler().addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						vue.getMainFrame().showPanel("accueil");
					}
				});

		calculItineraire.getBtnQuit().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vue.getMainFrame().setVisible(false);
			}
		});

		calculItineraire.getBtnCalculer().addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						Date dateDepart = (Date) calculItineraire.getDateDepart()
								.getModel().getValue();
						
						Date dateRetour = (Date) calculItineraire.getDateRetour()
								.getModel().getValue();
						
						if(dateRetour.before(dateDepart))
						{
							calculItineraire.displayError("Date de retour antérieure à la date de départ");
							return;
						}
						Calendar yesterday = Calendar.getInstance();
						yesterday.add(Calendar.DATE, -1);
						
						if(dateDepart.before(yesterday.getTime()))
						{
							calculItineraire.displayError("Date de départ choisie antérieur à la date d'aujourd'hui");
							return;
						}
						
						boolean departIsWeekend = false;

						if ((dateDepart.getDay() == 0) || (dateDepart.getDay() == 6)) {
							departIsWeekend = true;
						}

						for (Trajet trajet : model.getTrajet(
								calculItineraire.getCbLieuDepart()
										.getSelectedItem().toString(),
								calculItineraire.getCbLieuArrive()
										.getSelectedItem().toString(),
								departIsWeekend)) {
							itinerairesProposees.getResultsPanel().add(
									new ResultatItineraire(trajet));
						}
						itinerairesProposees.getLblAller().setVisible(true);
						itinerairesProposees.getLblRetour().setVisible(false);
						vue.getMainFrame().showPanel("itinerairesProposees");
						
						calculItineraire.displayError("");
					}
				});

		// END CALCULITINERAIRE PAGE

		// START itinerairesProposees PAGE

		itinerairesProposees.getBtnQuit().addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						vue.getMainFrame().setVisible(false);
					}
				});

		itinerairesProposees.getBtnFr().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});

		itinerairesProposees.getBtnRetour().addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						vue.getMainFrame().showPanel("calcul");
					}
				});
		// END itinerairesProposees PAGE

		// START CONSULTATIONHORAIRE PAGE
		JButton b = consultationHoraire.getBtnConsulter();
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String depart = consultationHoraire.getDepart();
				String dest = consultationHoraire.getDest();
				consultationHoraire.displayHoraries(model.getTousLesTrajets()
						.get(depart), dest);
			}
		});

		consultationHoraire.getBtnRetour().addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						vue.getMainFrame().showPanel("accueil");
					}
				});

		consultationHoraire.getBtnQuit().addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						vue.getMainFrame().setVisible(false);
					}
				});

		consultationHoraire.getCbDepart().addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						consultationHoraire.getCbDest().removeAllItems();
						for (String villeDestination : model
								.getVillesDestination(
										consultationHoraire.getCbDepart()
												.getSelectedItem().toString())
								.keySet())
							consultationHoraire.getCbDest().addItem(
									villeDestination);
					}
				});

		consultationHoraire.getCbDepart().addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						consultationHoraire.getCbDest().removeAllItems();

						for (String villeDestination : model
								.getVillesDestination(
										consultationHoraire.getCbDepart()
												.getSelectedItem().toString())
								.keySet())
							consultationHoraire.getCbDest().addItem(
									villeDestination);
					}
				});

		// END CONSULTATIONHORAIRE PAGE
	}

}
