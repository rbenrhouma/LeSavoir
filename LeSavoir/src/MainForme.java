import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;
import java.awt.Font;
import net.miginfocom.swing.MigLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class MainForme {

	private JFrame frmGestionDeGroupe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainForme f = new MainForme();
					f.frmGestionDeGroupe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainForme() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGestionDeGroupe = new JFrame();
		frmGestionDeGroupe.setTitle("Gestion du groupe scolaire Philippe Grenier");
		frmGestionDeGroupe.setBounds(100, 100, 489, 300);
		frmGestionDeGroupe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGestionDeGroupe.setExtendedState(frmGestionDeGroupe.getExtendedState() | JFrame.MAXIMIZED_BOTH);
		
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
		GroupLayout groupLayout = new GroupLayout(frmGestionDeGroupe.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(7)
					.addComponent(menuBar, GroupLayout.PREFERRED_SIZE, 459, GroupLayout.PREFERRED_SIZE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(48, Short.MAX_VALUE)
					.addComponent(lblGroupeScolairePhilippe, GroupLayout.PREFERRED_SIZE, 592, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(7)
					.addComponent(menuBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 188, Short.MAX_VALUE)
					.addComponent(lblGroupeScolairePhilippe, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
		);
		frmGestionDeGroupe.getContentPane().setLayout(groupLayout);
	}
}
