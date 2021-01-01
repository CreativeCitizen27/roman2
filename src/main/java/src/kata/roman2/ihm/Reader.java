package src.kata.roman2.ihm;

import java.util.Scanner;

import src.kata.roman2.ReadAlgebricNumber;

public class Reader implements ReadAlgebricNumber {
	
	int number;

	public void askNumberViaConsole(){
		 // Créer un objet Scanner pour lire l'entrée
        Scanner console = new Scanner(System.in);
        
        // Obtenez un nombre à convertir
        System.out.print("Entrez un chiffre : ");
       setNumber(console.nextInt());
       
	}
	
	
	@Override
	public int getNumber() {
		return number;
	}

	@Override
	public void setNumber(int numberToBeRead) {
		number = numberToBeRead;
	}
	
	

}
