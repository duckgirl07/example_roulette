package roulette;

import util.ConsoleReader;

public class ThreeInARow extends Bet {
	public ThreeInARow(int odds) {
		super(odds);
		this.myDescription = "Three in a Row";
	}

	@Override
	public boolean betIsMade(Wheel myWheel, String betChoice) {
		int start = Integer.parseInt(betChoice);
		return (start <= myWheel.getNumber() && myWheel.getNumber() < start + 3);
	}

	@Override
	public String placeBet() {
		String result = ""
				+ ConsoleReader.promptRange("Enter first of three consecutive numbers", 1, Wheel.NUM_SPOTS - 3);
		System.out.println();
		return result;
	}
}
