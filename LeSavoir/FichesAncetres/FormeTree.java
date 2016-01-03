import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTree;
import java.awt.TextField;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;
import javax.swing.Box;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;

public class FormeTree extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormeTree frame = new FormeTree();
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
	public FormeTree() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 657, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTree tree = new JTree();
		tree.setBounds(10, 11, 179, 311);
		contentPane.add(tree);
	}
}
