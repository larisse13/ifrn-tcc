package ifrn.nc.suabios.apresentacao;

import ifrn.nc.suabios.apresentacao.table.UserTableModel;
import ifrn.nc.suabios.negocio.Usuario;
import ifrn.nc.suabios.persistencia.UsuarioDAO;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.JDialog;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.Point;

public class ListUsers extends JDialog {
	private JTable table;
	/**
	 * @wbp.nonvisual location=92,299
	 */

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ListUsers dialog = new ListUsers(null);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ListUsers(Frame dono) {
		
		super(dono, true);
		setTitle("Lista de Usu\u00E1rios");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Larisse\\Downloads\\logo.png"));
		
		setBounds(100, 100, 282, 300);
		getContentPane().setLayout(new BorderLayout());
		
			JScrollPane scrollPane = new JScrollPane();
			getContentPane().add(scrollPane, BorderLayout.CENTER);
	
			
			table = new JTable();

			UsuarioDAO usuarioDAO = new UsuarioDAO();
			List<Usuario> usuario = usuarioDAO.Listar();

			
			table.setModel(new UserTableModel(usuario));
			scrollPane.setViewportView(table);
			
			JPopupMenu popupMenu = new JPopupMenu();
			addPopup(table, popupMenu);
			
			JMenuItem mntmAdicionar = new JMenuItem("Adicionar");
			mntmAdicionar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					CadastroUser dialog = new CadastroUser(dono);
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setLocationRelativeTo(null);
					dialog.setVisible(true);
					
				}
			});
			
			popupMenu.add(mntmAdicionar);
			
			
			JMenuItem mntmNewMenuItem = new JMenuItem("Excluir");
			mntmNewMenuItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					int linha = table.getSelectedRow();
					UserTableModel model = (UserTableModel) table.getModel();
					
					Usuario user = model.getUsuario(linha);
					
					UsuarioDAO userdao = new UsuarioDAO();
					userdao.delete(user);
					
					model.removeRow(linha);
					
				}
			});
			
			popupMenu.add(mntmNewMenuItem);
			table.addMouseListener(new TableMouseListener(table));

	}
	
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
