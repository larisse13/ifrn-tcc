package ifrn.nc.suabios.negocio;

public class Usuario {
	int id;
	String nome;
	
	public Usuario() {
		
	}

	public Usuario(String nome, int id) {
		this.nome = nome;
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	
}

