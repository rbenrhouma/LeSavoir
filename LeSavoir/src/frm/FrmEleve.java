package frm;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.SystemColor;
import javax.swing.JSplitPane;

public class FrmEleve extends JFrame {
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmEleve frame = new FrmEleve();
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
	public FrmEleve() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 644, 455);
		getContentPane().setLayout(new GridLayout(0, 3, 2, 2));

		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaption);
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		getContentPane().add(panel);

		JPanel panel_2 = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) panel_2.getLayout();
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		flowLayout_2.setVgap(10);
		panel_2.setBackground(SystemColor.activeCaption);
		getContentPane().add(panel_2);

		JSplitPane splitPane = new JSplitPane();
		getContentPane().add(splitPane);

		JPanel panel_1 = new JPanel();
		splitPane.setLeftComponent(panel_1);

		JScrollPane scrollPane_1 = new JScrollPane();
		panel_1.add(scrollPane_1);

		table = new JTable();
		splitPane.setRightComponent(table);
	}
}
