package poo.exemplos.geral;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ExerciciosCollections {
	
	
	public static void main(String[] args) {
		String str = "Aula de POO Aula de POO todas as segundas e quartas das 10 as 12h";
		// EXERCICIO LIST
		String array[] = str.split(" ");
		List<String> palavras = new ArrayList<String>();
		for (int i = array.length-1; i >=0; i--) {
			palavras.add(array[i]);
		}
		for (String palavra : palavras) {
			System.out.print(palavra + " ");
		}
		
		// EXERCICIO SET
		java.util.Set<String> palavrasUnicas = new HashSet<String>(palavras);
//		palavrasUnicas.addAll(palavras);
		System.out.println("\n Num palavras = "+ palavras.size() + 
						   "  Num palavras diferentes = "+ 
						   	palavrasUnicas.size());   
		
		
		// EXERCICIO MAP
		Map<String, Integer> meuMap = new HashMap<String, Integer>();
		for (String palavra : palavras) {
			if (!meuMap.containsKey(palavra))
				meuMap.put(palavra, 0);
			
			meuMap.put(palavra, meuMap.get(palavra)+1);
		}
		for (String key : meuMap.keySet()) {
			System.out.println(key + " : " + meuMap.get(key));
		}
		
//		for (Entry<String, Integer> entry : meuMap.entrySet()) {
//			System.out.println(entry.getKey()+ " : " + entry.getValue());
//		}
	}

}
