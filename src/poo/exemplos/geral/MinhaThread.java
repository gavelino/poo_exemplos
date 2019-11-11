package poo.exemplos.geral;

public class MinhaThread extends Thread{
	private String nome;

	public MinhaThread(String nome) {
		super();
		this.nome = nome;
	}
	
	@Override
	public void run() {
		for (int i = 0; i <= 100; i+=20) { 
			System.out.println("Thread "+ nome + ": " + i + "%");
		}
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		MinhaThread t1 = new MinhaThread("T1");
		MinhaThread t2 = new MinhaThread("T2");
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		System.out.println("Fim do meu programa!");
		
	}
}
