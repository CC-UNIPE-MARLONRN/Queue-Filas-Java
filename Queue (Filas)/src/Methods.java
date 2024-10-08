import java.util.Arrays;

public class Methods {

	private Object[] elementos;
	private int Quantidade;
	private static final int Limite_inicial = 10;
	
	public Methods() {
		this.elementos = new Object[Limite_inicial];
		this.Quantidade = 0;
	}
	
	public boolean FilaVazia() {
		if(Quantidade < 1) {
			return true;
		}
		return false;
	}
	
	private void AumentarFila() {
		elementos = Arrays.copyOf(elementos, elementos.length * 2);
	}
	
	public void EntrarNaFila(Object Valor) {
		if(FilaVazia()) {
			AumentarFila();
		}
		elementos[Quantidade++] = Valor;
	}
	
	public Object ProxDaFila() {
		if(FilaVazia()) {
			System.out.println("Fila Vazia");
			return null;
	}
		 return elementos[0];
	}
	
	public Object AvancarFila() {
		if(FilaVazia()) {
			System.out.println("Fila Vazia");
			return null;
	}
		Object primeiro = elementos[0];
		System.arraycopy(elementos, 1, elementos, 0, Quantidade - 1);
		Quantidade--;
		return primeiro;
	}
	
	 public void verFila() {
			if(FilaVazia()) {
				System.out.println("Fila Vazia");
			}
			else {
				
	
	        System.out.print("[");
	        for (int i = 0; i < Quantidade; i++) {
	            System.out.print(elementos[i]);
	            if (i < Quantidade - 1) {
	                System.out.print(", ");
	            }
	        }
	        System.out.println("]");
	    }
	 }
	 
	 public int verQuantidade() {
		 return Quantidade;
	 }
	 
	}
	
