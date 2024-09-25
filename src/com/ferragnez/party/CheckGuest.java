package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
	
	public static void main(String[] args) {
		
		String [] invitatiLista = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti",
				"Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
		
		Scanner scan = new Scanner (System.in);
		
		String nome; 
		
		int flag = 0;
		
		System.out.println("Inserisci il tuo nome e cognome");
		
		nome = scan.nextLine();
		
		for(int i = 0; i < invitatiLista.length; i ++) { 
			
			if(nome.equalsIgnoreCase(invitatiLista[i])){
				
				flag = 1;
				
			} 
		}
			
			scan.close();
			
			if (flag == 1) {
				
				System.out.println(nome + "Benvenuto al Party!");
				
			}else {
				System.out.println("Mi dispiace" + nome + "non puoi entrare!");
			}
		}
	}

			
	
		
