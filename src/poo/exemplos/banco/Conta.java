package poo.exemplos.banco;

public class Conta {
	private static int numContas=0;
	private int numero;
	private float saldo;
	private Operacao operacoes[];
	int nOperacoes=0;
	
	
	public int getNumero() {
		return numero;
	}
	public float getSaldo() {
		return saldo;
	}
	public Operacao[] getOperacoes() {
		return operacoes;
	}
	
	public Conta() {
		this.numero = ++numContas;
		this.operacoes = new Operacao[10];
	}
	
	public void saque(float valor) {
		this.saldo -=valor;
		this.operacoes[nOperacoes++] = new Saque(valor);
	}
	public void deposito(float valor) {
		this.saldo += valor;
		this.operacoes[nOperacoes++] = new Deposito(valor);
	}
}
