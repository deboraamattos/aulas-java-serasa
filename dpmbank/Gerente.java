package dpmbank;

import java.time.LocalDate;

public class Gerente extends Funcionario implements AcessoInterno {
	
	//mockado = teste com o valor já no atributo 
	private String usuario = "usuariopadrao";
	private String senha = "mudar123";
	

	public Gerente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gerente(String nome, String cpf, String ctps, LocalDate dataAdmissao, double salario) {
		super(nome, cpf, ctps, dataAdmissao, salario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getBonus() {
		return this.getSalario()*0.1;
	}

	@Override
	public boolean autenciarSistema(String usuario, String senha) {
		if(this.usuario.equals(usuario) && this.senha.equals(senha)){
		return true;
		}
	return false;
	}
	
	@Override
	public boolean mudarSenha(String senha, String novaSenha) {
		if(this.senha.equals(senha) && novaSenha.length() <= 8){
			this.senha = novaSenha;
			return true;
		}
		return false;
	}
	
	@Override
	public boolean mudarUsuario (String usuario, String novoUsuario) {
		if(this.usuario.equals(usuario) && novoUsuario.length() <= 12){
			this.usuario = novoUsuario;
			return true;
		}
		return false;
	}
	
	//mudar senha e usario - um metodo para cada 
	// só pode mudar a senha precisa ter a senha anterior e a nova senha , se a senha anterior for valida, pode mudar a senha 
	
	//limitar quantiade de caracteres; usario até 12 e senha até 8
	
}
