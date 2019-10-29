package poo.exemplos.geral;

import java.util.List;
import java.util.ArrayList;

public class ArrayDinamico implements EstruturaDinamica {
	int size=0;
	Object array[];
	
	public ArrayDinamico(int tamanhoInicial) {
		array = new Object[tamanhoInicial];
	}
	
	public static void main(String[] args) {
		//ArrayDinamico meuArray = new ArrayDinamico(10);
		List<Pessoa> meuArray = new ArrayList<Pessoa>();
//		List meuArray = new ArrayList();
		for (int i = 0; i < 10; i++) {
			Pessoa pessoa = new Pessoa("pessoa-"+i);
			meuArray.add(pessoa);
		}
		
		int n[] = {1,2,3,45,5};
		for(int x : n) {
			System.out.println(x);
		}
		for (int i = 0; i < meuArray.size(); i++) {
			System.out.print(meuArray.get(i).getNome());
		}
	}
	
	@Override
	public void add(int indice, Object obj) {
		if(indice>=array.length) 
			resize(indice);
			
		
		array[indice] = obj;
		size++;
			

	}

	private void resize(int indice) {
		Object novoArray[] = new Object[indice*2];
		for (int i = 0; i < array.length; i++) {
			novoArray[i] = array[i];
		}
		array = novoArray;
		System.out.println("Vetor redimencionado, novo tamanho = "+array.length);
	}

	@Override
	public void remove(int indice) {
		array[indice] = null;
		size--;

	}

	@Override
	public int size() {
		return array.length;
	}

	@Override
	public Object get(int indice) {
		if (indice>=size)
			return null;
		else 
			return array[indice];
	}
	
	

}

