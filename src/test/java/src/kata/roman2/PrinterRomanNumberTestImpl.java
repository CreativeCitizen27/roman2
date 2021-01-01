package src.kata.roman2;

public class PrinterRomanNumberTestImpl implements PrinterRomanNumber {
	
	String romanNumber;

	@Override
	public String print() {
		return romanNumber;
	}

	@Override
	public Void setRomanNumber(String romanNumberToBePrint) {
		romanNumber = romanNumberToBePrint;
		return null;
	}

}
