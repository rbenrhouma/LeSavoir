package visualClasses;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.Border;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.SwingConstants;

public class FrmDBSimple extends JFrame {

	private JPanel contentPane;
	private PanelToolBar panel2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmDBSimple frame = new FrmDBSimple();
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
	
	public FrmDBSimple() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 927, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel2 = new PanelToolBar();
		panel2.getBtnAdd().setText("Ajouter   ");
		panel2.getBtnAnnuler().setText("Annuler     ");
		panel2.getBtnDelete().setText("Supprimer        ");
		panel2.getToolBar().setBounds(10, 5, 788, 43);
		panel2.setBounds(5, 5, 821, 432);
		panel2.getBtnDelete().setLocation(38, 5);
		panel2.getBtnAnnuler().setLocation(12, 1);
		FlowLayout fl_panel2 = (FlowLayout) panel2.getLayout();
		contentPane.add(panel2);
		
		 
	}
	public PanelToolBar getPanel2() {
		return panel2;
	}
}
