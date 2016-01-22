package frm;

import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;

import connexions.DBConnexion;
import etablissement.Etablissements;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.sql.*;
import java.util.*;

@SuppressWarnings("serial")
public class FrmMain extends JFrame {

	private JPanel contentPane;
	public Etablissements MyEtab;

	DBConnexion MainConnexion;

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
		setBounds(100, 100, 682, 381);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("Segoe UI", Font.PLAIN, 10));
		setJMenuBar(menuBar);

		JMenu mnNewMenu_3 = new JMenu("Connexion");
		menuBar.add(mnNewMenu_3);

		JMenuItem mntmNewMenuItem_15 = new JMenuItem("Connexion/D\u00E9connexion");
		mnNewMenu_3.add(mntmNewMenuItem_15);

		JMenuItem mntmNewMenuItem_16 = new JMenuItem("Info Etablissement");
		mnNewMenu_3.add(mntmNewMenuItem_16);

		mnNewMenu_3.add(new JSeparator()); // SEPARATOR

		JMenuItem mntmNewMenuItem_17 = new JMenuItem("Fermer");
		mntmNewMenuItem_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		mnNewMenu_3.add(mntmNewMenuItem_17);
		
		JMenu mnTuteur = new JMenu("Tuteur");
		menuBar.add(mnTuteur);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Liste des tuteurs");
		mnTuteur.add(mntmNewMenuItem);
		
		JMenuItem mntmTuteursAnne = new JMenuItem("Tuteurs Ann\u00E9e");
		mnTuteur.add(mntmTuteursAnne);
		
		JMenuItem mntmRglementDeLanne = new JMenuItem("R\u00E9glement de l'ann\u00E9e");
		mnTuteur.add(mntmRglementDeLanne);
		
		JMenuItem menuItem = new JMenuItem("-");
		mnTuteur.add(menuItem);
		
		JMenuItem mntmTiers = new JMenuItem("Tiers");
		mnTuteur.add(mntmTiers);
		
		JMenuItem menuItem_1 = new JMenuItem("-");
		mnTuteur.add(menuItem_1);
		
		JMenuItem mntmEditions_1 = new JMenuItem("Editions");
		mnTuteur.add(mntmEditions_1);

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

		JMenuItem mntmNewMenuItem_21 = new JMenuItem("Professeur Ann\u00E9e");
		mnNewMenu_5.add(mntmNewMenuItem_21);

		JMenuItem mntmNewMenuItem_22 = new JMenuItem("-");
		mnNewMenu_5.add(mntmNewMenuItem_22);
		
		JMenuItem mntmEditions = new JMenuItem("Editions");
		mnNewMenu_5.add(mntmEditions);
		
		JMenu mnNewMenu = new JMenu("Salles");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Salle");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem menuItem_2 = new JMenuItem("-");
		mnNewMenu.add(menuItem_2);
		
		JMenuItem mntmEditions_3 = new JMenuItem("Editions");
		mnNewMenu.add(mntmEditions_3);

		JMenu mnNewMenu_6 = new JMenu("Groupe");
		menuBar.add(mnNewMenu_6);

		JMenuItem mntmNewMenuItem_23 = new JMenuItem("liste des groupes");
		mnNewMenu_6.add(mntmNewMenuItem_23);

		JMenuItem mntmNewMenuItem_25 = new JMenuItem("-");
		mnNewMenu_6.add(mntmNewMenuItem_25);
		
				JMenuItem mntmNewMenuItem_24 = new JMenuItem("Editions");
				mnNewMenu_6.add(mntmNewMenuItem_24);

		JMenu mnAnneScolaire = new JMenu("Ann\u00E9e scolaire");
		menuBar.add(mnAnneScolaire);

		JMenuItem mntmNewMenuItem_26 = new JMenuItem("Liste des ann\u00E9es scolaires");
		mnAnneScolaire.add(mntmNewMenuItem_26);

		JMenuItem mntmNewMenuItem_28 = new JMenuItem("-");
		mnAnneScolaire.add(mntmNewMenuItem_28);
		
		JMenuItem mntmEditions_2 = new JMenuItem("Editions");
		mnAnneScolaire.add(mntmEditions_2);

		JMenu mnNewMenu_7 = new JMenu("Administration");
		menuBar.add(mnNewMenu_7);

		JMenuItem mntmNewMenuItem_27 = new JMenuItem("Mise \u00E0 jours de la structure");
		mntmNewMenuItem_27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FrmMajStruct frm = new FrmMajStruct();
				frm.setVisible(true);
			}
		});
		mnNewMenu_7.add(mntmNewMenuItem_27);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGap(0, 656, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGap(0, 312, Short.MAX_VALUE)
		);
		contentPane.setLayout(gl_contentPane);
	}
}
