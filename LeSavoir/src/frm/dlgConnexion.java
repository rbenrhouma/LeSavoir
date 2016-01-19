package frm;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import connexions.ApplicationConnexion;
import etablissement.Etablissements;

import java.awt.*;
import java.awt.Dialog.ModalExclusionType;
import java.awt.event.*;


import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

public class dlgConnexion extends JFrame {

	private JPanel contentPane;
	static private JTextField eApplicationUser;
	private JPasswordField eApplicationPassWord;
	private JTextField eSqlServerName;
	private JTextField eSqlPort;
	private JTextField eSqlUer;
	private JTextField eSqlServerNameSys;
	private JTextField eSqlPortSys;
	private JTextField eSqlUerSys;
	private JTextField eDataBaseNameSys;
	private JPasswordField eSqlPasswordSys;
	private JPasswordField eSqlPassword;

	//private JComboBox cbDataBaseName;

	public static ApplicationConnexion ApplicationSession ;         // Connexion à la base de travail 
	private JTextField eDataBaseName;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@SuppressWarnings("deprecation")
			public void run() {
				try {
					dlgConnexion frame = new dlgConnexion();					
					frame.setLocationRelativeTo(null);  
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
	
	@SuppressWarnings("deprecation")
	private void FillEditsSystemDB(){
		eSqlServerNameSys.setText(eSqlServerName.getText()); 
		eSqlPortSys.setText(eSqlPortSys.getText());
		eSqlUerSys.setText(eSqlUerSys.getText());
		eSqlPasswordSys.setText(eSqlPasswordSys.getText());
	}
	
	public dlgConnexion() {
		setMaximumSize(new Dimension(100, 100));
		setBounds(new Rectangle(100, 100, 100, 100));
		setState(Frame.ICONIFIED);
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setExtendedState(Frame.ICONIFIED);
		setType(Type.UTILITY);
		setTitle("Connexion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("Tahoma", Font.PLAIN, 11));
		tabbedPane.setBounds(10, 0, 414, 251);
		contentPane.add(tabbedPane);
		
		JPanel AppliConnexion = new JPanel();
		AppliConnexion.setFont(new Font("Tahoma", Font.PLAIN, 11));
		tabbedPane.addTab("Application conexion", null, AppliConnexion, null);
		AppliConnexion.setLayout(null);
		
		eApplicationUser = new JTextField();
		eApplicationUser.setText("Ridha");
		eApplicationUser.setBounds(233, 68, 135, 20);
		eApplicationUser.setColumns(10);
		AppliConnexion.add(eApplicationUser);
		
		eApplicationPassWord = new JPasswordField();
		eApplicationPassWord.setText("Admin");
		eApplicationPassWord.setBounds(233, 112, 135, 20);
		AppliConnexion.add(eApplicationPassWord);
		
		JButton button = new JButton("Ok");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ApplicationSession = new ApplicationConnexion();         
				// paraètres de la connexion de la base Système
				ApplicationSession.SystemeSession.SqlUser.UserName 		= eSqlUerSys.getText();
				ApplicationSession.SystemeSession.SqlUser.userPassword 	= eSqlPasswordSys.getText();					
				ApplicationSession.SystemeSession.ServeurName 			= eSqlServerNameSys.getText();
				ApplicationSession.SystemeSession.DataBase 			= eDataBaseNameSys.getText();
				ApplicationSession.SystemeSession.localhost 			= eSqlPortSys.getText();
				ApplicationSession.SystemeSession.ExecuteConnexion();
				if (! ApplicationSession.SystemeSession.ConnexionIsOK){
					System.out.print("Connexion à la base système impossible");
				}
				else
				{
					// récuperer la version de la base.
					
					
				}
				
				// paraètres de la connexion de la base principale
				ApplicationSession.Session.SqlUser.UserName 		= eSqlUer.getText();
				ApplicationSession.Session.SqlUser.userPassword 	= eSqlPassword.getText();					
				ApplicationSession.Session.ServeurName 			= eSqlServerName.getText();
				//System.out.print(cbDataBaseName.getSelectedItem().toString());
				                           
				
				ApplicationSession.Session.DataBase 			= eDataBaseName.getText();
				ApplicationSession.Session.ExecuteConnexion();
				if (!ApplicationSession.Session.ConnexionIsOK) {
					System.out.print("Connexion à la base de trvail [" + ApplicationSession.Session.DataBase + "] impossible");
				};
				
				
				ApplicationSession.ApplicationUser = eApplicationUser.getText();
				ApplicationSession.ApplicationPassWord = eApplicationPassWord.getText();	
				if (ApplicationSession.ApplicationUserExist()){
					
					Etablissements aEtab = new Etablissements(ApplicationSession.Session.DataBase, ApplicationSession.Session);
					dispose();
					FrmMain frame = new FrmMain();					
					frame.etab = aEtab; 
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
					frame.setVisible(true);					
				}
			}
		});
		button.setBounds(197, 178, 79, 23);
		AppliConnexion.add(button);
		
		JButton button_1 = new JButton("Annuler");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				}
		});
		button_1.setBounds(286, 178, 100, 23);
		AppliConnexion.add(button_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(dlgConnexion.class.getResource("/Images/keys.png")));
		lblNewLabel.setBounds(0, 43, 141, 133);
		AppliConnexion.add(lblNewLabel);
		
		JLabel lblUtilisateur = new JLabel("Utilisateur");
		lblUtilisateur.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblUtilisateur.setBounds(149, 71, 74, 14);
		AppliConnexion.add(lblUtilisateur);
		
		JLabel lblMotDePasse = new JLabel("Mot de passe");
		lblMotDePasse.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMotDePasse.setBounds(149, 115, 85, 14);
		AppliConnexion.add(lblMotDePasse);
		
		JPanel panel = new JPanel();
		panel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		panel.setBackground(Color.WHITE);
		tabbedPane.addTab("SQL Connexion", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(dlgConnexion.class.getResource("/Images/photodune-6908996-databasejpg-xs2.jpg")));
		lblNewLabel_1.setBounds(10, 32, 111, 169);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "  SQL Serveur   [ Base Syst\u00E8me ]  ", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(110, 10, 280, 205);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Nom");
		lblNewLabel_2.setBounds(20, 36, 112, 14);
		panel_1.add(lblNewLabel_2);
		
		eSqlServerName = new JTextField();
		eSqlServerName.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {
			}
		});
		eSqlServerName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FillEditsSystemDB();
			}
		});
		eSqlServerName.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
			}
		});
		eSqlServerName.setText("(local)\\SQLSERVER2012");
		eSqlServerName.setBounds(118, 33, 145, 20);
		panel_1.add(eSqlServerName);
		eSqlServerName.setColumns(10);
		
		JLabel lblPort = new JLabel("Port");
		lblPort.setBounds(20, 64, 112, 14);
		panel_1.add(lblPort);
		
		eSqlPort = new JTextField();
		eSqlPort.setText("49159");
		eSqlPort.setColumns(10);
		eSqlPort.setBounds(118, 61, 145, 20);
		
		panel_1.add(eSqlPort);
		
		JLabel lblUser = new JLabel("User");
		lblUser.setBounds(20, 119, 112, 14);
		panel_1.add(lblUser);
		
		eSqlUer = new JTextField();
		eSqlUer.setText("Administrateur");
		eSqlUer.setColumns(10);
		eSqlUer.setBounds(118, 116, 145, 20);
		panel_1.add(eSqlUer);
		
		JLabel lblMotDePasse_1 = new JLabel("Mot de passe");
		lblMotDePasse_1.setBounds(20, 146, 98, 14);
		panel_1.add(lblMotDePasse_1);
		
		JCheckBox chckbxSameServer = new JCheckBox("Base Systeme sur un autre serveur");
		chckbxSameServer.setSelected(true);
		chckbxSameServer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				eSqlServerNameSys.setEditable(!chckbxSameServer.isSelected());
				eSqlPortSys.setEditable(!chckbxSameServer.isSelected());
				eSqlUerSys.setEditable(!chckbxSameServer.isSelected());
				eSqlPasswordSys.setEditable(!chckbxSameServer.isSelected());

				eSqlServerNameSys.setEnabled(!chckbxSameServer.isSelected());
				eSqlPortSys.setEnabled(!chckbxSameServer.isSelected());
				eSqlUerSys.setEnabled(!chckbxSameServer.isSelected());
				eSqlPasswordSys.setEnabled(!chckbxSameServer.isSelected());
					if (chckbxSameServer.isSelected()){
					FillEditsSystemDB();
					}
				}
			

		});
		chckbxSameServer.setBackground(Color.WHITE);
		chckbxSameServer.setBounds(6, 173, 195, 20);
		panel_1.add(chckbxSameServer);
		
		JLabel lblBaseName = new JLabel("Base Name");
		lblBaseName.setBounds(20, 91, 98, 14);
		panel_1.add(lblBaseName);
		
		JComboBox cbDataBaseName = new JComboBox();
		cbDataBaseName.setModel(new DefaultComboBoxModel(new String[] {"Base1", "LE_SAVOIR", "Base3"}));
		cbDataBaseName.setSelectedIndex(1);
		cbDataBaseName.setToolTipText("");
		cbDataBaseName.setBounds(118, 89, 145, 20);
		panel_1.add(cbDataBaseName);
		
		eSqlPassword = new JPasswordField();
		eSqlPassword.setText("Admin");
		eSqlPassword.setBounds(118, 143, 145, 20);
		panel_1.add(eSqlPassword);
		
		eDataBaseName = new JTextField();
		eDataBaseName.setText("LE_SAVOIR");
		eDataBaseName.setColumns(10);
		eDataBaseName.setBounds(207, 173, 107, 20);
		panel_1.add(eDataBaseName);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		tabbedPane.addTab("SQL Connexion \u00E8meBase Syst\u00E8me", null, panel_2, null);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "  SQL Serveur   ", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_3.setBackground(Color.WHITE);
		panel_3.setBounds(110, 10, 280, 205);
		panel_2.add(panel_3);
		
		JLabel label = new JLabel("Nom");
		label.setBounds(20, 36, 112, 14);
		panel_3.add(label);
		
		eSqlServerNameSys = new JTextField();
		eSqlServerNameSys.setEditable(false);
		eSqlServerNameSys.setEnabled(false);
		eSqlServerNameSys.setBackground(Color.WHITE);
		eSqlServerNameSys.setText("(local)\\SQLSERVER2012");
		eSqlServerNameSys.setColumns(10);
		eSqlServerNameSys.setBounds(118, 33, 145, 20);
		panel_3.add(eSqlServerNameSys);
		
		JLabel label_1 = new JLabel("Port");
		label_1.setBounds(20, 64, 112, 14);
		panel_3.add(label_1);
		
		eSqlPortSys = new JTextField();
		eSqlPortSys.setEditable(false);
		eSqlPortSys.setEnabled(false);
		eSqlPortSys.setText("49159");
		eSqlPortSys.setBackground(Color.WHITE);
		eSqlPortSys.setColumns(10);
		eSqlPortSys.setBounds(118, 61, 145, 20);
		panel_3.add(eSqlPortSys);
		
		JLabel label_2 = new JLabel("User");
		label_2.setBounds(20, 119, 112, 14);
		panel_3.add(label_2);
		
		eSqlUerSys = new JTextField();
		eSqlUerSys.setEditable(false);
		eSqlUerSys.setEnabled(false);
		eSqlUerSys.setBackground(Color.WHITE);
		eSqlUerSys.setText("Administrateur");
		eSqlUerSys.setColumns(10);
		eSqlUerSys.setBounds(118, 119, 145, 20);
		panel_3.add(eSqlUerSys);
		
		JLabel label_3 = new JLabel("Mot de passe");
		label_3.setBounds(20, 149, 98, 14);
		panel_3.add(label_3);
		
		JLabel label_4 = new JLabel("Base Name");
		label_4.setBounds(20, 91, 98, 14);
		panel_3.add(label_4);
		
		eDataBaseNameSys = new JTextField();
		eDataBaseNameSys.setEditable(false);
		eDataBaseNameSys.setEnabled(false);
		eDataBaseNameSys.setText("DB_SYSTEME");
		eDataBaseNameSys.setColumns(10);
		eDataBaseNameSys.setBounds(118, 89, 145, 20);
		panel_3.add(eDataBaseNameSys);
		
		eSqlPasswordSys = new JPasswordField();
		eSqlPasswordSys.setEditable(false);
		eSqlPasswordSys.setEnabled(false);
		eSqlPasswordSys.setBackground(Color.WHITE);
		eSqlPasswordSys.setText("Admin");
		eSqlPasswordSys.setBounds(118, 149, 145, 20);
		panel_3.add(eSqlPasswordSys);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_3.setIcon(new ImageIcon(dlgConnexion.class.getResource("/Images/syst\u00E8me-de-gestion-de-base-de-donn\u00E9es-2.jpg")));
		lblNewLabel_3.setBounds(10, 28, 106, 184);
		panel_2.add(lblNewLabel_3);
		
	}
}
