package exemploInterface;

import equipamentos.copiadora.Xerox;
import equipamentos.multifuncional.Multifuncional;
public class Fabrica {
	public static void main(String[] args) {
		Multifuncional equipamentoMultifuncional = new Multifuncional();
		Xerox xerox = new Xerox();
		
	equipamentoMultifuncional.imprimir();
	xerox.copiar();
	}
}
