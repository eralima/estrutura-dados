package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Vetor;

public class Aula5 {
public static void main(String[] args) throws Exception {
		
		Vetor vetor = new Vetor(10);

		vetor.adiciona("elemento 1"); //0
		vetor.adiciona("elemento 2"); //1
		vetor.adiciona("elemento 3"); //2

		System.out.println(vetor.busca(2));
		//System.out.println(vetor.busca(15));
		//System.out.println(vetor.busca(4));
	}


}
