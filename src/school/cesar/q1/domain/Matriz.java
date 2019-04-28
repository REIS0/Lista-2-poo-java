package school.cesar.q1.domain;

import java.util.Random;

public class Matriz {

	private int matriz[][];
	
	public Matriz(int numero) {
		this.matriz = new int[numero][numero];
		Random random = new Random();
		for (int i = 0; i < numero; i++) {
			for (int j = 0; j < numero; j++) {
				matriz[i][j] = random.nextInt(101);
			}
		}
	}
	
	public Matriz(int linhas, int colunas) {
		this.matriz = new int[linhas][colunas];
		Random random = new Random();
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				matriz[i][j] = random.nextInt(101);
			}
		}
	}
	
	public int getLinhas() {
		return this.matriz.length;
	}
	
	public int getColunas() {
		return this.matriz[0].length;
	}
	
	public void enterValue(int i, int j, int value) {
		this.matriz[i][j] = value;
	}
	
	public int getValue(int i, int j) {
		return this.matriz[i][j];
	}
}
