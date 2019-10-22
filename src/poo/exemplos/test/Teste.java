package poo.exemplos.test;

import java.util.HashSet;
import java.util.Set;

public class Teste {
	public static void main(String[] args) {
		Set<String> palavras = new HashSet<>();
		palavras.add("Livro");
		palavras.add("Caderno");
		palavras.add("Caderno");
		palavras.add("Mesa");
		System.out.println(palavras.size());
		for (String palavra : palavras) {
			System.out.println(palavra);
		}

	}
}
