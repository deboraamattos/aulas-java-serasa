package dpmbank;

public interface AcessoInterno {
	
	//interface é um tipo de classe, pois Java não aceita heranças multiplas e não tem atributos
	//os metodos não tem comportamento só assinatura e são implementados em outras classes
	
	/**
	 * 
	 * @param String usuario => pode-seinformar um usuario valido
	 * @param String senha => pode-se informar uma senha com até 255 caracteres alfanumerico
	 * @return retorna verdadeiro quando a senha estiver correta
	 */
	public boolean autenciarSistema(String usuario, String senha);

	public boolean mudarSenha(String senha, String NovaSenha);

	public boolean mudarUsuario(String usuario, String novoUsuario);
	

}
