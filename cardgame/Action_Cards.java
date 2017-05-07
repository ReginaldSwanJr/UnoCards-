package cardgame;

public class Action_Cards extends Cards implements Playable
{
	int action_number;
	
	/*
	 *@param action_number returns the number for the action
	 *        skip = 1 reverse = 2 draw two = 3 wild = 4 wild draw 4 = 5
	 *@param color color of card
	 * (     1 = red 2 = green 3 = yellow 4 = blue 5 = black)
	 * 
	 */
	Action_Cards(int action_number, int color){
		super(color);
		setNumber(action_number);
		
	}
	/*
	 * @return card action number(non-Javadoc)
	 * @see cardgame.Playable#getInfo()
	 */
	public int getInfo() {
		return this.action_number;
	}
	
	/*
	 * @return true if number card if not action card 
	 * since this is an action card automaticly returns false(non-Javadoc)
	 * @see cardgame.Playable#numberCard()
	 * 
	 */
	public boolean numberCard(){
		return false;
	}
	
	
	public void setNumber(int number)
	{
		this.action_number = number;
	}
	
	/*
	 * to string for action card(non-Javadoc)
	 * @see java.lang.Object#toString()
	 * @return a string descibing what kind of card the object is
	 */
	public String toString(){
		String output, cc, action;
		switch(action_number)
		{
		case 1: action = "skip";
				break;
		case 2: action = "reverse";
				break;
		case 3: action = "draw two";
				break;
		case 4: action = "wild";
				break;
		case 5: action = "wild draw 4";
				break;
		default: action = "not an action card";
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
		
		output = "card color is " + cc + " card type is " + action + ".";
		return output;
	}
}
