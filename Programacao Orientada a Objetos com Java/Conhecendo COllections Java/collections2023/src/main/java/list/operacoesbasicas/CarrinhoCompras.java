package main.java.list.operacoesbasicas;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
	private List<Item> listaCompras;
	
	public CarrinhoCompras() {
		this.listaCompras = new ArrayList<>();
	}
	
	public void adicionarItem(String nome, Double preco, int quantidade) {
		listaCompras.add(new Item(nome, preco, quantidade));
	}
	
	public void removerItem(String nome) {
		List<Item> listaComprasRemovidas = new ArrayList<>();
		for (Item item: listaCompras) {
			if (item.getNome().equalsIgnoreCase(nome)){
				listaComprasRemovidas.add(item);
			}
		}
		listaCompras.removeAll(listaComprasRemovidas);
		
	}
	public double calcularValorTotal() {
		double valorTotal = 0; 
		for (Item item: listaCompras) {
			valorTotal += item.getPreco();
		}
		
		return valorTotal;
	}
	
	public void exibirItens() {
		System.out.println(listaCompras);
	}
	
	public static void main(String[] args) {
		CarrinhoCompras carrinhoCompras = new CarrinhoCompras();
		carrinhoCompras.adicionarItem("macarrao", 2.5, 3);
		carrinhoCompras.adicionarItem("macarrao", 2.5, 3);
		carrinhoCompras.adicionarItem("queijo", 7.3, 3);
		
		carrinhoCompras.exibirItens();
		carrinhoCompras.removerItem("macarrao");
		System.out.println(carrinhoCompras.calcularValorTotal());
		
		
		
	}
}
