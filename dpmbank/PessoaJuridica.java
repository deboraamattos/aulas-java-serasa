package dpmbank;

public class PessoaJuridica extends PessoaHeranca {

	private String cnpj;
	private String segmento;
	private String responsavel;
	
	
	public PessoaJuridica() {
		super();
		
	}
	public PessoaJuridica(String nome, String email, String telefone) {
		super(nome, email, telefone);
		
	}
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getSegmento() {
		return segmento;
	}
	public void setSegmento(String segmento) {
		this.segmento = segmento;
	}
	public String getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
	
	
	
}
