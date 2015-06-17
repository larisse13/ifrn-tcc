package ifrn.nc.suabios;

import ifrn.nc.suabios.negocio.Usuario;
import ifrn.nc.suabios.persistencia.UsuarioDAO;

import java.util.List;
import java.util.Scanner;

public class Principal {
	
	static Scanner teclado = new Scanner(System.in);
	
	public static void main (String[] args){
		
		int op = 0;
		
		do{
			
			System.out.println("\n .:: MENU DE OP��ES ::.");
			
			System.out.println(" 0 - Sair");
			System.out.println(" 1 - Cadastrar um usu�rio");
			System.out.println(" 2 - Excluir um usu�rio");
			System.out.println(" 3 - Atualizar um usu�rio");
			System.out.println(" 4 - Buscar um usu�rio por ID");
			System.out.println(" 5 - Listar todos os usu�rios");
			
			op = teclado.nextInt();
			teclado.nextLine();
			
			
			Usuario usuario = new Usuario();
			UsuarioDAO usuariodao = new UsuarioDAO();
			
			switch(op){
			
			
			case 0:
				
				System.out.println(".:: SUA CONEX�O FOI ENCERRADA! ::.");
				
				break;
				
				
			case 1: 
				
				System.out.println(".:: CADASTRO DE USU�RIOS ::.");
				
				System.out.println(" Informe o nome do usu�rio: ");
				String nome = teclado.nextLine();
			
				usuario.setNome(nome);
				
				usuariodao.add(usuario);
				
				System.out.println(".:: USU�RIO CADASTRADO COM SUCESSO! ::.");
				
				break;
				
			case 2: 
				
				System.out.println(".:: EXCLUIR UM USU�RIO ::.");
				
				System.out.println("Informe o ID do usu�rio que deseja excluir: ");
				int n = teclado.nextInt();
				teclado.nextLine();
				
				usuario.setId(n);
				
				usuariodao.delete(usuario);
				
				System.out.println(".:: USU�RIO DELETADO COM SUCESSO! ::.");
				
				break;				
			
				
			case 3:
				
				System.out.println(".:: ATUALIZAR UM USU�RIO ::.");
				
				System.out.println("Informe o ID do usu�rio que deseja atualizar:");
				int id = teclado.nextInt();
				teclado.nextLine();
				
				usuario.setId(id);
				
				System.out.println("Informe o novo nome do usu�rio: ");
				String nome_n = teclado.nextLine();
				
				usuario.setNome(nome_n);
				
				usuariodao.atualizar(usuario);
				
				System.out.println(".:: USU�RIO ATUALIZADO COM SUCESSO! ::.");				
				
				break;
				
				
			case 4:
				
				System.out.println(".:: BUSCAR USU�RIO POR ID ::.");
				
				System.out.println("Informe o ID do usu�rio que deseja buscar: ");
				int codigo = teclado.nextInt();
				teclado.nextLine();
				
				usuario.setId(codigo);
				
				usuariodao.buscar(usuario);
				
				break;
				
				
			case 5:
				
				System.out.println(".:: LISTA DE USU�RIOS ::.");
				
				List<Usuario> user = usuariodao.Listar();
				
				for (Usuario u : user) {
					System.out.println("ID: " + u.getId() + "   -   Nome: " + u.getNome());
				}

				break;
				
			default:
				
				System.out.println(".:: OP��O INV�LIDA! POR FAVOR TENTE NOVAMENTE ::.");
				
				break;
			
			}
			
			
		} while(op != 0);
		
	}

}
