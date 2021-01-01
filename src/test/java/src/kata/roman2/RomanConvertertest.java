package src.kata.roman2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RomanConvertertest {
	
	RomanConverter romanConverter;
	String expected;
	int numberToConvert;
	String numberConverted;
	
	String turnToRoman (int number) {
		try {
			ReadAlgebricNumberTestImpl reader = new ReadAlgebricNumberTestImpl();
			reader.setNumber(number);
			PrinterRomanNumberTestImpl printer = new PrinterRomanNumberTestImpl();
			romanConverter.convert(reader,printer);
			return printer.print();
		} catch (Exception e) {
			return "EXCEPTION THROWN";
		}
	}
	
	@BeforeEach
	void setUp() throws Exception {

		romanConverter = new RomanConverter();
	}

	@Test
	void convertUnTest() {
		//Given
		expected = "I";
		numberToConvert = 1;
		
		//When
		numberConverted = turnToRoman(numberToConvert);
		
		//Then
		assertEquals(expected,numberConverted);
	}
	
	@Test
	void convertDeuxTest() {
		//Given
		expected = "II";
		numberToConvert = 2;
		
		//When
		numberConverted = turnToRoman(numberToConvert);
		
		//Then
		assertEquals(expected,numberConverted);
	}
	
	@Test
	void convertTroisTest() {
		//Given
		expected = "III";
		numberToConvert = 3;
		
		//When
		numberConverted = turnToRoman(numberToConvert);
		
		//Then
		assertEquals(expected,numberConverted);
	}
	
	@Test
	void convertQuatreTest() {
		//Given
		expected = "IV";
		numberToConvert = 4;
		
		//When
		numberConverted = turnToRoman(numberToConvert);
		
		//Then
		assertEquals(expected,numberConverted);
	}
	
	@Test
	void convertCinqTest() {
		//Given
		expected = "V";
		numberToConvert = 5;
		
		//When
		numberConverted = turnToRoman(numberToConvert);
		
		//Then
		assertEquals(expected,numberConverted);
	}
	
	@Test
	void convert9Test() {
		//Given
		expected = "IX";
		numberToConvert = 9;
		
		//When
		numberConverted = turnToRoman(numberToConvert);
		
		//Then
		assertEquals(expected,numberConverted);
	}
	
	@Test
	void convertSeptTest() {
		//Given
		expected = "VII";
		numberToConvert = 7;
		
		//When
		numberConverted = turnToRoman(numberToConvert);
		
		//Then
		assertEquals(expected,numberConverted);
	}
	
	@Test
	void convert10Test() {
		//Given
		expected = "X";
		numberToConvert = 10;
		
		//When
		numberConverted = turnToRoman(numberToConvert);
		
		//Then
		assertEquals(expected,numberConverted);
	}
	
	@Test
	void convert17Test() {
		//Given
		expected = "XVII";
		numberToConvert = 17;
		
		//When
		numberConverted = turnToRoman(numberToConvert);
		
		//Then
		assertEquals(expected,numberConverted);
	}
	
	@Test
	void convert30Test() {
		//Given
		expected = "XXX";
		numberToConvert = 30;
		
		//When
		String numberConverted = turnToRoman(numberToConvert);
		
		//Then
		assertEquals(expected,numberConverted);
	}
	
	@Test
	void convert39Test() {
		//Given
		expected = "XXXIX";
		numberToConvert = 39;
		
		//When
		String numberConverted = turnToRoman(numberToConvert);
		
		//Then
		assertEquals(expected,numberConverted);
	}
	
	@Test
	void convert64Test() {
		//Given
		expected = "LXIV";
		numberToConvert = 64;
		
		//When
		String numberConverted = turnToRoman(numberToConvert);
		
		//Then
		assertEquals(expected,numberConverted);
	}
	
	@Test
	void convert50Test() {
		//Given
		expected = "L";
		numberToConvert = 50;
		
		//When
		numberConverted = turnToRoman(numberToConvert);
		
		//Then
		assertEquals(expected,numberConverted);
	}
	
	@Test
	void convert70Test() {
		//Given
		expected = "LXX";
		numberToConvert = 70;
		
		//When
		numberConverted = turnToRoman(numberToConvert);
		
		//Then
		assertEquals(expected,numberConverted);
	}
	
	@Test
	void convert100Test() {
		//Given
		expected = "C";
		numberToConvert = 100;
		
		//When
		numberConverted = turnToRoman(numberToConvert);
		
		//Then
		assertEquals(expected,numberConverted);
	}
	
	@Test
	void convert177Test() {
		//Given
		expected = "CLXXVII";
		numberToConvert = 177;
		
		//When
		numberConverted = turnToRoman(numberToConvert);
		
		//Then
		assertEquals(expected,numberConverted);
	}
	
	@Test
	void convert501Test() {
		//Given
		expected = "DI";
		numberToConvert = 501;
		
		//When
		numberConverted = turnToRoman(numberToConvert);
		
		//Then
		assertEquals(expected,numberConverted);
	}
	
	@Test
	void convert12345Test() {
		//Given
		expected = "EXCEPTION THROWN";
		numberToConvert = 12345;
		
		//When
		numberConverted = turnToRoman(numberToConvert);
		
		//Then
		assertEquals(expected,numberConverted);
	}
	

}
