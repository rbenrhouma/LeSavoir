import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.ComponentOrientation;
import java.awt.Color;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridLayout;

public class FormeElement extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormeElement frame = new FormeElement();
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
	public FormeElement() {
		setTitle("Ancetre Item");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 546, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnOk = new JButton("Ok");
		btnOk.setBounds(5, 217, 52, 40);
		
		JButton btnSave = new JButton("Enregistrer");
		btnSave.setBounds(109, 222, 52, 35);
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.setBounds(57, 217, 52, 40);
		btnSave.setIcon(new ImageIcon(FormeElement.class.getResource("/javax/swing/plaf/metal/icons/ocean/floppy.gif")));
		
		JButton btnPrint = new JButton("Imprimer");
		btnPrint.setBounds(161, 222, 52, 35);
		btnPrint.setIcon(new ImageIcon("C:\\Users\\Ridha\\Downloads\\icone_imprimante.png"));
		
		JButton btnUndo = new JButton("Retour");
		btnUndo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnUndo.setBounds(273, 222, 177, 35);
		btnUndo.setIcon(new ImageIcon(FormeElement.class.getResource("/com/sun/javafx/scene/web/skin/Redo_16x16_JFX.png")));
		contentPane.setLayout(null);
		contentPane.add(btnOk);
		contentPane.add(btnAnnuler);
		contentPane.add(btnSave);
		contentPane.add(btnPrint);
		contentPane.add(btnUndo);
		
		JPanel pnlBas = new JPanel();
		pnlBas.setSize(100, 50);
		pnlBas.setLocation(154, 81);
		FlowLayout fl_pnlBas = (FlowLayout) pnlBas.getLayout();
		fl_pnlBas.setAlignOnBaseline(true);
		contentPane.add(pnlBas);
		pnlBas.setAlignmentY(Component.BOTTOM_ALIGNMENT);
	}
}
