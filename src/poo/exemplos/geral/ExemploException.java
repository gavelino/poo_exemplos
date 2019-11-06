package poo.exemplos.geral;


public class ExemploException {
	public static void main(String[] args) {
		int resultado;
		try {
			resultado = div(12,0);
			System.out.println(resultado);
		} catch (DivisaoPorZeroException e) {
			System.out.println("Desculpe o inconviniente, mas nao e possivel dividir " + 
		e.getDivedendo() + " por " + e.getDivisor() + " pois a divisao por zero "
				+ "nao e permitida");
		}
		System.out.println("Vc chegou no fim desse programa");
	}

	private static int div(int i, int j) throws DivisaoPorZeroException {
		if (j == 0)
			throw new DivisaoPorZeroException(i,j);
		return i/j;
	}
}
