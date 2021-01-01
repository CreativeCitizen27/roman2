package src.kata.roman2;

public class ReadAlgebricNumberTestImpl implements ReadAlgebricNumber {
	
	public int number;

	@Override
	public int getNumber() {
		return number;
	}

	@Override
	public void setNumber(int numberToBeRead) {
		number = numberToBeRead;
		
	}

}
