package src.kata.roman2.ihm;

import src.kata.roman2.PrinterRomanNumber;

public class Printer implements PrinterRomanNumber {
	
	String romanNumber;

	@Override
	public String print() {
		System.out.println("La valeur en chiffre romain est : ["+romanNumber+"]");
		return romanNumber;
	}

	@Override
	public Void setRomanNumber(String romanNumberToBePrint) {
		romanNumber = romanNumberToBePrint;
		return null;
	}
	

}
