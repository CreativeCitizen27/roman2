package src.kata.roman2;

public class RomanHundredsConverter extends RomanRulesConverter {
	
	public RomanHundredsConverter() {
		MIDDLE_VALUE = 500;
		UNIT = 100;
		MIDDLE_VALUE_ROMAN = "D";
		UNIT_ROMAN = "C";
	}
}
