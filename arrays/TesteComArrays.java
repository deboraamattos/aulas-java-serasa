package arrays;

public class TesteComArrays {
	public static void main(String[] args) {
		
		//unidimensional ou vetor 
		int[] idades = {1,5,7,80,45}; // já está inicializado
		int[] idades2 = new int[5]; // não possui dados escritos pelo usuário
		
		String[] nomes = {"Julia","Marcia","Ana"};
		String[] nomes2 = new String[3];
		
		System.out.println(" - Idade:" + idades[3] + " - Nome:" + nomes[0]);
		
		for (int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
			
		}
		
		for (int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i]);
			
		}
		
		//multidimensionais ou vetor e matriz
		int[][] numeros = new int[3][3];
		
		for(int linha = 0; linha<3; linha++) {
			for(int coluna = 0; coluna<3; coluna++);
			
		}
		
		
	}

}
