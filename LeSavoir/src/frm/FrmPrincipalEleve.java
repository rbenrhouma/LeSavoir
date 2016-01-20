package frm;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.SystemColor;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmPrincipalEleve extends JFrame {
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmPrincipalEleve frame = new FrmPrincipalEleve();
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
	public FrmPrincipalEleve() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 460);

		JPanel pnlRecherche = new JPanel();
		pnlRecherche.setBackground(SystemColor.inactiveCaption);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.scrollbar);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.activeCaptionBorder);
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout
				.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup().addContainerGap()
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
										.addComponent(pnlRecherche, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 664,
												GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
										.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 173,
												GroupLayout.PREFERRED_SIZE)
										.addGap(18).addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 223,
												GroupLayout.PREFERRED_SIZE)))
								.addContainerGap()));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addContainerGap()
						.addComponent(pnlRecherche, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
								.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
						.addGap(6)));
		GridBagLayout gbl_pnlRecherche = new GridBagLayout();
		gbl_pnlRecherche.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_pnlRecherche.rowHeights = new int[] { 0, 0, 0, 0, 0 };
		gbl_pnlRecherche.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE };
		gbl_pnlRecherche.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		pnlRecherche.setLayout(gbl_pnlRecherche);

		JButton btnNewButton = new JButton("+");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				pnlRecherche.setBounds(0, 0, 0, 100);
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 0;
		pnlRecherche.add(btnNewButton, gbc_btnNewButton);

		JLabel lblNewLabel = new JLabel("Recherche");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 0;
		pnlRecherche.add(lblNewLabel, gbc_lblNewLabel);

		JLabel lblIdentifiant = new JLabel("Identifiant");
		GridBagConstraints gbc_lblIdentifiant = new GridBagConstraints();
		gbc_lblIdentifiant.insets = new Insets(0, 0, 5, 5);
		gbc_lblIdentifiant.gridx = 4;
		gbc_lblIdentifiant.gridy = 0;
		pnlRecherche.add(lblIdentifiant, gbc_lblIdentifiant);

		JLabel lblNewLabel_1 = new JLabel("Nom de famille (FR)");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 6;
		gbc_lblNewLabel_1.gridy = 0;
		pnlRecherche.add(lblNewLabel_1, gbc_lblNewLabel_1);

		JLabel lblNomDeFamille = new JLabel("Nom de famille (AR)");
		GridBagConstraints gbc_lblNomDeFamille = new GridBagConstraints();
		gbc_lblNomDeFamille.insets = new Insets(0, 0, 5, 0);
		gbc_lblNomDeFamille.gridx = 7;
		gbc_lblNomDeFamille.gridy = 0;
		pnlRecherche.add(lblNomDeFamille, gbc_lblNomDeFamille);

		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 4;
		gbc_textField.gridy = 1;
		pnlRecherche.add(textField, gbc_textField);
		textField.setColumns(10);

		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.anchor = GridBagConstraints.WEST;
		gbc_textField_2.gridx = 6;
		gbc_textField_2.gridy = 1;
		pnlRecherche.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);

		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.gridx = 7;
		gbc_textField_1.gridy = 1;
		pnlRecherche.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Sexe");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 4;
		gbc_lblNewLabel_2.gridy = 2;
		pnlRecherche.add(lblNewLabel_2, gbc_lblNewLabel_2);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Fille ", "Gar\u00E7on", "Inconu" }));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 0, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 4;
		gbc_comboBox.gridy = 3;
		pnlRecherche.add(comboBox, gbc_comboBox);
		getContentPane().setLayout(groupLayout);

	}
}
