public class FilaEstaticaComPilhasPrincipal {
	
	public static void main(String[] args) {
		Enfileiravel fila = new FilaEstaticaComPilhas();
		fila.enfileirar("Claudio");
		fila.enfileirar("Rodolfo");
		System.out.println(fila.espiar());
		System.out.println(fila.espiar());
		System.out.println(fila.espiar());
		fila.enfileirar("Sousa");
		fila.desenfileirar();
		fila.enfileirar("de");
		fila.enfileirar("Oliveira");
		System.out.println("SecondName:" + fila.desenfileirar());
	}
}