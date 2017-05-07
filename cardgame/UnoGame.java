package cardgame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

import javax.swing.JFrame;

public class UnoGame {
    ArrayList<Cards> deck = new ArrayList<Cards>();// empty array list	
    ArrayList<Cards> pile = new ArrayList<Cards>();// empty discard pile
    ArrayList<Cards> hand = new ArrayList<Cards>();// empty hand list
	
    /*
     *  creates a new deck of cards and puts them in the deck array list
     */
	public void newDeck(){
		CardDeck myDeck = new CardDeck();// creates CardDeck 
		myDeck.fillDeck(deck);// fills array list with CardDeck  
	}
	
	
	/*
	 *  shuffles the cards twice with Collections.shuffle
	 */
	public void shuffelDeck(){
		Collections.shuffle(deck);
		Collections.shuffle(deck);
	}
	
	/*
	 *  removes the top card from the deck and returns it 
	 */
	public Cards drawCard(){	
		return deck.remove(0);
	}
	
	/*
	 * @returns the size of the deck as integer
	 * 
	 */
	public int deckSize(){
		return deck.size();
	}
	/*
	 * @return the deck of cards as an array list of card objects
	 */
	public ArrayList<Cards> getDeck(){
		return deck;
	}
}


// handles the actions a player will make hand/player would be the same thing in this situation 
 class Hand extends UnoGame{
	
	
	/*
	 *  draws a card from the deck of cards and adds to the array list
	 *  @param  c must insert card object in parameters
	 */
	public void draw(Cards c){
		//Cards holder = new Cards(0);
		//holder.equals(drawCard());
		//hand.add(holder);
		hand.add(c);
	}
	
	/*
	 * draws a card from the deck
	 * @param c must be an arraylist of card objects
	 * @param d is the index of the desired object in the list
	 */
	public void draw(ArrayList<Cards> c, int d){ 
		for(int e = 0; e < d; e++){
			hand.add(c.remove(d));
		}
	}
	
	
	/*
	 * removes a card from the hand and adds to the to of the pile
	 * @param c must be the pile arraylist of card objects
	 * @param index is the index of the card in the hand that you want to play
	 */
	public void play(ArrayList<Cards> c, int index){
		c.add(hand.remove(index));
	}
	
	/*
	 * @return the size of the hand array list
	 */
	public int handSize(){
		return hand.size();
	}
	
	/*
	 * view hand is used to return a to string method of the desired index of the hand list
	 * @return a String of the card object
	 */
	public String viewHand(int i){
		return hand.get(i).toString();
	}
	
	/*
	 * returns the hand as an array list of card objects
	 * @return the hand array list 
	 */
	public ArrayList<Cards> getHand(){
		return hand;
	}
}
 
 
 class Discard extends UnoGame{
	 /*
	  *  adds the cards in the pile to the deck then shuffles and clears the pile array list
	  *  
	  */
	 public void clear(){
		 deck.addAll(pile);
		 shuffelDeck();
		 pile.clear();
	 }
	 
	 
	 /*
	  *  returns info on the top car on the discard pile in a string format this is mainly place holder 
	  *  Until event operation is determined.
	  *  @return a string of the top of the pile array list
	  */
	 public String viewTop(){
		 return pile.get(0).toString();
	 }
	 
	 /*
	  * @return an integer of how many card objects are in the pile arraylist
	  */
	 public int pileSize(){
		 return pile.size();
	 }
	 
	 /*
	  * returns the pile array list of card objects
	  */
	 public ArrayList<Cards>  getPile(){
		 return pile;
	 }
 }
