package exercLDE;

public class Pilha {
	
	int tamanho = 5;
	int[] pilha = new int[tamanho];
	int topo = -1;
	
	public int getTopo() {
		return this.topo;
	}
	
	public void setTopo(int numero) {
		this.topo = numero;
	}
	
	public boolean vazia() {
		
		if(this.getTopo() == -1) {
			return true;
		}
		
		return false;
	}
	
	public boolean cheia() {
		
		if(this.getTopo() >= tamanho - 1) {
			return true;
		}
		
		return false;
	}
	/**
	 * remover o último elemento da Pilha = TOPO
	 */
	public void pop() {
		if(vazia()) {
			System.out.println("Pilha vazia.");
			return;
		}
		
		pilha[topo] = 0;
		topo--;
		System.out.println("removido");
		
	}
	
	/**
	 * Add elemento na pilha
	 * @param valor
	 */
	public void push(int valor) {
		
		if(cheia()) {
			System.out.println("Pilha Cheia.");
			return;
		}
		
		topo++;
		pilha[topo] = valor;
		System.out.println("adicionado");
	}
	
	/**
	 * Quem está no TOPO?
	 */
	public void topo() {
		if(vazia()) {
			System.out.println("Pilha Vazia.");
			return;
		}
		System.out.println("TOPO: " + pilha[topo]);
	}
	
	/**
	 * listar elementos da pilha
	 */
	public void listar() {
		
		if(vazia()) {
			System.out.println("Vazia");
			return;
		}
		
		int aux = topo;
		
		while(aux > -1) {
			System.out.println(pilha[aux]);
			aux--;
		}
	}
	
}
