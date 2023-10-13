package main.java.list.ordenacao;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class OrdenacaoPessoa {
	private List<Pessoa> pessoaList;
	
	public OrdenacaoPessoa() {
		this.pessoaList = new ArrayList<Pessoa>();
	}
	
	public void adicionarPessoa(String nome, int idade, double altura) {
		pessoaList.add(new Pessoa(nome, idade, altura));
	}
	
	public List<Pessoa> ordenarPorIdade() {
		List<Pessoa> pessoasPoridade = new ArrayList<Pessoa>(pessoaList);
		Collections.sort(pessoasPoridade);
		return pessoasPoridade;
	}
	
	public List<Pessoa> ordenarPorAltura() {
		List<Pessoa> pessoaPorAltura = new ArrayList<Pessoa>(pessoaList);
		Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
		return pessoaPorAltura;
	}
	
	public static void main(String[] args) {
		OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
		ordenacaoPessoa.adicionarPessoa("Nome 1", 20, 1.56);
		ordenacaoPessoa.adicionarPessoa("Nome 2", 40, 1.90);
		ordenacaoPessoa.adicionarPessoa("Nome 3", 11, 1.80);
		ordenacaoPessoa.adicionarPessoa("Nome 4",33, 1.70);
		System.out.println(ordenacaoPessoa.ordenarPorIdade());
		//System.out.println(ordenacaoPessoa.ordenarPorAltura());
	}
}
