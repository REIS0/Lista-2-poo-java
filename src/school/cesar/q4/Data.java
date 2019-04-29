package school.cesar.q4;

public class Data {
	
	private int dia;
	private int mes;
	private int ano;
	private DiaSemana dia_da_semana;

	public Data(int dia, int mes, int ano, DiaSemana dia_da_semana) {
		// faz a checagem do mes
		if (mes > 12 || mes < 1) {
			if (mes >  12) {
				this.setMes(12);
			}
			else if (mes < 1){
				this.setMes(1);
			}
		}
		else {
			this.setMes(mes);
		}
		
		// faz checagem do dia
		if (this.getMes() == 4 || this.getMes() == 6 || this.getMes() == 9 || this.getMes() == 11) {  // caso mes com 30 dias
			if (dia > 30) {
				this.setDia(30);
			}
			else if (dia <= 0) {
				this.setDia(1);
			}
			else {
				this.setDia(dia);
			}
		}
		else if (this.getMes() == 2) { // caso mes de fevereiro
			if (dia > 29) {
				this.setDia(29);
			}
			else if (dia <= 0) {
				this.setDia(1);
			}
			else {
				this.setDia(dia);
			}
		}
		else { // caso mes com 31 dias
			if (dia > 31) {
				this.setDia(31);
			}
			else if (dia <= 0) {
				this.setDia(1);
			}
			else {
				this.setDia(dia);
			}
		}
		this.setAno(ano);
		this.setDia_da_semana(dia_da_semana);
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public DiaSemana getDia_da_semana() {
		return dia_da_semana;
	}

	public void setDia_da_semana(DiaSemana dia_da_semana) {
		this.dia_da_semana = dia_da_semana;
	}
	
	public String compara(Data data) {
		if (this.getAno() == data.getAno()) { // compara se tem o mesmo ano
			if (this.getMes() == data.getMes()) { // compara se tem o mesmo mes
				if (this.getDia() > data.getDia()) { // compara os dias
					return "Maior";
				}
				else {
					return "Menor";
				}
			}
			else if (this.getMes() > data.getMes()) { // compara meses diferentes
				return "Maior";
			}
			else {
				return "Menor";
			}
		}
		else if (this.getAno() > data.getAno()) { // compara anos diferentes
			return "Maior"; 
		}
		else {
			return "Menor";
		}
	}
	
	public String equals(DiaSemana dia) {
		if (this.getDia_da_semana() == dia) {     // se for igual
			return "Igual";
		}
		else if (this.dia_da_semana.ordinal() > dia.ordinal()) { // se for maior que o dia (erros)
			return "Maior";
		}
		else {                                    // se for menor
			return "Menor";
		}
	}
	
	// testes
	public static void main(String[] args) {
		
		Data data1 = new Data(4, 4, 1987, DiaSemana.QUINTA);
		
		System.out.println(data1.getDia());
		
	}
	
}
