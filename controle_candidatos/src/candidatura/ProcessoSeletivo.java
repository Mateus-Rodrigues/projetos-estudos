package candidatura;
//import java.util.concurrent.ThreadRandom;

public class ProcessoSeletivo {

	public static void main(String [] args) {

	analisarCandidato(1999.99);
	analisarCandidato(2000.00);
	analisarCandidato(2001.00);
	
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

