package it.begear.campionatoF1.utils;

import java.util.Scanner;

public class ScannerClass {

	public static int inserisciIntero() {
		int intero=0;
		Scanner scanner= new Scanner(System.in);
		//System.out.println("Inscrisci intero");
		if(scanner.hasNextInt()) { //controlla se l'elemento inserito è un intero
			intero=scanner.nextInt(); //assegna con nextInt il valore intero
			return intero;
		}
		String flush=scanner.nextLine();
		return inserisciIntero(); // un metodo che richiama se stesso è detto ricorsivo
	}
	
	
	public static String inserisciStringa() {
		Scanner scanner= new Scanner(System.in);
		String string;
		
		//System.out.println("Inserisci stringa");
		if(scanner.hasNextLine()) {
			string = scanner.nextLine();
			return string;
		}
		
		String flush=scanner.nextLine();
		return inserisciStringa();
	}
	
	
		public static boolean inserisciBool() {
			//System.out.println("Inserisci T o F");
			String str= inserisciStringa();
			if(str.equalsIgnoreCase("V")) {
				return true;
			}else if(str.equalsIgnoreCase("F")) {
				return false;
			}
			else {
				System.out.println("Valore errato inserisci nuovamente");
				return inserisciBool();
			}
		}
	
		public static double inserisciDouble() {
			double db=0;
			Scanner scanner= new Scanner(System.in);
			//System.out.println("Inscrisci intero");
			if(scanner.hasNextDouble()) { //controlla se l'elemento inserito è un intero
				db=scanner.nextDouble(); //assegna con nextInt il valore intero
				return db;
			}
			String flush=scanner.nextLine();
			return inserisciDouble(); // un metodo che richiama se stesso è detto ricorsivo
		}
		
		
		
		
}
