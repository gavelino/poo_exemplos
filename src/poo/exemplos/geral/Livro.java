package poo.exemplos.geral;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Livro implements Comparable<Livro>{
	private int id;
	static int nId=0;
	private String autor;
	private String titulo;
	public Livro(String autor, String titulo) {
		super();
		this.autor = autor;
		this.titulo = titulo;
		this.id = ++nId;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + " : " +  autor + " - " + titulo; 
	}
	
	public static void main(String[] args) {
		List<Livro> livros  = new ArrayList<Livro>();
		Livro meuLivro = new Livro("guilherme", "meu livro");
		livros.add(new Livro("a2", "l3"));
		livros.add(new Livro("a3", "l1"));
		livros.add(meuLivro);
		livros.add(new Livro("a1", "l2"));
		Collections.sort(livros, new Comparator<Livro>() {

			@Override
			public int compare(Livro o1, Livro o2) {
				// TODO Auto-generated method stub
//				return o1.autor.compareTo(o2.autor);
				return o1.titulo.compareTo(o2.titulo);
			}
		});
		Collections.reverse(livros);
		for (Livro livro : livros) {
			System.out.println(livro);
		}
		
	}
	@Override
	public int compareTo(Livro o) {
		
		return this.id-o.id;
	}
	
}	
