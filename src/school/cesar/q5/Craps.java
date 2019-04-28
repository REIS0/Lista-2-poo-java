package school.cesar.q5;

import java.util.Random;

public class Craps {

	public static void main(String[] args) {
		
		Random dado1 = new Random();
		Random dado2 = new Random();
		
		int pontuacao = 0;
		int counter = 0;
		
		final int primeiro = (dado1.nextInt(6)+1) + (dado2.nextInt(6)+1);
		int lancamento = primeiro;
		// problema nos ifs
		while (counter < 30) { // 30 partidas
			System.out.println(lancamento);
			if (primeiro == 7 || primeiro == 11) {
				System.out.println("jogador venceu");
				break; 
			}
			else if (primeiro == 4 || primeiro == 5 || primeiro == 6 || primeiro == 8 || primeiro == 9 || primeiro == 10) {
				pontuacao = primeiro;
			}
			else if (lancamento == 7) {
				System.out.println("jogador perdeu");
				break; 
			}
			else if (lancamento == pontuacao) {
				System.out.println("jogador venceu");
				break; 
			}
			// craps
			else if (lancamento == 2 || lancamento == 3 || lancamento == 12) {
				System.out.println("jogador perdeu tudo");
				// o jogo deve parar??? 
				break; 
			}
			lancamento = (dado1.nextInt(6)+1) + (dado2.nextInt(6)+1);
			if (counter == 29) {
				System.out.println("jogo deve continuar");
				counter = 0;
			}
			counter++;
		}
	}
	
}
