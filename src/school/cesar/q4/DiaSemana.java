package school.cesar.q4;

public enum DiaSemana {

	SEGUNDA(1),
	TERCA(2),
	QUARTA(3),
	QUINTA(4),
	SEXTA(5),
	SABADO(6),
	DOMINGO(7);
	
	private final int value;
	
	private DiaSemana(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
	
}
