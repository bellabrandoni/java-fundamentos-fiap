package com.java.operadores;

public class OperadoreLogicos {

	public static void main(String[] args) {
		// && = comparação and ou "e"
		int idade = 20;
		boolean precisaVotar = idade >= 18 && idade < 70;

		System.out.println(precisaVotar);
		//////////////////////////////////////////
		/*
		 * || ("or") = Operador de comparacao capaz de combinar O único resultado onde o
		 * operador dá falso é quando ambas as comparacoes sao falsas
		 */
		int nrAmarelo = 2, nrVermelho = 1;

		boolean suspenso = nrAmarelo == 2 || nrVermelho == 1;

		System.out.println(suspenso);
		/////////////////////////////////////
		/*Operador ^("XOR") = Só resulta em valor verdadeiro se ambas
		as expressoes forem valores opostos*/
		
		int x = 11, y = 9;
		
		boolean teste = x > 10 ^ y > 10;
		
		System.out.println(teste);
		
		//////////////////////////////////////
		
		/* !("NOT") = Operador que reverte o valor da expressão booleana 
		  -> Utilizado para NEGAR uma comparação*/
		
		int id = 20;
		
		boolean menoridade = ! (id >= 18);
		
		System.out.println(menoridade);
	}

}
