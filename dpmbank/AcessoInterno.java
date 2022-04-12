package dpmbank;

public interface AcessoInterno {
	
	//interface � um tipo de classe, pois Java n�o aceita heran�as multiplas e n�o tem atributos
	//os metodos n�o tem comportamento s� assinatura e s�o implementados em outras classes
	
	/**
	 * 
	 * @param String usuario => pode-seinformar um usuario valido
	 * @param String senha => pode-se informar uma senha com at� 255 caracteres alfanumerico
	 * @return retorna verdadeiro quando a senha estiver correta
	 */
	public boolean autenciarSistema(String usuario, String senha);

	public boolean mudarSenha(String senha, String NovaSenha);

	public boolean mudarUsuario(String usuario, String novoUsuario);
	

}
