package br.com.zup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class personagem {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		List<String> personagens = new ArrayList<String>();

		String perso = "";

		while (!perso.equalsIgnoreCase("Homem de Ferro")) {
			System.out.println(perso);
			System.out.println("Digite o nome de um personagem? ");
			perso = s.nextLine();
			personagens.add(perso);
			
			System.out.println(personagens);
		
		}
		s.close();
	}
}