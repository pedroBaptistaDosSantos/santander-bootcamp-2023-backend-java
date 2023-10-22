package main.java.set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
	private Set<Contato> contatoSet;

	public AgendaContatos() {
		this.contatoSet = new HashSet<Contato>();
	}
	
	public void adicionarContato(String nome, int numero) {
		contatoSet.add(new Contato(nome, numero));
	}
	
	public void exibirContato() {
		System.out.println(contatoSet);
	}
	
	public Set<Contato>  pesquisaPorNome(String nome) {
		Set<Contato> contatosPorNome = new HashSet<Contato>();
		for(Contato contato : contatoSet) {
			if (contato.getNome().startsWith(nome)) {
				contatosPorNome.add(contato);
			}
		}
		return contatosPorNome;
	}
	
	public Contato atualizarNumeroContato(String nome, int numero) {
		Contato contatoAtualizado = null;
		for(Contato contato: contatoSet) {
			if(contato.getNome().equalsIgnoreCase(nome)) {
				contato.setNumero(numero);
				contatoAtualizado = contato;
				break;
			}
		}
		return contatoAtualizado;
	}
	
	public static void main(String[] args) {
		AgendaContatos agendaContato = new AgendaContatos();
		
		agendaContato.adicionarContato("Camila", 2938453);
		agendaContato.adicionarContato("Camila", 2938453);
		agendaContato.adicionarContato("Daniel", 2938234);
		agendaContato.adicionarContato("Leandro", 2938213);
		agendaContato.exibirContato();
		agendaContato.atualizarNumeroContato("Camila", 0);
		agendaContato.exibirContato();
		
	}
}


