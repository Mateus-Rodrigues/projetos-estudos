
package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

	public static void main(String [] args) {
		imprimindoSelecionados();
	
}	
	
	static void imprimindoSelecionados() {
		String [] candidatos = {"Felipe", "Veronica", "Marcos", "Bruno", "Pablo"};
		
		System.out.println("Imprimindo lista de candidato informando o indice do elemento");
		
		for(int indice=0; indice < candidatos.length;indice++) {
			System.out.println("O candidato de n° " + (indice+1) + " é o " + candidatos[indice]);
		}
		
		System.out.println("Forma abreviada de interação for each");
		
		for(String candidato: candidatos) {
			System.out.println("O candidato selecionado foi " + candidato);
		}
	}
	
	static void selecaoCandidato() {
		String[] candidatos = {"Felipe", "Maicon", "Larissa", "Jessica", "Bruna", "Amanda", "Bruno", "Tiago", "Jeferson", "Mateus"};
		
		int candidatosSelecionados = 0;
		int candidatosAtual = 0;
		double salarioBase = 2000.0;
		while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
			String candidato = candidatos[candidatosAtual];
			double salarioPretendido = valorPretendido();
			
			System.out.println("O candidato " + candidato + " solicitou este valor de salário " + salarioPretendido);
			if(salarioBase >= salarioPretendido) {
				System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
				candidatosSelecionados ++;
			}
			candidatosAtual++;
		}
		
	}
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
		
	
	}
	
		static void analisarCandidato(double salarioPretendido) {
			
			double salarioBase =2000.00;
			
			if(salarioPretendido < salarioBase) {
				System.out.println("Ligar para Candidato");			
			}			
			else if(salarioPretendido == salarioBase) {
				System.out.println("Ligar para candidato com contra proposta");
			}else
				System.out.println("Aguardar novas propostas");
		}
}

