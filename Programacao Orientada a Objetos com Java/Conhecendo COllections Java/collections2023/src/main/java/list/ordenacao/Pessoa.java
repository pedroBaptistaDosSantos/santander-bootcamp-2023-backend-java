package main.java.list.ordenacao;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa>{
	private String nome;
	private int idade;
	private double altura;
	
	public Pessoa(String nome, int idade, double altura) {
		this.nome = nome;
		this.altura = altura;
		this.idade = idade;
	}
	
	@Override
	public int compareTo(Pessoa p) {
		// TODO Auto-generated method stub
		return Integer.compare(idade, p.getIdade());
	}
	
	public int getIdade() {
		return idade;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public String getNome() {
		return nome;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome: " + nome +
				"idade" + idade + 
				"altura"  + altura;
	}
}

class ComparatorPorAltura implements Comparator<Pessoa> {
	public int compare(Pessoa p1, Pessoa p2) {
		return Double.compare(p1.getAltura(), p2.getAltura());
	}
}
