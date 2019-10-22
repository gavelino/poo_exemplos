package poo.exemplos.banco;

public abstract class Operacao {
	private static int nOperacoes = 0;
	private String tipo;
	protected float valor;
	private int id;
	
	public Operacao(float valor, String tipo) {
		this.valor = valor;
		this.tipo = tipo;
		this.id = ++nOperacoes;
	}
	//abstract void executa();
	
	public String getTipo() {
		return tipo;
	}

}
