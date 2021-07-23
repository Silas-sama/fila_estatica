public class FilaDuplaPrincipal {
	public static void main(String[] args) {
		DuplamenteEnfileiravel fila = new FilaEstaticaDupla();
		fila.enfileirarInicio("A");
		System.out.println(fila.imprimir());
		fila.espiarFim();//A
		fila.enfileirarInicio("B");
		System.out.println(fila.imprimir());
		fila.desenfileirarFim();
		System.out.println(fila.imprimir());
		fila.enfileirarFim("C");
		System.out.println(fila.imprimir());
		fila.desenfileirarInicio();
		System.out.println(fila.imprimir());
		fila.enfileirarInicio("D");
		System.out.println(fila.imprimir());
		fila.espiarInicio(); //D
		fila.desenfileirarFim();
		System.out.println(fila.imprimir());
		fila.espiarFim(); //D
		fila.enfileirarInicio("E");
		System.out.println(fila.imprimir());
		fila.enfileirarFim("F");
		System.out.println(fila.imprimir());
		fila.desenfileirarInicio();
		System.out.println(fila.imprimir());
		fila.enfileirarFim("G");
		System.out.println(fila.imprimir());
		fila.espiarFim(); //G
		fila.enfileirarInicio("H");
		System.out.println(fila.imprimir());
		fila.desenfileirarFim();
		System.out.println(fila.imprimir());
		fila.enfileirarFim("I");
		System.out.println(fila.imprimir());
		fila.enfileirarInicio("J");
		System.out.println(fila.imprimir());
		fila.espiarInicio(); //J
		fila.enfileirarFim("K");
		System.out.println(fila.imprimir());
		fila.enfileirarFim("L");
		System.out.println(fila.imprimir());
		fila.espiarInicio(); //J
		fila.desenfileirarInicio();
		System.out.println(fila.imprimir());
	}
}
