package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class TesteMaps {

	public static void main(String[] args) {
		
		Map<String,Integer> quadroMedalhasOlimpicas2020 = new HashMap<>();
		
		//put=> adicionar valores ao map
		quadroMedalhasOlimpicas2020.put("EUA",113);
		quadroMedalhasOlimpicas2020.put("China",88);
		quadroMedalhasOlimpicas2020.put("Japão",58);
		quadroMedalhasOlimpicas2020.put("Grã-Bretanha",65);
		quadroMedalhasOlimpicas2020.put("Brasil",21);
		
		//buscar atraves de uma chave e retorna booleano
		System.out.println(quadroMedalhasOlimpicas2020.containsKey("Alemanha"));
		
		//buscar informação atraves de uma valor e retorna um booleano
		System.out.println(quadroMedalhasOlimpicas2020.containsValue(58));

		//Informa o tamanho do map
		System.out.println(quadroMedalhasOlimpicas2020.size());
		
		//Conultar o valor armazenado na chave		
		System.out.println(quadroMedalhasOlimpicas2020.get("Brasil"));
		
		//Remover valores da lista
		System.out.println(quadroMedalhasOlimpicas2020.remove("Brasil"));
		
		//imprimir dados da lista 
		for (Map.Entry<String,Integer>entry:quadroMedalhasOlimpicas2020.entrySet()){
			System.out.println(entry.getKey() + "->" + entry.getValue());
		}
		
		System.out.println("===========================");
		
		//imprimir dados buscando pela chave
		for(String key: quadroMedalhasOlimpicas2020.keySet()) {
			System.out.println(key + "=>" + quadroMedalhasOlimpicas2020.get(key));
		}


		System.out.println("Implementação de TreeMap");
		TreeMap<String,Integer>quadroquadroMedalhasOlimpicas2016 = new TreeMap<>();
		
		quadroquadroMedalhasOlimpicas2016.put("EUA",103);
		quadroquadroMedalhasOlimpicas2016.put("China",90);
		quadroquadroMedalhasOlimpicas2016.put("Japão",50);
		quadroquadroMedalhasOlimpicas2016.put("Grã-Bretanha",70);
		quadroquadroMedalhasOlimpicas2016.put("Brasil",17);
		
		//busca a primeira chave
		System.out.println(quadroquadroMedalhasOlimpicas2016.firstKey());
		
		//busca a ultima chave
		System.out.println(quadroquadroMedalhasOlimpicas2016.lastKey());
		
		//mostra a chave anterior 
		System.out.println(quadroquadroMedalhasOlimpicas2016.lowerKey("China"));
		
		//mostra a chave posterior
		System.out.println(quadroquadroMedalhasOlimpicas2016.higherKey("China"));
		
		//exibe o valor e apaga posteriormente
		System.out.println(quadroquadroMedalhasOlimpicas2016.pollFirstEntry());
		
		//exibe o valor e apaga posteriormente
		System.out.println(quadroquadroMedalhasOlimpicas2016.pollLastEntry());
	}
	

}
