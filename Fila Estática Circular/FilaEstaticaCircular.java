public class FilaEstaticaCircular implements Enfileiravel {

	private int ponteiroInicio, ponteiroFim;
	private Object[] dados;
	private int quantidade;
	
	public FilaEstaticaCircular() {
		this(10);
	}
	
	public FilaEstaticaCircular(int tamanho) {
		quantidade = 0;
		ponteiroInicio = -1;
		ponteiroFim = -1;
		dados = new Object[tamanho];
	}
	
	public void enfileirar(Object elemento){
		if (!estaCheia()) {
			//patch para que a fila funcione de forma circular
			if (ponteiroFim == dados.length-1) {
				ponteiroFim = -1;
			}
			quantidade++;
			//fim do patch
			ponteiroFim++;
			dados[ponteiroFim] = elemento;
		} else {
			System.err.println("Fila Cheia!");
		}
	}
	
	public Object desenfileirar(){
		Object elementoInicio = null;	
		if (!estaVazia()) {
			//patch para que a fila funcione de forma circular
			if (ponteiroInicio == dados.length-1) {
				ponteiroInicio = -1;
			}
			quantidade--;
			//fim do patch
			ponteiroInicio++;
			elementoInicio = dados[ponteiroInicio];			

		} else {
			System.err.println("Fila Vazia!");
		}
		return elementoInicio;
	}
	
	public Object espiar(){
		Object elementoInicio = null;
		int ponteiroAux = ponteiroInicio;
		if (!estaVazia()) {
			//patch para que a fila funcione de forma circular
			if (ponteiroAux == dados.length-1) {
				ponteiroAux = -1;
			}	
			//fim do patch
			elementoInicio = dados[ponteiroAux+1];
		} else {
			System.err.println("Fila Vazia!");		
		}
		return elementoInicio;
	}
	
	public boolean estaCheia(){
		return (quantidade == dados.length);
	}
	
	public boolean estaVazia(){
		return (quantidade == 0);
	}
	
	public String imprimir(){
		String resultado = "[";
		
		int i = ponteiroInicio+1;
		for (int auxQtde = 0; auxQtde != quantidade; auxQtde++) {

			//patch para que a fila funcione de forma circular
			if (i == dados.length) {
				i = 0;
			}
			//fim do patch	
			
			if (i == ponteiroFim)
				resultado += dados[i];
			else
				resultado += dados[i] + ",";

			i++;
		}
		return resultado + "]";		
	}
}