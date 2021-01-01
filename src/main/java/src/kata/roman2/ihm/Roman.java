package src.kata.roman2.ihm;

import src.kata.roman2.RomanConverter;

public class Roman {

	public static void main(String[] args) throws Exception {
		int exit_value = 0;
		int value_entered = 9999;
		while(value_entered > exit_value) {
			Reader reader = new Reader();
			Printer printer = new Printer();
			RomanConverter romanConverter = new RomanConverter();
			reader.askNumberViaConsole();
			value_entered = reader.getNumber();
			romanConverter.convert(reader, printer);
			printer.print();
			System.out.println();
		}
		System.out.println("#### END - FINISHED ####");
	}

}
