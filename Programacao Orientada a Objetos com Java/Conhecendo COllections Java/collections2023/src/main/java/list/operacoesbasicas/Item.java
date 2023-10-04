package main.java.list.operacoesbasicas;

public class Item {
	private String nome;
	private Double preco;
	private int quantidade;
	
	public Item(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public double getPreco() {
		return this.preco;
	}
	public String getNome() {
		return this.nome;
	}
	public String toString() {
		return "Item{" +
				"nome'" + nome +  '\'' + 
				'}';
	}
	
	
}
