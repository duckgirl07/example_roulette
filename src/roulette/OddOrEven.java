package roulette;

import util.ConsoleReader;

public class OddOrEven extends Bet {
	public OddOrEven(int odds) {
		super(odds);
		this.myDescription = "Odd Or Even";
	}

	@Override
	public boolean betIsMade(Wheel myWheel, String betChoice) {
		return (myWheel.getNumber() % 2 == 0 && betChoice.equals("even"))
				|| (myWheel.getNumber() % 2 == 1 && betChoice.equals("odd"));
	}

	@Override
	public String placeBet() {
		String result = ConsoleReader.promptOneOf("Please bet", "even", "odd");
		System.out.println();
		return result;
	}
}
