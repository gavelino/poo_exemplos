package poo.exemplos.banco;

public class CpfCadastradoException extends Exception {
	@Override
	public String toString() {
		return "CPF já cadastrado.";
	}
}
