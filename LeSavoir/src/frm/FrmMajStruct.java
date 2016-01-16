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

public class FrmMajStruct extends JFrame {

	private JPanel contentPane;
	private JTable t_table;
	private JTable t_Fields;

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

	/**
	 * Create the frame.
	 */
	public FrmMajStruct() {
		setTitle("Mise \u00E0 jour de la strucure de la base de donn\u00E9e");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 629, 364);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 3, 1, 1));
		

		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		
		t_table = new JTable();
		t_table.setBackground(SystemColor.activeCaption);
		t_table.setForeground(SystemColor.activeCaption);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(SystemColor.textHighlight);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_5, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
						.addComponent(t_table, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_5, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(t_table, GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
					.addGap(0))
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
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2);
		
		t_Fields = new JTable();
		t_Fields.setBackground(new Color(102, 205, 170));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(SystemColor.activeCaption);
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
						.addComponent(t_Fields, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
						.addComponent(panel_3, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(t_Fields, GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
					.addContainerGap())
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
		btnNewButton.setIcon(new ImageIcon(FrmMajStruct.class.getResource("/Images/load-download-icon.png")));
		panel.add(btnNewButton);
		
		JPanel panel_7 = new JPanel();
		panel.add(panel_7);
		
		JPanel panel_8 = new JPanel();
		panel.add(panel_8);
		
		JButton btnNewButton_2 = new JButton("");
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
		btnNewButton_1.setIcon(new ImageIcon(FrmMajStruct.class.getResource("/Images/verifier-true-icone-8616-96.png")));
		panel.add(btnNewButton_1);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setValue(90);
		panel.add(progressBar);
	}
}
