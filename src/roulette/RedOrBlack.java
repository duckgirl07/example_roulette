package roulette;

import util.ConsoleReader;

public class RedOrBlack extends Bet {

	public RedOrBlack(int odds) {
		super(odds);
		this.myDescription = "Red or Black";
	}

	@Override
	public boolean betIsMade(Wheel myWheel, String betChoice) {
		return myWheel.getColor().equals(betChoice);

	}

	@Override
	public String placeBet() {
		String result = ConsoleReader.promptOneOf("Please bet", Wheel.BLACK, Wheel.RED);
		System.out.println();
		return result;
	}

}
