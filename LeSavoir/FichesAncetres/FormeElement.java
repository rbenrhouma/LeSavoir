import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;

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
		contentPane.setLayout(null);
		
		JButton btnOk = new JButton("Ok");
		btnOk.setBounds(431, 228, 89, 26);
		contentPane.add(btnOk);
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.setBounds(332, 228, 89, 26);
		contentPane.add(btnAnnuler);
		
		JButton btnSave = new JButton("Enregistrer");
		btnSave.setIcon(new ImageIcon(FormeElement.class.getResource("/javax/swing/plaf/metal/icons/ocean/floppy.gif")));
		btnSave.setBounds(10, 228, 109, 26);
		contentPane.add(btnSave);
		
		JButton btnPrint = new JButton("Imprimer");
		btnPrint.setIcon(new ImageIcon("C:\\Users\\Ridha\\Downloads\\icone_imprimante.png"));
		btnPrint.setBounds(124, 228, 102, 26);
		contentPane.add(btnPrint);
		
		JButton btnUndo = new JButton("Retour");
		btnUndo.setIcon(new ImageIcon(FormeElement.class.getResource("/com/sun/javafx/scene/web/skin/Redo_16x16_JFX.png")));
		btnUndo.setBounds(233, 228, 89, 26);
		contentPane.add(btnUndo);
	}
}
