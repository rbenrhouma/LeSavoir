package frm;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import java.awt.SystemColor;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
import net.proteanit.sql.DbUtils;


public class FrmMajStruct extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmMajStruct frame = new FrmMajStruct();
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	Connection connection=null;
	private JTable t_table;
	private JTable t_Fields;
	/**
	 * Create the frame.
	 */
	public FrmMajStruct() {
		//connection=SQLIntegrityConstraintViolationException
		setTitle("Mise \u00E0 jour de la strucure de la base de donn\u00E9e");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1001, 567);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 3, 1, 1));
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane);

		JPanel panel_1 = new JPanel();
		scrollPane.setViewportView(panel_1);

		JPanel panel_5 = new JPanel();
		panel_5.setBackground(SystemColor.textHighlight);
		
		t_table = new JTable();
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(13)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(t_table, GroupLayout.PREFERRED_SIZE, 288, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_5, GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(t_table, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(233, Short.MAX_VALUE))
		);
		panel_5.setLayout(new GridLayout(2, 1, 0, 0));

		JLabel Tables = new JLabel("Tables");
		Tables.setFont(new Font("Tahoma", Font.BOLD, 16));
		Tables.setHorizontalAlignment(SwingConstants.CENTER);
		panel_5.add(Tables);

		JLabel lblNewLabel = new JLabel(" Liste des Tables \u00E0 mettre \u00E0 jour");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		panel_5.add(lblNewLabel);
		panel_1.setLayout(gl_panel_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		contentPane.add(scrollPane_1);

		JPanel panel_2 = new JPanel();
		scrollPane_1.setViewportView(panel_2);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.activeCaption);
		
		t_Fields = new JTable();
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(6)
							.addComponent(t_Fields, GroupLayout.PREFERRED_SIZE, 290, GroupLayout.PREFERRED_SIZE))
						.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(t_Fields, GroupLayout.PREFERRED_SIZE, 322, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(128, Short.MAX_VALUE))
		);
		panel_3.setLayout(new GridLayout(2, 1, 0, 0));

		JLabel lblFields = new JLabel("Champs");
		lblFields.setHorizontalAlignment(SwingConstants.CENTER);
		lblFields.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_3.add(lblFields);

		JLabel lblNewLabel_1 = new JLabel(" Liste des champs \u00E0 mettre \u00E0 jour");
		panel_3.add(lblNewLabel_1);
		panel_2.setLayout(gl_panel_2);

		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new GridLayout(10, 1, 0, 0));

		JButton btnNewButton = new JButton("Chargement");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				try {
						String query = " SELECT * FROM TABLES ";
						PreparedStatement pst = connection.prepareStatement(query);
						ResultSet rs = pst.executeQuery();
						t_table.setModel(DbUtils.resultSetToTableModel(rs));					

						
				} catch (Exception X) {
					X.printStackTrace();
				}				
				
				
				
			}
		});
		btnNewButton.setIcon(new ImageIcon(FrmMajStruct.class.getResource("/Images/load-download-icon.png")));
		panel.add(btnNewButton);

		JPanel panel_7 = new JPanel();
		panel.add(panel_7);

		JPanel panel_8 = new JPanel();
		panel.add(panel_8);

		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				

				try {
					String query = " SELECT * FROM FIELDS ";
					PreparedStatement pst = connection.prepareStatement(query);
					ResultSet rs = pst.executeQuery();
					t_Fields.setModel(DbUtils.resultSetToTableModel(rs));					

					
			} catch (Exception X) {
				X.printStackTrace();
			}				
			
			
			
			}
		});
		panel.add(btnNewButton_2);

		JPanel panel_9 = new JPanel();
		panel.add(panel_9);

		JPanel panel_6 = new JPanel();
		panel.add(panel_6);

		JButton btnNewButton_3 = new JButton("");
		panel.add(btnNewButton_3);

		JPanel panel_4 = new JPanel();
		panel.add(panel_4);

		JButton btnNewButton_1 = new JButton("Appliquer");
		btnNewButton_1
				.setIcon(new ImageIcon(FrmMajStruct.class.getResource("/Images/verifier-true-icone-8616-96.png")));
		panel.add(btnNewButton_1);

		JProgressBar progressBar = new JProgressBar();
		progressBar.setValue(90);
		panel.add(progressBar);
	}
}
