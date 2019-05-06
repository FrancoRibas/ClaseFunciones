package test;

import funciones.Funciones;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("FACTORIAL DE 2");
		System.out.println(Funciones.factorial(2));
		System.out.println("FACTORIAL DE 1");
		System.out.println(Funciones.factorial(1));
		System.out.println("FACTORIAL DE 0");
		System.out.println(Funciones.factorial(0));
		System.out.println("FACTORIAL DE 6");
		System.out.println(Funciones.factorial(6));
		System.out.println("FACTORIAL DE 10");
		System.out.println(Funciones.factorial(10));

		// vamos a hacer una seri. cos (x)

		double cos_valor = 0;
		double valor = 12;
		int techo = 143;
		for (int n = 0; n < techo; n++) {
			cos_valor = cos_valor + ((Math.pow(valor, 2 * n)) * (Math.pow(-1, n)) / (Funciones.factorial(2 * n)));
		}
		System.out.println("FACTORIAL DE " + 2*techo);
		System.out.println(Funciones.factorial(2*techo));

		System.out.println("SERIE COSENO DE X CON X = " + valor + " EVALUADA HASTA " + techo);
		System.out.println(cos_valor);

		System.out.println("SERIE COSENO DE RAIX DE X CON X = " + valor + " EVALUADA HASTA " + techo);
		cos_valor = 1;
		valor = Math.pow(12, 0.5);
		System.out.println("RAIZ DE 12 = " + valor);
		techo = 143;
		for (int n = 1; n < techo; n++) {
			cos_valor = cos_valor + ((Math.pow(valor, (2 * n))) * (Math.pow(-1, n)) / (Funciones.factorial(2 * n)));
		}

		System.out.println(cos_valor);
		
		double e_valor = 0;
		valor = 2;
		System.out.println("SERIE E ELEVADO A POTENCIA "+valor+" EVALUADA HASTA " + techo);
		
		for (int n = 0; n < techo; n++) {
			e_valor = e_valor + ((Math.pow(valor, n))/ (Funciones.factorial(n)));
		}

		System.out.println(e_valor);
		
		
		e_valor = 0;
		valor = Math.pow(2, 2);
		System.out.println("SERIE E ELEVADO A POTENCIA -"+valor+" ELEVADO AL CUADRADO EVALUADA HASTA " + techo);
		
		for (int n = 0; n < techo; n++) {
			e_valor = e_valor + ((Math.pow(valor, n))*(Math.pow(-1, n))/ (Funciones.factorial(n)));
		}

		System.out.println(e_valor);
		System.out.println(Math.pow(Math.E,-4));
		
	}

}
