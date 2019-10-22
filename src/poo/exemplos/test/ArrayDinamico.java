package poo.exemplos.test;

public class ArrayDinamico {
	int current_size=0;
	int array[];
	
	public ArrayDinamico() {
		current_size = 10;
		array = new int[10];
	}
	
	void add(int i, int valor) {
		if (i>=current_size) {
			array = resizeArray(i);
		}
			
		array[i] = valor;
		
	}

	private int[] resizeArray(int i) {
		int[] new_array = new int[i+10];
		for (int j = 0; j < this.current_size; j++) {
			new_array[j] = array[j];
		}
		current_size = i+10;
		System.out.println("Array dimensionado. Novo tamanho = "+ current_size);
		return new_array;
	}
	
	@Override
	public String toString() {
		String str = "[";
		for (int i = 0; i < current_size; i++) {
			str+= array[i] + " ";
		}
		str+="]";
		return str;
	}
	public static void main(String[] args) {
		ArrayDinamico meuArray = new ArrayDinamico();
		for (int i = 0; i < 100; i++) {
			meuArray.add(i, i*2);
		}
		System.out.println(meuArray);
		
	}
}
