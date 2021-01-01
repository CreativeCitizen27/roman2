package src.kata.roman2;

public class RomanConverterFactory {

	public static RomanTypeConverter build(int numberToConvert) throws Exception {
		if (numberToConvert > 999)
			throw new Exception ("Cas non traité "+numberToConvert);
		if(isOver100(numberToConvert))
			return new RomanHundredsConverter();
		if(isOver10(numberToConvert))
			return new RomanTensConverter();
		if(isFigure(numberToConvert))
			return new RomanFigureConverter();
		throw new Exception ("Cas non traité "+numberToConvert);
	}
	
	private static boolean isFigure(int numberToConvert) {
		return numberToConvert % 10 == numberToConvert;
	}

	private static boolean isOver10(int numberToConvert) {
		return numberToConvert % 10 < 10 && numberToConvert % 10 != numberToConvert;
	}

	private static boolean isOver100(int numberToConvert) {
		return numberToConvert % 100 < 100 && numberToConvert % 100 != numberToConvert;
	}

}
