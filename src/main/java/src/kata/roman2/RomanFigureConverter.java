package src.kata.roman2;

public class RomanFigureConverter extends RomanRulesConverter {
	
	public RomanFigureConverter() {
		MIDDLE_VALUE = 5;
		UNIT = 1;
		MIDDLE_VALUE_ROMAN = "V";
		UNIT_ROMAN = "I";
	}
	
	protected String convertBelowMiddleValue(int numberToConvert) throws Exception {
		StringBuffer romanNumberToBuild = new StringBuffer();
		if (MIDDLE_VALUE - numberToConvert == 1)
			return romanNumberToBuild.append(turnToRoman(1)+turnToRoman(MIDDLE_VALUE)).toString();
		for (int i=0;i<numberToConvert;i++) {
			romanNumberToBuild.append(UNIT_ROMAN);
		}
		return romanNumberToBuild.toString();
	}

	protected String convertOverMiddleValue(int numberToConvert) throws Exception {
		StringBuffer romanNumberToBuild = new StringBuffer();
		if (10 - numberToConvert == 1) {
			RomanTypeConverter romanTensConverter = RomanConverterFactory.build(10);
			return romanNumberToBuild.append(turnToRoman(1)+romanTensConverter.turnToRoman(10)).toString();
		}
		int distanceTo5 = numberToConvert % MIDDLE_VALUE;
		romanNumberToBuild.append(MIDDLE_VALUE_ROMAN);
		romanNumberToBuild.append(convertBelowMiddleValue(distanceTo5));
		return romanNumberToBuild.toString();
	}

}
