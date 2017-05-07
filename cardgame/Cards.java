package cardgame;

public class Cards {
	
	/*
	 * @param color an integer that determines the card color 1 - 5
	 */
	public int color;
	Cards(int color){
		setColor(color);
	}
	
	/*
	 * @param sets the color of the card witn integers 1 - 5
	 */
	public void setColor(int c){
			this.color = c;
		}
	
    /*
     * @return the integer that represents the color of the card 1 - 5
     */
	public  int getColor(){
			return color;
		}
	}