package main.java.set.operacoesbasicas;

import java.util.Objects;

public class Convidado {
	private String nome;
	private int codigoConvite;

	public Convidado(String nome, int codigoConvite) {
		this.codigoConvite = codigoConvite;
		this.nome = nome;
	}

	
	public int getCodigoConvite() {
		return codigoConvite;
	}
	
	public  boolean equals(Object o) {
		if(this == o) return true;
		if(!(o instanceof Convidado convidado)) return false;
		return (getCodigoConvite() == convidado.getCodigoConvite());
	}
	
	public int hashCode() { 
		return Objects.hash(getCodigoConvite());
	}
	
	public String toString() {
		return "Convidado = '" + nome + '\'' +
				"Codigo= '" + codigoConvite + '\'';
	}
}
