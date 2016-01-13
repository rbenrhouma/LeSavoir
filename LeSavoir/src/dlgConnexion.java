import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.Canvas;
import java.awt.Panel;
import java.awt.Scrollbar;
import java.awt.Choice;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import javax.swing.JSeparator;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Window.Type;
import java.awt.Frame;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Rectangle;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class dlgConnexion extends JFrame {

	private JPanel contentPane;
	private JTextField eApplicationUser;
	private JPasswordField eApplicationPassWord;
	private JTextField eSqlServerName;
	private JTextField eSqlPort;
	private JTextField eSqlUer;
	private JTextField eSqlPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
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
		eApplicationUser.setBounds(233, 68, 135, 20);
		eApplicationUser.setColumns(10);
		AppliConnexion.add(eApplicationUser);
		
		eApplicationPassWord = new JPasswordField();
		eApplicationPassWord.setBounds(233, 112, 135, 20);
		AppliConnexion.add(eApplicationPassWord);
		
		JButton button = new JButton("Ok");
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
		lblUtilisateur.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblUtilisateur.setBounds(149, 71, 74, 14);
		AppliConnexion.add(lblUtilisateur);
		
		JLabel lblMotDePasse = new JLabel("Mot de passe");
		lblMotDePasse.setFont(new Font("Tahoma", Font.PLAIN, 11));
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
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "  SQL Serveur   ", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(116, 28, 283, 184);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Nom");
		lblNewLabel_2.setBounds(20, 36, 112, 14);
		panel_1.add(lblNewLabel_2);
		
		eSqlServerName = new JTextField();
		eSqlServerName.setText("(local)\\SQLSERVER2012");
		eSqlServerName.setBounds(118, 33, 145, 20);
		panel_1.add(eSqlServerName);
		eSqlServerName.setColumns(10);
		
		JLabel lblPort = new JLabel("Port");
		lblPort.setBounds(20, 64, 112, 14);
		panel_1.add(lblPort);
		
		eSqlPort = new JTextField();
		eSqlPort.setColumns(10);
		eSqlPort.setBounds(118, 61, 145, 20);
		panel_1.add(eSqlPort);
		
		JLabel lblUser = new JLabel("User");
		lblUser.setBounds(20, 96, 112, 14);
		panel_1.add(lblUser);
		
		eSqlUer = new JTextField();
		eSqlUer.setText("Administratur");
		eSqlUer.setColumns(10);
		eSqlUer.setBounds(118, 93, 145, 20);
		panel_1.add(eSqlUer);
		
		JLabel lblMotDePasse_1 = new JLabel("Mot de passe");
		lblMotDePasse_1.setBounds(20, 126, 98, 14);
		panel_1.add(lblMotDePasse_1);
		
		eSqlPassword = new JTextField();
		eSqlPassword.setText("Admin");
		eSqlPassword.setColumns(10);
		eSqlPassword.setBounds(118, 123, 145, 20);
		panel_1.add(eSqlPassword);
	}
}
