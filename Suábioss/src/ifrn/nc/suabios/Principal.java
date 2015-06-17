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
			
			System.out.println("\n .:: MENU DE OPÇÕES ::.");
			
			System.out.println(" 0 - Sair");
			System.out.println(" 1 - Cadastrar um usuário");
			System.out.println(" 2 - Excluir um usuário");
			System.out.println(" 3 - Atualizar um usuário");
			System.out.println(" 4 - Buscar um usuário por ID");
			System.out.println(" 5 - Listar todos os usuários");
			
			op = teclado.nextInt();
			teclado.nextLine();
			
			
			Usuario usuario = new Usuario();
			UsuarioDAO usuariodao = new UsuarioDAO();
			
			switch(op){
			
			
			case 0:
				
				System.out.println(".:: SUA CONEXÃO FOI ENCERRADA! ::.");
				
				break;
				
				
			case 1: 
				
				System.out.println(".:: CADASTRO DE USUÁRIOS ::.");
				
				System.out.println(" Informe o nome do usuário: ");
				String nome = teclado.nextLine();
			
				usuario.setNome(nome);
				
				usuariodao.add(usuario);
				
				System.out.println(".:: USUÁRIO CADASTRADO COM SUCESSO! ::.");
				
				break;
				
			case 2: 
				
				System.out.println(".:: EXCLUIR UM USUÁRIO ::.");
				
				System.out.println("Informe o ID do usuário que deseja excluir: ");
				int n = teclado.nextInt();
				teclado.nextLine();
				
				usuario.setId(n);
				
				usuariodao.delete(usuario);
				
				System.out.println(".:: USUÁRIO DELETADO COM SUCESSO! ::.");
				
				break;				
			
				
			case 3:
				
				System.out.println(".:: ATUALIZAR UM USUÁRIO ::.");
				
				System.out.println("Informe o ID do usuário que deseja atualizar:");
				int id = teclado.nextInt();
				teclado.nextLine();
				
				usuario.setId(id);
				
				System.out.println("Informe o novo nome do usuário: ");
				String nome_n = teclado.nextLine();
				
				usuario.setNome(nome_n);
				
				usuariodao.atualizar(usuario);
				
				System.out.println(".:: USUÁRIO ATUALIZADO COM SUCESSO! ::.");				
				
				break;
				
				
			case 4:
				
				System.out.println(".:: BUSCAR USUÁRIO POR ID ::.");
				
				System.out.println("Informe o ID do usuário que deseja buscar: ");
				int codigo = teclado.nextInt();
				teclado.nextLine();
				
				usuario.setId(codigo);
				
				usuariodao.buscar(usuario);
				
				break;
				
				
			case 5:
				
				System.out.println(".:: LISTA DE USUÁRIOS ::.");
				
				List<Usuario> user = usuariodao.Listar();
				
				for (Usuario u : user) {
					System.out.println("ID: " + u.getId() + "   -   Nome: " + u.getNome());
				}

				break;
				
			default:
				
				System.out.println(".:: OPÇÃO INVÁLIDA! POR FAVOR TENTE NOVAMENTE ::.");
				
				break;
			
			}
			
			
		} while(op != 0);
		
	}

}
