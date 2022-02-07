package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Vetor;

public class Aula2 {

	public static void main(String[] args) {
		Vetor vetor = new Vetor(10);
		
		try {
			vetor.adiciona("elemento 1");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			vetor.adiciona("elemento 2");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			vetor.adiciona("elemento 3");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(vetor.tamanho());
		System.out.println(vetor);
	}

}
