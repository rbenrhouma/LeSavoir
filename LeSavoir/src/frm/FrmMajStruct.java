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
import javax.swing.JScrollPane;

import java.awt.SystemColor;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
import net.proteanit.sql.DbUtils;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.ListSelectionModel;


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
		setBounds(100, 100, 1200, 629);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(1028, 6, 150, 519);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 1, 0, 10));

		JButton btnNewButton = new JButton("Chargement");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				try {
						String query = " SELECT * FROM TABLES ";
						PreparedStatement pst = connection.prepareStatement(query);
						ResultSet rs = pst.executeQuery();
						t_table.setModel(DbUtils.resultSetToTableModel(rs));		
						t_table.getColumnModel().getColumn(0).setPreferredWidth(200);
						t_table.getColumnModel().getColumn(1).setPreferredWidth(200);
						t_table.getColumnModel().getColumn(2).setPreferredWidth(200);
						t_table.getColumnModel().getColumn(3).setPreferredWidth(200);
						
						//TableColumnModel tcm = t_table.getColumnModel();
						//TableColumn tc = tcm.getColumn(1);
						//tc.setHeaderValue( "..." );
						
			            //JScrollPane pane = new JScrollPane(t_table);
			            //add(pane);
						
						
						t_table.setRowSelectionAllowed(true);
						t_table.getTableHeader().setReorderingAllowed(true);
						
				} catch (Exception X) {
					X.printStackTrace();
				}				
				
				

				try {
					String query = " SELECT * FROM FIELDS ";
					PreparedStatement pst2 = connection.prepareStatement(query);
					ResultSet rs2 = pst2.executeQuery();
					t_Fields.setModel(DbUtils.resultSetToTableModel(rs2));					

					
			} catch (Exception X) {
				X.printStackTrace();
			}				
				
				
			}
		});
		btnNewButton.setIcon(new ImageIcon(FrmMajStruct.class.getResource("/Images/load-download-icon.png")));
		panel.add(btnNewButton);

		JPanel panel_8 = new JPanel();
		panel.add(panel_8);
		
				JPanel panel_7 = new JPanel();
				panel_8.add(panel_7);

		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
			
			
			
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
		progressBar.setValue(20);
		panel.add(progressBar);
		
				JPanel panel_1 = new JPanel();
				panel_1.setBounds(6, 6, 1010, 518);
				contentPane.add(panel_1);
				panel_1.setLayout(null);
				
						JPanel panel_5 = new JPanel();
						panel_5.setBounds(0, 0, 1008, 40);
						panel_5.setBackground(SystemColor.textHighlight);
						panel_5.setLayout(new GridLayout(2, 1, 0, 0));
						
								JLabel Tables = new JLabel("Tables");
								Tables.setFont(new Font("Tahoma", Font.BOLD, 16));
								Tables.setHorizontalAlignment(SwingConstants.CENTER);
								panel_5.add(Tables);
								
										JLabel lblNewLabel = new JLabel(" Liste des Tables \u00E0 mettre \u00E0 jour");
										lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
										panel_5.add(lblNewLabel);
										panel_1.add(panel_5);
										
										t_table = new JTable();
										t_table.setShowVerticalLines(true);
										t_table.setShowHorizontalLines(true);
										t_table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
										t_table.setModel(new DefaultTableModel(
											new Object[][] {
											},
											new String[] {
												"vbvcb", "New column", "mmmm", "New column", "New column", "New column", "New column"
											}
										));
										t_table.setBounds(0, 45, 1008, 215);
										panel_1.add(t_table);
										
										t_Fields = new JTable();
										t_Fields.setBounds(0, 323, 1008, 177);
										panel_1.add(t_Fields);
										
										JPanel panel_2 = new JPanel();
										panel_2.setBackground(SystemColor.textHighlight);
										panel_2.setBounds(0, 271, 1008, 40);
										panel_1.add(panel_2);
										panel_2.setLayout(new GridLayout(2, 1, 0, 0));
										
										JLabel lblChamps = new JLabel("Champs");
										lblChamps.setHorizontalAlignment(SwingConstants.CENTER);
										lblChamps.setFont(new Font("Tahoma", Font.BOLD, 16));
										panel_2.add(lblChamps);
										
										JLabel lblListeDesChamps = new JLabel(" Liste des Champs \u00E0 mettre \u00E0 jour");
										lblListeDesChamps.setHorizontalAlignment(SwingConstants.LEFT);
										panel_2.add(lblListeDesChamps);
	}
}
