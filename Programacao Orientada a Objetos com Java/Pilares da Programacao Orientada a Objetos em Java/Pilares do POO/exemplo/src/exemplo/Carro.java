package exemplo;

public class Carro extends Veiculo {
	
	
	public void ligar() {
		confereCambio();
		confereCombustivel();
		System.out.println("Carro ligado");
	}
	private void confereCombustivel() {
		System.out.println("conferindo combustível - ok");
	}
	private void confereCambio() {
		System.out.println("conferindo cambio - ok");
	}
}
