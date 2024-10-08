
public class Main {

	public static void main(String[] args) {
		Methods Fila = new Methods();
		
		Fila.verFila();
		
		Fila.EntrarNaFila(1);
		Fila.EntrarNaFila(2);
		Fila.EntrarNaFila(3);
		
		Fila.verFila();
		
		System.out.println(Fila.verQuantidade());
		System.out.println(Fila.ProxDaFila());
		
		Fila.AvancarFila();
		Fila.verFila();
		
	}
}
