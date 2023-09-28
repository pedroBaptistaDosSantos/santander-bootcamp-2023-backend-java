package sistemaMensagens;

public class Computador {
	public static void main(String[] args) {
		Telegram tlg = new Telegram();
		tlg.enviarMensagem();
		tlg.receberMensagem();
	}
}
