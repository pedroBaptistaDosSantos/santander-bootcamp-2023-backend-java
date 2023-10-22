package main.java.set.operacoesbasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
	private Set<Convidado> convidadoSet;

	public ConjuntoConvidados() {
		this.convidadoSet = new HashSet<Convidado>();
	}

	public void adicionarConvidado(String nome, int codigoConvite) {
		convidadoSet.add(new Convidado(nome, codigoConvite));
	}

	public void removerConvidadoPorCodigoConvite(int codigoConvite) {

		for (Convidado convidado : convidadoSet) {
			if (convidado.getCodigoConvite() == codigoConvite) {
				convidadoSet.remove(convidado);
				break;
			}

		}
	}
	
	public int  contarConvidados() {
		return convidadoSet.size();
	}
	
	public void exibirConvidados() {
		System.out.println(convidadoSet);
	}
	
	public static void main(String[] args) {
		ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
		
		conjuntoConvidados.adicionarConvidado("Vitor", 216);
		conjuntoConvidados.adicionarConvidado("Marcos", 136);
		conjuntoConvidados.adicionarConvidado("Bruno", 216);
		conjuntoConvidados.adicionarConvidado("Tatiana", 231);
		
		conjuntoConvidados.removerConvidadoPorCodigoConvite(136);
		conjuntoConvidados.exibirConvidados();
	}
}
