package funciones;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.time.LocalTime;
import java.time.LocalDate;

public class Funciones {

	public static int traerAnio(LocalDate fecha) {
		return fecha.getYear();
	}

	public static int traerMes(LocalDate fecha) {
		return fecha.getMonthValue(); // se requiere sumar 1 devido a que GregorianCalendar toma los mese de 0 a 11
	}

	public static int traerDia(LocalDate fecha) {
		return fecha.getDayOfMonth();
	}

	public static int traerHora(LocalTime hora) {
		return hora.getHour();
	}

	public static int traerMinutos(LocalTime hora) {
		return hora.getMinute();
	}

	public static boolean esBisiesto(int anio) {
		return ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)));
	}

	public static boolean esBisiesto(LocalDate fecha) {
		int anio = Funciones.traerAnio(fecha);
		return ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)));
	}

	public static GregorianCalendar traerFecha(int anio, int mes, int dia) {

		return new GregorianCalendar(anio, mes - 1, dia); // Se resta uno por la manera en que GragorianCalendar lo
															// guerda
	}

	public static GregorianCalendar traerFecha(int anio, int mes, int dia, int hora, int minutos) {

		return new GregorianCalendar(anio, mes - 1, dia, hora, minutos); // Se resta uno por la manera en que
																			// GragorianCalendar lo guerda
	}

	public static boolean esFechaValida(int anio, int mes, int dia) {
		boolean retorno = true;

		switch (mes) {

		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			retorno = (dia <= 31 && dia > 0); // Al ser una operacion logica esta devolvera true or false. Ese valor se
												// asignara a "retorno".
			break;
		case 2: {
			if (Funciones.esBisiesto(anio)) {
				retorno = (dia <= 29 && dia > 0);
			} else {
				retorno = (dia <= 28 && dia > 0);
			}

		}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			retorno = (dia <= 30 && dia > 0);
			break;
		default:
			retorno = false; // Me aseguro que los dias y meses sean validos.
		}

		return retorno;
	}

	public static boolean esFechaValida(LocalDate fecha) {
		boolean retorno = true;

		int dia = Funciones.traerDia(fecha);

		switch (Funciones.traerMes(fecha)) {

		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			retorno = (dia <= 31 && dia > 0); // Al ser una operacion logica esta devolvera true or false. Ese valor se
												// asignara a "retorno".
			break;
		case 2: {
			if (Funciones.esBisiesto(Funciones.traerAnio(fecha))) {
				retorno = (dia <= 29 && dia > 0);
			} else {
				retorno = (dia <= 28 && dia > 0);
			}

		}
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			retorno = (dia <= 30 && dia > 0);
			break;
		default:
			retorno = false; // Me aseguro que los dias y meses sean validos.
		}

		return retorno;
	}

	public static boolean esFechaPasada(int anio, int mes, int dia) {
		boolean retorno = true;

		LocalDate fechaSinVerificar = LocalDate.of(anio, mes, dia);
		LocalDate hoy = LocalDate.now();
		if (fechaSinVerificar.isBefore(hoy) && Funciones.esFechaValida(anio, mes, dia)) {

		} else {
			retorno = false; // Me aseguro que la fecha sea del pasado.
		}

		return retorno;
	}

	public static boolean esFechaPasada(LocalDate fecha) {
		boolean retorno = true;

		LocalDate fechaSinVerificar = LocalDate.of(Funciones.traerAnio(fecha), Funciones.traerMes(fecha),
				Funciones.traerDia(fecha));
		LocalDate hoy = LocalDate.now();
		if (fechaSinVerificar.isBefore(hoy) && Funciones.esFechaValida(fecha)) {

		} else {
			retorno = false; // Me aseguro que la fecha sea del pasado.
		}

		return retorno;
	}

	public static String traerFechaCorta(LocalDate fecha) {
		return ("año = " + Funciones.traerAnio(fecha) + ", mes = " + (Funciones.traerMes(fecha)) + ", dia = "
				+ Funciones.traerDia(fecha));
	}

	public static String traerFechaCortaConMinutos(LocalDate fecha, LocalTime hora) {
		return ("año = " + Funciones.traerAnio(fecha) + ", mes = " + (Funciones.traerMes(fecha)) + ", dia = "
				+ Funciones.traerDia(fecha) + ", hora = " + Funciones.traerHora(hora) + ", minutos = "
				+ Funciones.traerMinutos(hora));
	}

	public static double factorial(int num) {
		double resultado = 1;
		if (num > 1) {
			for (int i = 1; i <= num; i++) {
				resultado = resultado * i;
			}
		}
		return resultado;
	}

	public static boolean esPrimo(int valorEvaluado) {
		boolean primo = false;

		if (valorEvaluado > 4) {
			for (int i = 1; i <= Math.pow(valorEvaluado, 0.5); i++) {
				if (valorEvaluado % i == 0) {
					primo = true;
				}
			}
		} else {
			primo = true;
		}

		return primo;
	}

}
