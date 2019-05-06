package test;
import java.util.GregorianCalendar;
import java.time.LocalDateTime;
import java.time.LocalTime;
import funciones.Funciones;
import java.time.LocalDate;

public class TestTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate dia = LocalDate.of(2019, 2, 23);
		
		System.out.println(Funciones.traerFechaCorta(dia));

		System.out.println(Funciones.esFechaPasada(dia)?"Es previa a hoy":"Es posterior a hoy");
		
		LocalDate dia2 = LocalDate.of(2019, 7, 28);
		
		System.out.println(Funciones.traerFechaCorta(dia2));
		
		System.out.println(Funciones.esFechaPasada(dia2)?"Es previa a hoy":"Es posterior a hoy");
	}

}
