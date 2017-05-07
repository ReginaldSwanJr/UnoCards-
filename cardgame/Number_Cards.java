package cardgame;

public class Number_Cards extends Cards implements Playable{
	 int number;
	/**
	*
	*@param number number of card
	*@param color color of card
	*(1 = red 2 = green 3 = yellow 4 = blue 5 = black)
	*
	*/
	Number_Cards(int number, int color){
	super(color);
	this.number = number;
	}
	
	/*
	 * @return card number(non-Javadoc)
	 * @see cardgame.Playable#getInfo()
	 */
	public int getInfo(){
		return this.number;
	}
	
	/*
	 * @return true if number card if false action card. since this is a number card automatically returns true(non-Javadoc)
	 * @see cardgame.Playable#numberCard()
	 */
	public boolean numberCard(){
		return true;
	}
	
	public String toString(){
		String output, cc, num;
		switch(this.number)
		{
		case 0: num = "zero";
				break;
		case 1: num = "one";
				break;
		case 2: num = "two";
				break;
		case 3: num = "three";
				break;
		case 4: num = "four";
				break;
		case 5: num = "five";
				break;
		case 6: num = "six";
				break;
		case 7: num = "seven";
				break;
		case 8: num = "eight";
				break;
		case 9: num = "nine";
				break;
		default: num = "not an number card";
				 break;
		}
		switch(color)
		{
		case 1: cc = "red";
				break;
		case 2: cc = "green";
				break;
		case 3: cc = "yellow";
				break;
		case 4: cc = "blue";
				break;
		case 5: cc = "black(wild)";
				break;
		default: cc = "aint no color bih";
				 break;
		}
		
		output = "card color is " + cc + " card number is " + num + ".";
		return output;
	}

	
}
