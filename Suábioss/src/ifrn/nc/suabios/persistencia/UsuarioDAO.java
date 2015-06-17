package ifrn.nc.suabios.persistencia;

import ifrn.nc.suabios.negocio.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
	Connection connection = null;
	PreparedStatement ptmt = null;
	ResultSet resultSet = null;
	
	public UsuarioDAO() {
		
		
	}
	
		private Connection getConnection() throws SQLException{
			Connection conn;
			conn = ConnectionFactory.getInstance().getConnection();
			return (conn);
		}

		
		
		// M�todo para adicionar um usu�rio:
		
		public int add(Usuario usuario) {
			try {
				String queryString = "INSERT INTO usuarios(nome) VALUES (?)";
				connection = getConnection();
				ptmt = connection.prepareStatement(queryString);
				ptmt.setString(1, usuario.getNome());
				return ptmt.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				finishConnection();			
			}
			
			return 0;
		}

		
		// M�todo para listar todos os usu�rio:
		
		
		public List<Usuario> Listar(){
			
			List<Usuario> usuario = new ArrayList<>();
			
			try{
				
				String i = "SELECT * FROM usuarios";
				connection = getConnection();
				ptmt = connection.prepareStatement(i);
				resultSet = ptmt.executeQuery();
				
				while(resultSet.next()){
					
					Usuario user = new Usuario();
					user.setId(resultSet.getInt(1));
					user.setNome(resultSet.getString(2));
					
					usuario.add(user);
				}
			} catch(SQLException e){
				e.printStackTrace();
			}
			
			return usuario;
		}
		
		
		// M�todo para deletar um usu�rio:
		
		
		public int delete(Usuario usuario){
			
			try{
				
				String i = "DELETE FROM usuarios WHERE id = ?";
				connection = getConnection();
				ptmt = connection.prepareStatement(i);
				ptmt.setInt(1, usuario.getId());
				return ptmt.executeUpdate();
			} catch(SQLException e){
				e.printStackTrace();
			}
			return 0;
		}
		
		
		// M�todo para atualizar um usu�rio:
		
		
		public int atualizar(Usuario usuario){
			
			try{
				String i = "UPDATE usuarios SET nome = ? WHERE id = ? ";
				connection = getConnection();
				ptmt = connection.prepareStatement(i);
				ptmt.setString(1, usuario.getNome());
				ptmt.setInt(2, usuario.getId());
				return ptmt.executeUpdate();
				
			} catch(SQLException e){
				e.printStackTrace();
			}

			return 0;
		}
		
		
		// M�todo para buscar um usu�rio por ID:
		
		public void buscar(Usuario usuario){
			
			try{
				String i = "SELECT nome FROM usuarios WHERE id = ?";
				connection = getConnection();
				ptmt = connection.prepareStatement(i);
				ptmt.setInt(1, usuario.getId());
				resultSet = ptmt.executeQuery();
				
				if (resultSet.next()){
				
					Usuario user = new Usuario();
					user.setNome(resultSet.getString(1));
					System.out.println(".:: USU�RIO: " + user.getNome() + " ::.");
					
				}

			} catch(SQLException e){
				e.printStackTrace();
			}
			
		}
		

		public void finishConnection() {
			try {
				if (ptmt != null)
					ptmt.close();
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}
