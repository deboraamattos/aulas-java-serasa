package dpmbank;

import java.time.LocalDate;
import java.util.Locale;

public class TestaBanco {
	
	public static void main(String[] args) {
		

		//Pessoa pessoaNumero1 = new Pessoa(); //instanciar a classe Pessoa
		//pessoaNumero1.setNome("Jose das Couves");
		//System.out.println("Nome: " + pessoaNumero1.getNome());
		
		
		//Pessoa pessoaNumero2 = new Pessoa("João dos Tomates", "12345678995", "213.985.456-78");
		//System.out.println("Nome: " + pessoaNumero2.getNome());
		//System.out.println("CPF: " + pessoaNumero2.getCpf());
		//System.out.println("RG: " + pessoaNumero2.getRg());
		
//PessoaFisica pfDebora = new PessoaFisica();
//pfDebora.setNome("Debora");
//pfDebora.setEmail("debora_kopor@hotmail.com");
//pfDebora.setTelefone("966665984565");
//pfDebora.setCpf("879.359.983-88");
//pfDebora.setProfissao("Adm");
//pfDebora.setRg("12333666954");
//
//Conta conta1 = new Conta();
//conta1.setAgencia(1234);
//conta1.setNumeroConta(7889);
//conta1.setSaldo(100000.50);não se deve alterar diretamente essa informação, só pode ser exibida
//conta1.setTitular(pfDebora);
//
//conta1.depositar(100000.0);

//System.out.println("Titular: " + conta1.getTitular().getNome());
//System.out.printf("Saldo atual: R$ %.2f\n ",conta1.getSaldo());
//
//if (conta1.sacar(100.0)) {
//	System.out.println("Saque efetuado com sucesso!");
//}else{
//	System.out.println("Verifique o saldo");
//}
//
//System.out.printf("Saldo atual: R$ %.2f\n ",conta1.getSaldo());

//Conta conta2 = new Conta();
//conta2.setAgencia(5582);
//conta2.setAgencia(2234);
//
//conta1.transferir(6000, conta2);
//
//System.out.printf("Saldo atual: R$ %.2f\n ",conta1.getSaldo());
//
//System.out.printf("Saldo atual destinatario: R$ %.2f\n ",conta2.getSaldo());
//
//ContaCorrente cc1 = new ContaCorrente();
//cc1.depositar(1000);
//System.out.println("Saldo" + cc1.getSaldo());
//System.out.println("Limite" + cc1.getLimite());
//System.out.println("Saldo com Limite " + cc1.getsaldoComLimite());
//cc1.sacar(500);
//System.out.println("Saldo" + cc1.getSaldo());
//System.out.println("Saldo com limite " + cc1.getsaldoComLimite());


		Locale.setDefault(new Locale("pt","BR")); //serve par impressão de data e moeda de acordo com o pais
		Gerente	funcionario = new Gerente("Debora Mattos", "001.122.348-92", "87759",LocalDate.now(),3000.00);
		
		System.out.println(funcionario.toString());
		
		boolean resposta = funcionario.autenciarSistema("usuariopadrao", "mudar123");
		if (resposta)
			System.out.println("Bem vindo " + funcionario.getNome());
		else
			System.out.println("Usuario ou senha inválidos");
				
		boolean resposta2 = funcionario.mudarSenha("mudar123","mudar1234");
		if (resposta2)
			System.out.println("Senha alterada com sucesso ");
		else
			System.out.println("a senha precisa ser diferente da anterior");
	
		boolean resposta3 = funcionario.mudarUsuario("usuariopadrao","usuariopadrao");
		if (resposta3)
			System.out.println("Usuario alterada com sucesso ");
		else
			System.out.println("o usuario precisa ser diferente do anterior");
	}
}