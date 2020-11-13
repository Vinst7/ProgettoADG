package it.begear.campionatoF1.utils;

import java.util.Scanner;

public class ScannerClass {
	
	//metodo scanner numero intero
	public static int inserisciIntero() {
		int n = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Inserisci intero");
		if(s.hasNextInt()) {
			n = s.nextInt();
			return n;
		}
		String flush = s.nextLine();
		return inserisciIntero();
	}
	
	
	//metodo scanner numero a virgola mobile
	public static double inserisciNumeroAVirgolaMobile() {
		double n = 0.0D;
		Scanner s = new Scanner(System.in);
		System.out.println("Inserisci numero a virgola mobile");
		if(s.hasNextDouble()) {
			n = s.nextDouble();
			return n;
		}
		String flush = s.nextLine();
		return inserisciNumeroAVirgolaMobile();
	}
	
	
	//metodo scanner stringa
	public static String inserisciStringa() {
		String string = "";
		Scanner s = new Scanner(System.in);
		System.out.println("Inserisci stringa");
		if(s.hasNextLine()) {
			string = s.nextLine();
			return string;
		}
		String flush = s.nextLine();
		return inserisciStringa();
	}
	
	//metodo scanner booleano
	public static boolean inserisciBool() {
		System.out.println("Inserisci T o F");
		String str = inserisciStringa();
		if(str.equalsIgnoreCase("T")) {
			return true;
		}else if(str.equalsIgnoreCase("F")) {
			return false;
		}else {
			System.out.println("Input errato! Inserisci nuovamente");
			return inserisciBool();
		}	
	}
	
	

}
