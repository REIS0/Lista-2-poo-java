package school.cesar.q3;

import java.util.ArrayList;
import java.util.Scanner;

public class SomaDupla {

	public static String soma(ArrayList<Integer> valores, int alvo) {
		Integer numero1 = null;
		Integer numero2 = null;
		outerloop:
		for (Integer integer : valores) {
			for (Integer integer2 : valores) {
				if (integer + integer2 == alvo) {
					numero1 = integer;
					numero2 = integer2;
					break outerloop;
				}
			}
		}
		if (numero1 == null) {
			return "indices indeterminado";
		}
		else {
			return "primeiro numero: " + numero1 + " segundo numero: " + numero2;  // checar melhor numero do indice
		}
	}
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		ArrayList<Integer> valores = new ArrayList<>();
		
		while(true) {
			System.out.print("novo valor (digitar 'parar' quando quiser terminar): ");
			String entrada = input.next();
			if (entrada.equals("parar")) {
				break;
			}
			else {
				valores.add(Integer.parseInt(entrada));
			}
		}
		
		System.out.printf("alvo: ");
		int alvo = input.nextInt();
		
		System.out.println(SomaDupla.soma(valores, alvo));
		
		input.close();
	}
	
}
