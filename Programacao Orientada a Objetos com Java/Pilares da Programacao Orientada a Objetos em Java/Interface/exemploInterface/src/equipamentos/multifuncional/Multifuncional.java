package equipamentos.multifuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class Multifuncional implements Copiadora, Digitalizadora, Impressora {
	public void copiar() {
		System.out.println("Multifuncional Copiando");
	}

	public void digitalizar() {
		System.out.println("Multifuncional Digitalizando");
	}

	public void imprimir() {
		System.out.println("Multifuncional Imprimindo");
	}
	
}
