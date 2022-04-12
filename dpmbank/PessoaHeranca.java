package dpmbank;

//toda classe � publica e todo atributo deve ser privado 
//e tem a possibilidade de acesso que deve ser escrito de uma forma publica

public class PessoaHeranca {
	
	private String nome;
	private String email;
	private String telefone;
	
	
	
	//metodo construtor default = preenchimento dos atributos � opcional
	public PessoaHeranca() {
		
	}
	
	//this � o atributo da classe e o outro � o valor que esta passando no parametro
	public PessoaHeranca(String nome, String email, String telefone) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}
	//encapsul�amento
	public String getNome() { //exibe os objetos 
		return nome;
	}
	public void setNome(String nome) { //grava os objetos nos atributos
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	} 
	
	
}