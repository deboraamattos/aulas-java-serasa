package dpmbank;

import java.time.LocalDate;

// essa classe vai servir só pra colocar os atributos comuns para todos funcionários, então ela não poderá ser instanciada
//isso faz dela uma classe abstrata 
//Polimorfismo: são classes semelhantes, mas com comportamentos diferntes. Ex; Gerente tem a bonificação diferente dos outros 

public abstract class Funcionario {
	
	private final double INDICE = 0.05;
	private String nome;
	private String cpf;
	private String ctps;
	private LocalDate dataAdmissao;
	private double salario;
	
		
	public Funcionario() {
		
	}

	public Funcionario(String nome, String cpf, String ctps, LocalDate dataAdmissao, double salario) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.ctps = ctps;
		this.dataAdmissao = dataAdmissao;
		this.salario = salario;
	}
	
	/**
	 * Calculo de bonus para todos funcionarios
	 * 
	 * since 01/04/2022
	 * @author LENOVO
	  * @return valor calculado da bonificação
	  * 
	 */

	public double getBonus() {
		return this.salario*INDICE;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCtps() {
		return ctps;
	}

	public void setCtps(String ctps) {
		this.ctps = ctps;
	}

	public LocalDate getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(LocalDate dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return "Nome: " + getNome()+ "\n CTPS: "+getCtps() + "\n Data Admissão: " + getDataAdmissao() + "\n Salario: " + getSalario() + "\n Bonus: " + getBonus();
	}
	
	
	

}
