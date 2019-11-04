package poo.exemplos.geral;

class Pessoa implements Comparable<Pessoa>{
	String nome;
	public Pessoa(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	@Override
	public int compareTo(Pessoa o) {
		// TODO Auto-generated method stub
		return 0;
	}
}