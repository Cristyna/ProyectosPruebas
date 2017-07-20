package com.everis.alicante.courses.beca.java_.proyectosvarios;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Text {
	public static void main(String[] args) {
		// Ejercicio 1:

		String cadena = "Esto es una prueba";

		String cadena1 = cadena.toUpperCase();

		if (cadena1.startsWith("ESTO")) {

			System.out.println("La cadena empieza por 'ESTO': " + cadena1);
		}
		// Ejercicio 2:

		String cadena2 = "La clase String, tiene varios métodos, muy útiles, como saber su longitud, trocear la cadena, etc";

		String[] cadena2cortada = cadena2.split(",");

		for (int i = 0; i < cadena2cortada.length; i++) {

			System.out.println(cadena2cortada[i]);
		}

		// Ejercicio 3: Determinar si las siguientes cadenas contiene caracteres
		// numericos mayor del numero 20. Imprimir SI o NO dependiendo del caso

		String cad1 = "Mi hija menor tiene 10 años y su padre tiene 45.";
		String cad2 = "En este texto no voy a poner ningún digito";
		String cad3 = "En este texto no voy a usar el numero 10 que no es mayor del 15 y ninguno de ellos mayor del numero esperado";

		String[] cad1cosrtada = cad1.split(" ");
		for (int i = 0; i < cad1cosrtada.length; i++) {

			try {
				Double num1 = Double.parseDouble(cad1cosrtada[i]);

				if (num1 > 20) {
					System.out.println("El número: " + num1 + " es mayor que 20");
				} else {
					System.out.println("El número: " + num1 + " es menor que 20");
				}

			} catch (Exception e) {
				
			}

		}

//		Pattern pattern = Pattern.compile("/\\{\\w+\\}/");
//		Matcher matcher = pattern.matcher(cad1);
//		if (matcher.find()) {
//			System.out.println(matcher.group(0)); // prints /{item}/
//		} else {
//			System.out.println("Match not found");
//		}

		// Ejercicio 8:

		String cad4 = "Esto es un ejemplo usado para determinar un indice";
		System.out.println(cad4.indexOf("ejemplo"));
		
		//Ejercicio 9:
		Calendar calendar= new GregorianCalendar();
		
		Calendar calendar2= Calendar.getInstance();
		
		
	}

}
