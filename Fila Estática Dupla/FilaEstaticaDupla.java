public class FilaEstaticaDupla implements DuplamenteEnfileiravel {
	
	private int ponteiroInicio, ponteiroFim;
	private Object[] dados;
	private int quantidade;
	
	public FilaEstaticaDupla() {
		this(10);
	}
	
	public FilaEstaticaDupla(int tamanho) {
		quantidade = 0;
		ponteiroInicio = -1;
		ponteiroFim = -1;
		dados = new Object[tamanho];
	}
	
	//funciona como o enfileirar de FilaEstaticaCircular
	public void enfileirarFim(Object elemento) {
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
	
	//funciona como o desenfileirar de FilaEstaticaCircular
	public Object desenfileirarInicio() {
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
	
	//funciona como o espiar de FilaEstaticaCircular
	public Object espiarInicio() {
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
	
	//funciona como o estaCheia de FilaEstaticaCircular	
	public boolean estaCheia() {
		return (quantidade == dados.length);
	}

	//funciona como o estaVazia de FilaEstaticaCircular
	public boolean estaVazia(){
		return (quantidade == 0);	
	}
	
	//funciona como o imprimir de FilaEstaticaCircular
	public String imprimir() {
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
	
	public void enfileirarInicio(Object elemento) {
		if (!estaCheia()) {
			//patch para que a fila funcione de forma circular
			if (ponteiroInicio == -1) {
				ponteiroInicio = dados.length-1;
			}
			quantidade++;
			//fim do patch
			dados[ponteiroInicio] = elemento;
			ponteiroInicio--;
		} else {
			System.err.println("Fila Cheia!");
		}
	}
		
	public Object desenfileirarFim() {
		Object elementoFim = null;	
		if (!estaVazia()) {
			elementoFim = dados[ponteiroFim];
			ponteiroFim--;
			//patch para que a fila funcione de forma circular
			if (ponteiroFim == -1) {
				ponteiroFim = dados.length - 1;
			}
			quantidade--;
			//fim do patch
		} else {
			System.err.println("Fila Vazia!");
		}
		return elementoFim;		
	}
			
	public Object espiarFim() {
		Object elementoFim = null;	
		if (!estaVazia()) {
			elementoFim = dados[ponteiroFim];
		} else {
			System.err.println("Fila Vazia!");		
		}
		return elementoFim;
	}
}
