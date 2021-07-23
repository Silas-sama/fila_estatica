public class PilhaEstatica implements Empilhavel {
	
	private int ponteiroTopo;
	private Object[] dados;
	
	public PilhaEstatica() {
		this(10);
	}

	public PilhaEstatica(int tamanho) {
		ponteiroTopo = -1;
		dados = new Object[tamanho];
	}
	
	public void empilhar(Object elemento) {
		if(!estaCheia()) {
			ponteiroTopo++;
			dados[ponteiroTopo] = elemento;
		} else {
			System.err.println("Pilha Cheia");
		}
	}
	
	public Object desempilhar() {
		Object elementoTopo = null;
		if(!estaVazia()) {
			elementoTopo = dados[ponteiroTopo]; 
			ponteiroTopo--;
		} else {
			System.err.println("Pilha Vazia");
		}
		return elementoTopo;
	}
	
	public Object topo() {
		Object elementoTopo = null;
		if(!estaVazia()) {
			elementoTopo = dados[ponteiroTopo]; 
		} else {
			System.err.println("Pilha Vazia");
		}
		return elementoTopo;	
	}
	
	public boolean estaCheia() {
		return (ponteiroTopo == dados.length-1);
	}
	
	public boolean estaVazia(){
		return (ponteiroTopo == -1);
	}
	
	public String imprimir(){
		String resultado = "[";
		for(int i = 0; i<=ponteiroTopo;i++) {
			resultado += dados[i]+ " ";
		}
		return resultado+"]";
	}
}