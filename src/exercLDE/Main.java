package exercLDE;

public class Main {

	public static void main(String[] args) {
		Pilha pilha = new Pilha();

		// System.out.println(pilha.topo());
		pilha.topo();
		System.out.println(pilha.cheia());
		System.out.println(pilha.vazia());

		pilha.push(0);
		pilha.push(1);
		pilha.push(2);
		pilha.push(3);
		pilha.push(4);

		pilha.topo();
		System.out.println(pilha.cheia());
		System.out.println(pilha.vazia());

		pilha.push(5);
		pilha.topo();

		pilha.listar();
		System.out.println("-----");
		System.out.println(pilha.vazia());
		pilha.pop();

		pilha.listar();

		System.out.println(pilha.getTopo());
	}
}
