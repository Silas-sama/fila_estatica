public class FilaEstatica implements Enfileiravel {

	private int ponteiroInicio, ponteiroFim;
	private Object[] dados;
	
	public FilaEstatica() {
		this(10);
	}
	
	public FilaEstatica(int tamanho) {
		ponteiroInicio = -1;
		ponteiroFim = -1;
		dados = new Object[tamanho];
	}
	
	public void enfileirar(Object elemento){
		if (!estaCheia()) {
			ponteiroFim++;
			dados[ponteiroFim] = elemento;
		} else {
			System.err.println("Fila Cheia!");
		}
	}
	
	public Object desenfileirar(){
		Object elementoInicio = null;
		if (!estaVazia()) {
			ponteiroInicio++;
			elementoInicio = dados[ponteiroInicio];
		} else {
			System.err.println("Fila Vazia!");
		}
		return elementoInicio;		
	}
	
	public Object espiar(){
		Object elementoInicio = null;
		if (!estaVazia()) {
			elementoInicio = dados[ponteiroInicio+1];
		} else {
			System.err.println("Fila Vazia!");		
		}
		return elementoInicio;
	}
	
	public boolean estaCheia(){
		return (ponteiroFim == dados.length-1);
	}
	
	public boolean estaVazia(){
		return (ponteiroInicio == ponteiroFim);
	}
	
	public String imprimir(){
		String resultado = "[";
		for (int i = ponteiroInicio+1; i <= ponteiroFim; i++) {
			//resultado += dados[i]+ " ";
			if (i == ponteiroFim)
				resultado += dados[i];
			else 
				resultado += dados[i] + ",";

		}
		return resultado + "]";		
	}
}