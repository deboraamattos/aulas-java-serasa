package textosestrings;

public class TrabalhandoComStrings {

	public static void main(String[] args) {
		
		//metodos são da Classe Character
		//verifica se o valor é um numero retorna true ou false 
		System.out.println(Character.isDigit('5'));
		System.out.println(Character.isDigit('a'));
		
		System.out.println("=====================");
		
		//verifica se o valor é uma letra retorna true ou false 
		System.out.println(Character.isLetter('f'));
		System.out.println(Character.isLetter('6'));
		
		System.out.println("=====================");
		
		//verifica se o valor é uma letra OU numero retorna true ou false 
		System.out.println(Character.isLetterOrDigit('c'));
		System.out.println(Character.isLetterOrDigit('5'));
		System.out.println(Character.isLetterOrDigit('@'));
				
		System.out.println("=====================");
		
		//verifica se está escrito em maiúsculo
		System.out.println(Character.isUpperCase('c'));
		System.out.println(Character.isUpperCase('A'));
		
		System.out.println("=====================");
		
		//verifica se está escrito em minúsculo
		System.out.println(Character.isLowerCase('N'));
		System.out.println(Character.isLowerCase('n'));
		
		System.out.println("=====================");
		
		//verifica se o valor é um espaço em branco
		System.out.println(Character.isWhitespace(' '));
		
				
		System.out.println("==========Strings===========");
		//String
		
		String arquivo = "escola.java";
		//verifica valor antigo e substitui pelo valor novo
		arquivo = arquivo.replace("java","class");
		System.out.println(arquivo);

		//compara 2 valores
		String nome1 = "debora";
		String nome2 = "Debora";
		
		//compara conteudo e caracteres maiusculo/minusculo
		System.out.println(nome1.equals(nome2));
		
		System.out.println("=====================");
		
		//compara o conteudo do texto
		System.out.println(nome1.equalsIgnoreCase(nome2));
		
		System.out.println("=====================");
		
		//verifica se inicia exatamente com a mesma sequencia de caracteres
		System.out.println(nome1.startsWith("deb"));
		System.out.println(nome1.startsWith("Deb"));
		
		System.out.println("=====================");
		
		//verifica se finaliza exatamente com a mesma sequencia de caracteres
		System.out.println(nome1.endsWith("ora"));
		System.out.println(nome1.startsWith("Deb"));
		
		System.out.println("=====================");
		
		//compara as letras uma a uma
		//muito usado para colocar em ordem alfabetica
		//colections
		System.out.println(nome1.compareTo(nome2));
	
		System.out.println("=====================");
		
		//verifica o tamanho da string
		System.out.println(nome1.length());
		
		System.out.println("=====================");
		
		//mostra o valor armazenado num determinado indice
		System.out.println(nome1.charAt(4));
		
		System.out.println("=====================");
		
		//retorna uma parte de uma string(informar inicio e fim(valor-1)
		System.out.println(nome1.substring(2,4));
		
		System.out.println("=====================");
		
		//retorna a posiçao da 1ª ocorrencia de uma letra
		System.out.println(nome1.indexOf("a"));
		
		System.out.println("=====================");
		
		//retorna a posiçao da ultima ocorrencia de uma letra
		System.out.println(nome1.lastIndexOf("a"));
		
		
		
		
	}

}
