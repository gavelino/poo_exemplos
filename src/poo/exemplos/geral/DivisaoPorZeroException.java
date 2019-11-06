package poo.exemplos.geral;

public class DivisaoPorZeroException extends Exception {
	private int divedendo;
	private int divisor;
	public DivisaoPorZeroException(int divedendo, int divisor) {
		super();
		this.divedendo = divedendo;
		this.divisor = divisor;
	}
	
	public int getDivedendo() {
		return divedendo;
	}
	public int getDivisor() {
		return divisor;
	}
}
