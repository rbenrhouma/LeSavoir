import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class formeItem extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					formeItem frame = new formeItem();
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
	public formeItem() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.setBounds(311, 222, 113, 29);
		getContentPane().add(btnAnnuler);
		
		JButton btnOk = new JButton("Ok");
		btnOk.setBounds(212, 222, 89, 29);
		getContentPane().add(btnOk);
		
		JButton btnImprimer = new JButton("Imprimer");
		btnImprimer.setIcon(new ImageIcon("C:\\Users\\Ridha\\Downloads\\icone_imprimante.png"));
		btnImprimer.setBounds(10, 222, 113, 29);
		getContentPane().add(btnImprimer);
	}

}
