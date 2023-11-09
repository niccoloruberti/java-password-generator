package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		//chiedo il nome all'utente
		System.out.println("inserisci il nome:");
		String name = in.nextLine();
		
		//chiedo il cognome all'utente
		System.out.println("inserisci il cognome:");
		String surname = in.nextLine();
		
		//chiedo il colore preferito all'utente
		System.out.println("inserisci il tuo colore preferito:");
		String color = in.nextLine();
		
		//chiedo il giorno di nascita
		System.out.println("Che giorno sei nato? (inserire un numero)");
		String dayStr = in.nextLine();
		//converto la stringa del giorno di nascita in intero
		int dayInt = Integer.valueOf(dayStr);
		
		//chiedo il mese di nascita
		System.out.println("Che mese sei nato? (inserire un numero)");
		String monthStr = in.nextLine();
		//converto la stringa del mese di nascita in intero
		int monthInt = Integer.valueOf(monthStr);
		
		//chiedo l'anno di nascita
		System.out.println("Che anno sei nato? (inserire un numero)");
		String yearStr = in.nextLine();
		//converto la stringa dell'anno di nascita in intero
		int yearInt = Integer.valueOf(yearStr);
		
		in.close();
		
		//genero la password
		String psw = name + "-" + surname + "-" + color + "-" + (dayInt + monthInt + yearInt);
		
		//stampo la psw a schermo
		System.out.println(psw);
	}

}
