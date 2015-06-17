package ifrn.nc.suabios.apresentacao.table;

import ifrn.nc.suabios.negocio.Usuario;

import java.util.List;

import javax.swing.table.AbstractTableModel;

public class UserTableModel extends AbstractTableModel{
	
    private List<Usuario> dados;
    private String[] colunas = {"Nome"};
     
    public UserTableModel(List<Usuario> dados){
        this.dados = dados;
    }
     
    public void addRow(Usuario e){
        this.dados.add(e);
        this.fireTableDataChanged();
    }
 
    public String getColumnName(int num){
        return this.colunas[num];
    }
 
    @Override
    public int getRowCount() {
        return dados.size();
    }
 
    @Override
    public int getColumnCount() {
        return colunas.length;
    }
 
    @Override
    public Object getValueAt(int linha, int coluna) {
        switch(coluna){
            case 0: return dados.get(linha).getNome();
        }  
        return null;
    }

	public void removeRow(int linhaSelecionada) {
		this.dados.remove(linhaSelecionada);
        this.fireTableDataChanged();
	}

	public Usuario getUsuario(int linha) {
		
		return dados.get(linha);
	}

}
