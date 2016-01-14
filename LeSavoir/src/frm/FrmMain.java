package frm;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class FrmMain extends JFrame {

	private JPanel contentPane;
	
	

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmMain frame = new FrmMain();					
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrmMain() {
		setTitle("Gestion scolaire Ecole LE SAVOIR");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu_3 = new JMenu("Connexion");
		menuBar.add(mnNewMenu_3);
		
		JMenuItem mntmNewMenuItem_15 = new JMenuItem("New menu item");
		mnNewMenu_3.add(mntmNewMenuItem_15);
		
		JMenuItem mntmNewMenuItem_16 = new JMenuItem("New menu item");
		mnNewMenu_3.add(mntmNewMenuItem_16);
		
		JMenuItem mntmNewMenuItem_17 = new JMenuItem("Fermer");
		mntmNewMenuItem_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		mnNewMenu_3.add(mntmNewMenuItem_17);
		
		JMenu mnNewMenu_4 = new JMenu("El\u00E8ves");
		menuBar.add(mnNewMenu_4);
		
		JMenuItem mntmNewMenuItem_18 = new JMenuItem("Liste des \u00E9l\u00E8ve");
		mnNewMenu_4.add(mntmNewMenuItem_18);
		
		JMenuItem mntmNewMenuItem_19 = new JMenuItem("Vue hi\u00E9rarchique ");
		mnNewMenu_4.add(mntmNewMenuItem_19);
		
		JMenuItem mntmNewMenuItem_29 = new JMenuItem("-");
		mntmNewMenuItem_29.setSelected(true);
		mnNewMenu_4.add(mntmNewMenuItem_29);
		
		JMenuItem mntmNewMenuItem_30 = new JMenuItem("Edition");
		mnNewMenu_4.add(mntmNewMenuItem_30);
		
		JMenu mnNewMenu_5 = new JMenu("Professeurs");
		menuBar.add(mnNewMenu_5);
		
		JMenuItem mntmNewMenuItem_20 = new JMenuItem("Liste");
		mnNewMenu_5.add(mntmNewMenuItem_20);
		
		JMenuItem mntmNewMenuItem_21 = new JMenuItem("New menu item");
		mnNewMenu_5.add(mntmNewMenuItem_21);
		
		JMenuItem mntmNewMenuItem_22 = new JMenuItem("New menu item");
		mnNewMenu_5.add(mntmNewMenuItem_22);
		
		JMenu mnNewMenu_6 = new JMenu("Groupe");
		menuBar.add(mnNewMenu_6);
		
		JMenuItem mntmNewMenuItem_23 = new JMenuItem("New menu item");
		mnNewMenu_6.add(mntmNewMenuItem_23);
		
		JMenuItem mntmNewMenuItem_24 = new JMenuItem("New menu item");
		mnNewMenu_6.add(mntmNewMenuItem_24);
		
		JMenuItem mntmNewMenuItem_25 = new JMenuItem("New menu item");
		mnNewMenu_6.add(mntmNewMenuItem_25);
		
		JMenu mnAnneScolaire = new JMenu("Ann\u00E9e scolaire");
		menuBar.add(mnAnneScolaire);
		
		JMenuItem mntmNewMenuItem_26 = new JMenuItem("Liste des ann\u00E9es scolaires");
		mnAnneScolaire.add(mntmNewMenuItem_26);
		
		JMenuItem mntmNewMenuItem_28 = new JMenuItem("New menu item");
		mnAnneScolaire.add(mntmNewMenuItem_28);
		
		JMenu mnNewMenu_7 = new JMenu("Administration");
		menuBar.add(mnNewMenu_7);
		
		JMenuItem mntmNewMenuItem_27 = new JMenuItem("Mise \u00E0 jours de la structure");
		mnNewMenu_7.add(mntmNewMenuItem_27);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}


	private void initialize() {

		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("Segoe UI", Font.ITALIC, 12));
		menuBar.setBackground(Color.LIGHT_GRAY);
		
		JMenu mnConnection = new JMenu("Connection");
		menuBar.add(mnConnection);
		
		JMenuItem mntmConnection = new JMenuItem("Connection/d\u00E9connection");
		mnConnection.add(mntmConnection);
		
		JMenuItem mntmInfosUtililisateur = new JMenuItem("Infos Utililisateur");
		mnConnection.add(mntmInfosUtililisateur);
		
		JMenuItem mntmFermer = new JMenuItem("Fermer");
		mnConnection.add(mntmFermer);
		
		JMenuItem mnEleves = new JMenu("El\u00E8ves");
		menuBar.add(mnEleves);
		
		JMenuItem mntmListeDesElves = new JMenuItem("Liste des El\u00E8ves");
		mnEleves.add(mntmListeDesElves);
		
		JMenuItem mntmListeDesElve = new JMenuItem("Liste des El\u00E8ve de l'ann\u00E9e ???");
		mnEleves.add(mntmListeDesElve);
		
		JMenuItem mntmArbreDeslves = new JMenuItem("Arbre des \u00E9l\u00E8ves par tuteur");
		mnEleves.add(mntmArbreDeslves);
		
		JMenuItem mntmAjouterUnlve = new JMenuItem("Ajouter un \u00E9l\u00E8ve");
		mnEleves.add(mntmAjouterUnlve);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("-");
		mnEleves.add(mntmNewMenuItem_8);
		
		JMenuItem mntmEditions = new JMenuItem("Editions");
		mnEleves.add(mntmEditions);
		
		JMenu mnTuteur = new JMenu("Tuteur");
		menuBar.add(mnTuteur);
		
		JMenuItem mntmListeDesTuteurs = new JMenuItem("Liste des tuteurs");
		mnTuteur.add(mntmListeDesTuteurs);
		
		JMenuItem mntmListeDesTuteurs_1 = new JMenuItem("Liste des tuteurs de l'ann\u00E9es ???");
		mnTuteur.add(mntmListeDesTuteurs_1);
		
		JMenuItem mntmAjoutDeTuteur = new JMenuItem("Ajout de tuteur");
		mnTuteur.add(mntmAjoutDeTuteur);
		
		JMenuItem menuItem = new JMenuItem("-");
		mnTuteur.add(menuItem);
		
		JMenuItem mntmEditions_1 = new JMenuItem("Editions");
		mnTuteur.add(mntmEditions_1);
		
		JMenuItem mntmAnimateurs = new JMenu("Animateurs");
		menuBar.add(mntmAnimateurs);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Liste des animateurs");
		mntmAnimateurs.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Liste des Animateur de l'ann\u00E9e ????");
		mntmAnimateurs.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Ajouter un animateur");
		mntmAnimateurs.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_9 = new JMenuItem("-");
		mntmAnimateurs.add(mntmNewMenuItem_9);
		
		JMenuItem mntmNewMenuItem_10 = new JMenuItem("Editions");
		mntmAnimateurs.add(mntmNewMenuItem_10);
		
		JMenu mnNewMenu = new JMenu("Classes");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Liste des Classes");
		mnNewMenu.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Ajouter une Classe");
		mnNewMenu.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_11 = new JMenuItem("-");
		mnNewMenu.add(mntmNewMenuItem_11);
		
		JMenuItem mntmNewMenuItem_12 = new JMenuItem("Editions");
		mnNewMenu.add(mntmNewMenuItem_12);
		
		JMenu mnNewMenu_1 = new JMenu("Ann\u00E9es scolaires");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Liste des An\u00E9es scolaires");
		mnNewMenu_1.add(mntmNewMenuItem_6);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("Ajouter une ann\u00E9e scolaire");
		mnNewMenu_1.add(mntmNewMenuItem_7);
		
		JMenuItem mntmConstructionRentreScolaire = new JMenuItem("Construction rentr\u00E9e scolaire");
		mnNewMenu_1.add(mntmConstructionRentreScolaire);
		
		JMenuItem mntmNewMenuItem_13 = new JMenuItem("-");
		mnNewMenu_1.add(mntmNewMenuItem_13);
		
		JMenuItem mntmNewMenuItem_14 = new JMenuItem("Editions");
		mnNewMenu_1.add(mntmNewMenuItem_14);
		
		JMenu mnNewMenu_2 = new JMenu("Administration de la base");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmMajStructure = new JMenuItem("Maj structure");
		mnNewMenu_2.add(mntmMajStructure);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Verification connection");
		mnNewMenu_2.add(mntmNewMenuItem_5);
		
		JLabel lblGroupeScolairePhilippe = new JLabel("Groupe scolaire Philippe Grenier");
		lblGroupeScolairePhilippe.setForeground(Color.BLUE);
		lblGroupeScolairePhilippe.setFont(new Font("Algerian", Font.PLAIN, 25));
		
	}	
}
