package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaLista {

	public static void main(String[] args) {
		
		List<Carro>meusCarros = new ArrayList<>();
		
		Carro carro1 = new Carro("Audi X1",2021,"prata","2.2");
		meusCarros.add(carro1);//inserir informação

		meusCarros.add(new Carro("Renegade",2018,"preto","2.0"));
		meusCarros.add(new Carro("Etios Sedan",2019,"vermelho","1,6"));
		
		for(Carro carro: meusCarros) {
			System.out.println(carro.toString());
		}
		System.out.println("===========Imprime lista===========");
		
		for(int i = 0; i < meusCarros.size(); i++){
			Carro carroTemp = meusCarros.get(i);
			System.out.println(carroTemp.toString());
						
		}
		System.out.println("==========Imprime item da lista============");
		
		System.out.println(meusCarros.get(1));
		
				
		System.out.println("======================");
		for(Carro carro: meusCarros) {
			System.out.println(carro.toString());
						
		}
		//boolean resp = meusCarros(carros1);
		boolean resp = meusCarros.contains(new Carro("Etios Sedan",2019,"vermelho","1,6"));
		System.out.println(resp);
		
		System.out.println("===========Ordenar por nome===========");
		//sort()=>Comparable=> String
		Collections.sort(meusCarros);
		System.out.println(meusCarros.toString());
		
		System.out.println("===========Compara por ano===========");
		meusCarros.sort(new ComparadorDeAnos());
		System.out.println(meusCarros.toString());
		
		System.out.println("===========Colocar em ordem aleatória===========");
		Collections.shuffle(meusCarros);
		System.out.println(meusCarros.toString());
		
		}
	
		

}
