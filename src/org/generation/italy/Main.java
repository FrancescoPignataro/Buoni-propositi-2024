package org.generation.italy;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String risposta;
		int i,obiettivo;
		System.out.println("Buongiorno e buon 2024, questi sono i tuoi obiettivi di quest'anno:");

		HashMap<Integer, String> elencoObiettivi = new HashMap<>();

		elencoObiettivi.put(1, "Stare bene");
		elencoObiettivi.put(2, "Trovare lavoro");
		elencoObiettivi.put(3, "Indipendenza economica");
		elencoObiettivi.put(4, "Superare il corso");
		elencoObiettivi.put(5, "Iniziare dieta");

		for (i = 0; i < elencoObiettivi.size(); i++)

			System.out.println(elencoObiettivi.get(i));

		do {
			System.out.println("Quale tra questi hai conseguito con successo? \n");
			obiettivo=Integer.parseInt(sc.nextLine());
			
			if (elencoObiettivi.containsKey(obiettivo)) {
				System.out.println("Bravo, hai conseguito il proposito di: " + elencoObiettivi.get(obiettivo));
				
				}
				
			else 
				System.out.println("Non rientra tra i miei obiettivi");
			
			System.out.println("Hai portato a termine un'altro proposito?");
			risposta=sc.nextLine();
			
			
			
		} while (risposta.equals("s"));
		
		
		System.out.println("Va bene lo stesso");
		
	}
}
