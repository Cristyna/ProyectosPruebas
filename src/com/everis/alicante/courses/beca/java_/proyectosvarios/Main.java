package com.everis.alicante.courses.beca.java_.proyectosvarios;

public class Main {

	public static void main(String[] args) {
		//Tipos de datos primitivos
		
		boolean result =true;
		char letraC = 'C';
		byte b = 100;
		short s =1000;
		double f = 10.65;
		float f1 = (float) 10.6;
		
		System.out.println(f);
		String str= new String ("test");
		String str2= "hola";
		String str3= str+str2;
		str3=str.concat(str2).concat(str);
		System.out.println(str3);
		
		int[] arrayEnteros = new int [10];//Creamos el array
		
		arrayEnteros[0]=0;
		arrayEnteros[1]=1;
		arrayEnteros[2]=2;
		arrayEnteros[3]=3;
		arrayEnteros[4]=4;
		arrayEnteros[5]=5;
		arrayEnteros[6]=6;
		arrayEnteros[7]=7;
		arrayEnteros[8]=8;
		arrayEnteros[9]=9;
		//arrayEnteros[10]=10;//esta posicion no existe te has pasado las dimensiones
		
		Cliente[] clientes = new Cliente[3];
		clientes [0] = cliente1;
		clientes [1] = cliente2;
		clientes [2] = cliente3;
		
	}

}
