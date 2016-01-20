package frm;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import java.awt.MultipleGradientPaint.ColorSpaceType;

public class FrmTuteur extends JDialog {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			FrmTuteur dialog = new FrmTuteur();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public FrmTuteur() {
		setTitle("Tuteur");
		setBounds(100, 100, 512, 332);
		getContentPane().setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("434px:grow"),},
			new RowSpec[] {
				RowSpec.decode("229px:grow"),
				RowSpec.decode("33px"),}));
		{
			JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			getContentPane().add(tabbedPane, "1, 1, fill, top");
			{
				JPanel Francais = new JPanel();
				tabbedPane.addTab("Francais", null, Francais, null);
				Francais.setLayout(new FormLayout(new ColumnSpec[] {
						FormSpecs.RELATED_GAP_COLSPEC,
						FormSpecs.DEFAULT_COLSPEC,
						FormSpecs.RELATED_GAP_COLSPEC,
						FormSpecs.DEFAULT_COLSPEC,
						FormSpecs.RELATED_GAP_COLSPEC,
						FormSpecs.DEFAULT_COLSPEC,
						FormSpecs.RELATED_GAP_COLSPEC,
						ColumnSpec.decode("default:grow"),},
					new RowSpec[] {
						FormSpecs.RELATED_GAP_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.RELATED_GAP_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.RELATED_GAP_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.RELATED_GAP_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.RELATED_GAP_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.RELATED_GAP_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.RELATED_GAP_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC,}));
				{
					JLabel lblNewLabel = new JLabel("Nom");
					Francais.add(lblNewLabel, "2, 2");
				}
				{
					textField = new JTextField();
					Francais.add(textField, "8, 2, fill, default");
					textField.setColumns(10);
				}
				{
					JLabel lblNewLabel_1 = new JLabel("Pr\u00E9nom");
					Francais.add(lblNewLabel_1, "2, 4");
				}
				{
					textField_1 = new JTextField();
					Francais.add(textField_1, "8, 4, fill, default");
					textField_1.setColumns(10);
				}
				{
					JLabel lblNewLabel_2 = new JLabel("e-mail");
					Francais.add(lblNewLabel_2, "2, 6");
				}
				{
					textField_2 = new JTextField();
					Francais.add(textField_2, "8, 6, fill, default");
					textField_2.setColumns(10);
				}
				{
					JLabel lblNewLabel_3 = new JLabel("New label");
					Francais.add(lblNewLabel_3, "2, 8");
				}
				{
					textField_3 = new JTextField();
					Francais.add(textField_3, "8, 8, fill, default");
					textField_3.setColumns(10);
				}
				{
					JLabel lblNewLabel_4 = new JLabel("New label");
					Francais.add(lblNewLabel_4, "2, 10");
				}
				{
					textField_4 = new JTextField();
					Francais.add(textField_4, "8, 10, fill, default");
					textField_4.setColumns(10);
				}
				{
					JLabel lblNewLabel_5 = new JLabel("New label");
					Francais.add(lblNewLabel_5, "2, 12");
				}
				{
					textField_5 = new JTextField();
					Francais.add(textField_5, "8, 12, fill, default");
					textField_5.setColumns(10);
				}
				{
					JLabel lblNewLabel_6 = new JLabel("Lien");
					Francais.add(lblNewLabel_6, "2, 14");
				}
				{
					JComboBox comboBox = new JComboBox();
					comboBox.setModel(new DefaultComboBoxModel(new String[] {"P\u00E8re", "M\u00E8re", "Grand p\u00E8re", "Grande m\u00E8re", "Autre"}));
					Francais.add(comboBox, "8, 14, fill, default");
				}
			}
			{
				JPanel panel = new JPanel();
				tabbedPane.addTab("\u0639\u0631\u0628\u064A\u0629", null, panel, null);
				panel.setLayout(new FormLayout(new ColumnSpec[] {
						FormSpecs.RELATED_GAP_COLSPEC,
						FormSpecs.DEFAULT_COLSPEC,
						FormSpecs.RELATED_GAP_COLSPEC,
						FormSpecs.DEFAULT_COLSPEC,
						FormSpecs.RELATED_GAP_COLSPEC,
						ColumnSpec.decode("default:grow"),},
					new RowSpec[] {
						FormSpecs.RELATED_GAP_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.RELATED_GAP_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.RELATED_GAP_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.RELATED_GAP_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC,
						FormSpecs.RELATED_GAP_ROWSPEC,
						FormSpecs.DEFAULT_ROWSPEC,}));
				{
					textField_6 = new JTextField();
					panel.add(textField_6, "2, 4, 4, 1, left, default");
					textField_6.setColumns(10);
				}
				{
					JLabel lblNewLabel_7 = new JLabel("New label");
					panel.add(lblNewLabel_7, "6, 4, right, default");
				}
				{
					textField_7 = new JTextField();
					panel.add(textField_7, "2, 6, 4, 1, fill, default");
					textField_7.setColumns(10);
				}
				{
					JLabel lblNewLabel_8 = new JLabel("New label");
					panel.add(lblNewLabel_8, "6, 6, right, default");
				}
				{
					textField_8 = new JTextField();
					panel.add(textField_8, "2, 8, 4, 1, fill, default");
					textField_8.setColumns(10);
				}
				{
					JLabel lblNewLabel_9 = new JLabel("New label");
					panel.add(lblNewLabel_9, "6, 8, right, default");
				}
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, "1, 2, fill, top");
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

}
