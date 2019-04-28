package school.cesar.q2;

import java.util.Scanner;

public class EquacaoSegundoGrau {

	private double a;
	private double b;
	private double c;
	
	public EquacaoSegundoGrau(double a, double b, double c) {
		this.setA(a);
		this.setB(b);
		this.setC(c);
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}
  
	public String getRaizes() {
		double delta = Math.pow(getB(), 2) - (4*this.getA()*this.getC());
		if (delta < 0) {
			return "nao possui raizes reais";
		}
		double x1 = (-this.getB()) + Math.sqrt(delta) / 2*this.getA();
		double x2 = (-this.getB()) - Math.sqrt(delta) / 2*this.getA();
		return "x1 = " + x1 + " ; x2 = " + x2;
	}
	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("a: ");
		double a = input.nextDouble();
		System.out.print("b: ");
		double b = input.nextDouble();
		System.out.print("c: ");
		double c = input.nextDouble();
		
		EquacaoSegundoGrau equacao = new EquacaoSegundoGrau(a, b, c);
		
		System.out.println(equacao.getRaizes());
		
		input.close();
	}
}
