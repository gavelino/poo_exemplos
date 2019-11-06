package poo.exemplos.banco;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Banco {
	static Map<String, Cliente> clientes = new HashMap<String, Cliente>();
	public static void main(String[] args) {
		Menu menuPrincipal = new Menu("Menu Principal", 
				Arrays.asList("Clientes", "Contas", "Operacoes", "Sair"));
		
		int op = 0;
		while (op!=4) {
			op = menuPrincipal.getSelection();
			
			switch (op) {
			case 1:
				clientes();
				
				break;
	
			default:
				throw new IllegalArgumentException("Unexpected value: " + op);
			}
		}
	}
	private static void clientes() {
		Menu menu = new Menu("Menu Clientes", 
				Arrays.asList("Cadastrar", "Listar",  "Sair"));
		int op = 0;
		while (op!=3) {
			op = menu.getSelection();

			switch (op) {
			case 1:
				Scanner s = new Scanner(System.in);
				System.out.println("Informe o Cpf do cliente:");
				String cpf = s.nextLine();
				System.out.println("Informe o Nome do cliente:");
				String nome = s.nextLine();
				try {
					cadastroCliente(cpf, nome);
				} catch (CpfCadastradoException e) {
					System.out.println(e + "n. Verifique o CPF e tente novamente");

				}

				break;

			default:
				throw new IllegalArgumentException("Unexpected value: " + op);
			}	
		}
	}
	private static void cadastroCliente(String cpf, String nome) throws CpfCadastradoException {
		if (clientes.containsKey(cpf))
			throw new CpfCadastradoException();
		clientes.put(cpf, new Cliente(cpf, nome));
		
	}
	
}
