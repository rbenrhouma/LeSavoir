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
		setTitle("New item");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 649, 364);
		getContentPane().setLayout(null);
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.setIcon(null);
		btnAnnuler.setBounds(490, 285, 113, 30);
		getContentPane().add(btnAnnuler);
		
		JButton btnOk = new JButton("Ok");
		btnOk.setIcon(new ImageIcon("C:\\Users\\Ridha\\Downloads\\Barre de navigation\\Valider.png"));
		btnOk.setBounds(391, 285, 89, 30);
		getContentPane().add(btnOk);
		
		JButton btnImprimer = new JButton("Imprimer");
		btnImprimer.setIcon(new ImageIcon("C:\\Users\\Ridha\\Downloads\\icone_imprimante.png"));
		btnImprimer.setBounds(10, 285, 103, 30);
		getContentPane().add(btnImprimer);
		
		JButton btnNewButton = new JButton("Supprimer");
		btnNewButton.setIcon(null);
		btnNewButton.setBounds(133, 285, 121, 30);
		getContentPane().add(btnNewButton);
		
		JButton btnEditer = new JButton("Editer");
		btnEditer.setBounds(264, 285, 121, 30);
		getContentPane().add(btnEditer);
	}

}
