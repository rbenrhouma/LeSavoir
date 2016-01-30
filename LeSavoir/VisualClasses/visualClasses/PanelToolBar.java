package visualClasses;

import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.UIManager;


public class PanelToolBar extends JPanel {
	private JButton btnDelete;
	private JButton btnEdit;
	private JButton btnAdd;
	private JButton btnAnnuler;
	private JButton btnPrint;
	private JButton btnNewButton;
	private JButton btnCopy;
	private JButton btnCut;
	private JToolBar toolBar;

	/**
	 * Create the panel.
	 */
	public PanelToolBar() {
		setLayout(null);
		
		toolBar = new JToolBar();
		toolBar.setBounds(10, 5, 629, 43);
		toolBar.setBackground(new Color(176, 196, 222));
		add(toolBar);
		
		btnDelete = new JButton("Supprimer");
		btnDelete.setBackground(Color.WHITE);
		btnDelete.setIcon(new ImageIcon(PanelToolBar.class.getResource("/Images/ToolBarBtn24/document - Copie (8).jpg")));
		toolBar.add(btnDelete);
		
		btnAnnuler = new JButton("Annuler");
		btnAnnuler.setBackground(Color.WHITE);
		btnAnnuler.setIcon(new ImageIcon(PanelToolBar.class.getResource("/Images/ToolBarBtn24/document - Copie (9).jpg")));
		toolBar.add(btnAnnuler);
		
		btnAdd = new JButton("Ajouter");
		btnAdd.setBackground(Color.WHITE);
		btnAdd.setIcon(new ImageIcon(PanelToolBar.class.getResource("/Images/ToolBarBtn24/document - Copie (4).jpg")));
		toolBar.add(btnAdd);
		
		btnEdit = new JButton("Modifier");
		btnEdit.setBackground(Color.WHITE);
		btnEdit.setIcon(new ImageIcon(PanelToolBar.class.getResource("/Images/ToolBarBtn24/document - Copie (3).jpg")));
		toolBar.add(btnEdit);
		
		btnPrint = new JButton("Imprimer");
		btnPrint.setBackground(Color.WHITE);
		btnPrint.setIcon(new ImageIcon(PanelToolBar.class.getResource("/Images/ToolBarBtn24/document - Copie (2).jpg")));
		toolBar.add(btnPrint);
		
		btnNewButton = new JButton("New button");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setIcon(new ImageIcon(PanelToolBar.class.getResource("/Images/ToolBarBtn24/document - Copie (10).jpg")));
		toolBar.add(btnNewButton);
		
		btnCut = new JButton("Couper");
		btnCut.setBackground(Color.WHITE);
		btnCut.setIcon(new ImageIcon(PanelToolBar.class.getResource("/Images/ToolBarBtn24/document - Copie (5).jpg")));
		toolBar.add(btnCut);
		
		btnCopy = new JButton("Copier");
		btnCopy.setBackground(Color.WHITE);
		btnCopy.setIcon(new ImageIcon(PanelToolBar.class.getResource("/Images/ToolBarBtn24/document - Copie (6).jpg")));
		toolBar.add(btnCopy);

	}
	protected JButton getBtnDelete() {
		return btnDelete;
	}
	protected JButton getBtnAdd() {
		return btnAdd;
	}
	protected JButton getBtnEdit() {
		return btnEdit;
	}
	protected JButton getBtnAnnuler() {
		return btnAnnuler;
	}
	protected JButton getBtnPrint() {
		return btnPrint;
	}
	protected JButton getBtnCopy() {
		return btnCopy;
	}
	protected JButton getBtnCut() {
		return btnCut;
	}
	protected JButton getBtnNewButton() {
		return btnNewButton;
	}
	protected JToolBar getToolBar() {
		return toolBar;
	}
}
