package aleatorio;

import java.util.Calendar;
import java.util.Date;

public class Idade {
	public static void main(String[] args) {

		System.out.println(calcularIdade("15/03/1996"));
	}

	public static int calcularIdade(String dataNascimento) {
		String[] data = dataNascimento.split("/");
		int dia = 0, mes = 0, ano = 0;
		dia = Integer.parseInt(data[0]);
		mes = Integer.parseInt(data[1]);
		ano = Integer.parseInt(data[2]);
		
		Calendar hoje = Calendar.getInstance();
		int anoAtual = hoje.get(Calendar.YEAR);
		int mesAtual = hoje.get(Calendar.MONTH);
		int diaAtual = hoje.get(Calendar.DAY_OF_MONTH);

		int quantosAnos = anoAtual - ano;

		if (mesAtual < mes || mesAtual == mes && diaAtual < dia) {
			quantosAnos--;
		}
		return quantosAnos < 0 ? 0 : quantosAnos;
	}
}
