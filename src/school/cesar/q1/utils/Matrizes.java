package school.cesar.q1.utils;

import school.cesar.q1.domain.Matriz;

public class Matrizes {

	public static Matriz multiplicar(Matriz matriz1, Matriz matriz2) {
		if (matriz1.getColunas() == matriz2.getLinhas()) {
			Matriz resultado = new Matriz(matriz1.getLinhas(), matriz2.getColunas());
			for (int i = 0; i < resultado.getLinhas(); i++) {
				for (int j = 0; j < resultado.getColunas(); j++) {
					if (i < matriz2.getColunas()) {
						resultado.enterValue(i, j, (matriz1.getValue(i, j) * matriz2.getValue(j, i)));
					}
					else {
						continue;
					}
				}
			}
			return resultado;
		}
		else {
			return null;
		}
	}
	
	public static void main(String[] args) {
		
		Matriz matriz1 = new Matriz(5,4);
		Matriz matriz2 = new Matriz(4,3);
		
		Matriz resultado = Matrizes.multiplicar(matriz1, matriz2);
		
		if (resultado == null) {
			System.out.println("null");
		}
		else {
			for (int i = 0; i < resultado.getLinhas(); i++) {
				for (int j = 0; j < resultado.getColunas(); j++) {
					System.out.printf("resultado[%d][%d] = %d %n", i, j, resultado.getValue(i, j));
				}
			}
		}
	}
	
}
