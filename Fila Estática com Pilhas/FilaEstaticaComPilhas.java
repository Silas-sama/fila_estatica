public class FilaEstaticaComPilhas implements Enfileiravel {

	private Empilhavel p1;
	private Empilhavel p2;
	
	public FilaEstaticaComPilhas() {
		this(10);
	}
	
	public FilaEstaticaComPilhas(int tamanho) {
		p1 = new PilhaEstatica(tamanho);
		p2 = new PilhaEstatica(tamanho);
	}
	
	public void enfileirar(Object elemento) {
		if (!p1.estaCheia()) {
			p1.empilhar(elemento);
		} else {
			System.err.println("Fila Cheia!");
		}
	}
	
	public Object desenfileirar(){
		Object elementoInicio = null;	
		if (!p1.estaVazia()) {
			while (!p1.estaVazia()) {
				p2.empilhar(p1.desempilhar());
			}
			elementoInicio = p2.desempilhar();
			
			while (!p2.estaVazia()) {
				p1.empilhar(p2.desempilhar());
			}			
		} else {
			System.err.println("Fila Vazia!");
		}
		return elementoInicio;
	}
	
	public Object espiar(){
		Object elementoInicio = null;
		if (!p1.estaVazia()) {
			while (!p1.estaVazia()) {
				p2.empilhar(p1.desempilhar());
			}
			elementoInicio = p2.topo();
			
			while (!p2.estaVazia()) {
				p1.empilhar(p2.desempilhar());
			}
		} else {
			System.err.println("Fila Vazia!");		
		}
		return elementoInicio;
	}
	
	public boolean estaCheia(){
		return p1.estaCheia();
	}
	
	public boolean estaVazia(){
		return p1.estaVazia();
	}
	
	public String imprimir(){
		String resultado = "";
		
		while (!p1.estaVazia()) {
			p2.empilhar(p1.desempilhar());
		}
		
		resultado = p2.imprimir();
		
		while (!p2.estaVazia()) {
			p1.empilhar(p2.desempilhar());		
		}
		return resultado;		
	}
}