package poo.exemplos.geral;

public interface EstruturaDinamica<Generic> {

		public void add(int indice, Generic obj);
		
		public void remove(int indice);
		
		public int size();
		
		public Generic get(int indice);
}
