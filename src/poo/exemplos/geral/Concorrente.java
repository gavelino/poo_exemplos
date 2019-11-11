package poo.exemplos.geral;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Concorrente implements Runnable{
	private Set<Integer> numeros = new HashSet<Integer>();
	private int atual = 0;
	private int MAX = 1000;
	
	public synchronized int proximo() {
		return ++atual;
	}
	
	public boolean continua() {
		return atual<=MAX;
	}
	
	@Override
	public void run() {
		while (this.continua()) {
			int n = this.proximo();
			if (!numeros.add(n))
				System.out.println("Error numero ja existente: " + n);
		}		
	}
	
	public static void main(String[] args) throws InterruptedException {
		Date ti = new Date();
		Runnable r = new Concorrente();
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		
		t1.start();
		t1.sleep(1000);
		t2.start();
		
		t1.join();
		t2.join();
		Date tf = new Date();
		
		System.out.println(tf.getSeconds() - ti.getSeconds());
	}
	

}
