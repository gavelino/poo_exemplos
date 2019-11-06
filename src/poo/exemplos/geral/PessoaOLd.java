package poo.exemplos.geral;

class PessoaOLd implements Comparable<PessoaOLd>{
	String nome;
	public PessoaOLd(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	@Override
	public int compareTo(PessoaOLd o) {
		// TODO Auto-generated method stub
		return 0;
	}
}