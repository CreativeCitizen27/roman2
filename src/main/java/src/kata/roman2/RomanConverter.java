package src.kata.roman2;

public class RomanConverter {

	public String turnToRoman(int numberToConvert) throws Exception {
		
		try {
			return doTurnToRoman(numberToConvert);
		} catch (Exception e) {
			throw new Exception ("Problème rencontré au moment de la conversion en chiffre romain",e);
		}
		
	}

	private String doTurnToRoman(int numberToConvert) throws Exception {
		RomanTypeConverter romanTypeConverter = RomanConverterFactory.build(numberToConvert);
		return romanTypeConverter.turnToRoman(numberToConvert);
		
	}
	
	public void convert(ReadAlgebricNumber reader, PrinterRomanNumber printer) throws Exception {
		printer.setRomanNumber(turnToRoman(reader.getNumber()));
	}
	

}
