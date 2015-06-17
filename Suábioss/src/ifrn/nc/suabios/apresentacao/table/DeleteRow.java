package ifrn.nc.suabios.apresentacao.table;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;
import javax.swing.JTable;

public class DeleteRow implements KeyListener{
	
	private JTable table;

		public void keyPressed(KeyEvent evt){

		if(evt.getKeyCode() == evt.VK_DELETE){

		int linhaSelecionada = table.getSelectedRow();


		UserTableModel modelo = (UserTableModel)table.getModel();


		if(linhaSelecionada < 0) return;

		modelo.removeRow(linhaSelecionada);

		JOptionPane.showMessageDialog(null,"Excluído");

		}

		}

		public void keyReleased(KeyEvent e) {}

		public void keyTyped(KeyEvent e) {}
	
	
}
