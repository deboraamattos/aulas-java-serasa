package entradaDeDados;
import java.util.Scanner;

public class TesteEntradaDeDados {

	public static void main(String[] args) {
	Scanner entradaDeDados = new Scanner(System.in);
	
	System.out.println("Informe o nome completo: ");
	String nome = entradaDeDados.nextLine();
	
	System.out.println("o nome informado é " + nome);
	
	System.out.println("Informe sua idade: ");
	int idade = entradaDeDados.nextInt();
	System.out.println("Idade informada: " + idade);
	}
}
