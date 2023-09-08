package candidatura;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class ProcessoSeletivo {
	
	public static void main(String[] args) {
		//analizarCandidato(1900.0);
		//analizarCandidato(2200.0);
		//analizarCandidato(1200.0);
		//selecaoCandidatos();
		
			//imprimirSelecionados();
			
	}
	
	
	static void entrandoEmContato(String candidato) {
		int tentativasRealizadas= 1;
		boolean continuarTentando = true;
		boolean atendeu=false;
		
		do {
			atendeu = atender();
			continuarTentando = !atendeu;
			if(continuarTentando) tentativasRealizadas++;
			else System.out.println("Contato Realizado");
		}while(continuarTentando && tentativasRealizadas < 3);
		
		if(atendeu) System.out.println(candidato+ "Atendeu na "+ tentativasRealizadas+ " tentativa");
		else System.out.println(candidato+ " não atendeu");
	}
	
	//metodo auxiliar
	static boolean atender() {
		return new Random().nextInt(3)==1;
	}
	
	static void imprimirSelecionados(){
		String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE" };
		
		System.out.println("Imprimindo lista de candidatos:");
		System.out.println("------------------------------");
		
		for(String candidato: candidatos) { 
			System.out.println(candidato);
		}
	}
	
	static void selecaoCandidatos() {
		String[] candidatos= {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE" }; 
		
		int candidatosSelecionados= 0;
		int candidatosAtual = 0;
		double salarioBase = 2000.0;
		while(candidatosSelecionados < 5) {
			String candidato = candidatos[candidatosAtual];
			double salarioPretendido = valorPretendido();
			
			System.out.println("O candidato "+ candidato+ " solicitou o seguinte valor de salário: " + salarioPretendido);
			if(salarioBase > salarioPretendido) {
				System.out.println("O candidato "+ candidato+ " foi selecionado para a vaga" );
				candidatosSelecionados++;
			}
			candidatosAtual++;
		}
		
	}
	
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1900, 2300);
	}
	
	static void analizarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		if(salarioBase > salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO");
		}else if(salarioBase == salarioPretendido) {
			System.out.println("LIGAR PARA CANDIDATO COM CONTRA PROPOSTA");
		}else {
			System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
		}
	}
}
