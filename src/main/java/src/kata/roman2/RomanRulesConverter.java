package src.kata.roman2;

public class RomanRulesConverter implements RomanTypeConverter {

	int MIDDLE_VALUE;
	int UNIT;
	String MIDDLE_VALUE_ROMAN;
	String UNIT_ROMAN;


	public String turnToRoman(int numberToConvert) throws Exception {
		if (numberToConvert % MIDDLE_VALUE == numberToConvert)
			return convertBelowMiddleValue(numberToConvert);
		else
			return convertOverMiddleValue(numberToConvert);
	}

	protected String convertBelowMiddleValue(int numberToConvert) throws Exception {
		StringBuffer romanNumberToBuild = new StringBuffer();
		int reste = numberToConvert % UNIT;
		int unitValue = numberToConvert - reste;
		for (int i=0;i<(unitValue/UNIT);i++) {
			romanNumberToBuild.append(UNIT_ROMAN);
		}
		RomanTypeConverter romanResteConverter = RomanConverterFactory.build(reste);
		romanNumberToBuild.append(romanResteConverter.turnToRoman(reste));
		return romanNumberToBuild.toString();
	}
	
	protected String convertOverMiddleValue(int numberToConvert) throws Exception {
		StringBuffer romanNumberToBuild = new StringBuffer();
		int distanceToMiddle = numberToConvert % MIDDLE_VALUE;
		romanNumberToBuild.append(MIDDLE_VALUE_ROMAN);
		romanNumberToBuild.append(convertBelowMiddleValue(distanceToMiddle));
		return romanNumberToBuild.toString();
	}
}