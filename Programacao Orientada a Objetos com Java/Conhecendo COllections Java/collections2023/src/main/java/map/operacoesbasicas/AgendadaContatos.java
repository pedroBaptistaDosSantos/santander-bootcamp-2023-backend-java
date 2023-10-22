package main.java.map.operacoesbasicas;

import java.util.HashMap;
import java.util.Map;

import main.java.set.pesquisa.AgendaContatos;

public class AgendadaContatos {
	private Map<String, Integer> agendaContatoMap;

	public AgendadaContatos() {
		this.agendaContatoMap = new HashMap<String, Integer>();

	}

	public void adicionarContato(String nome, Integer telefone) {
		agendaContatoMap.put(nome, telefone);
	}

	public void removerContato(String nome) {
		if (!agendaContatoMap.isEmpty()) {
			agendaContatoMap.remove(nome);
		}

	}

	public Integer pesquisaPorNomezin(String nome) {
		Integer numeroPorNome = null;

		if (!agendaContatoMap.isEmpty()) {
			numeroPorNome = agendaContatoMap.get(nome);
		}

		return numeroPorNome;

	}

	public void exibirContato() {
		System.out.println(agendaContatoMap);
	}

	public Integer pesquisaPorNome(String nome) {
		Integer numeroPorNome = null;

		if (!agendaContatoMap.isEmpty()) {
			numeroPorNome = agendaContatoMap.get(nome);
		}

		return numeroPorNome;

	}

	public static void main(String[] args) {
		AgendaContatos agendaContatos = new AgendaContatos();
		agendaContatos.adicionarContato("Camila", 11972331);
		agendaContatos.adicionarContato("Felix", 11972331);
		agendaContatos.adicionarContato("Cesar", 11972331);

		agendaContatos.exibirContato();
		agendaContatos.removerContato("Camila");
		agendaContatos.exibirContato();

	}

}
