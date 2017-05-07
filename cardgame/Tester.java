package cardgame;

import java.util.*;

public class Tester {
	public static void main(String[] args){
		UnoGame myGame = new UnoGame();
		Hand myHand = new Hand();
		Hand hand2 = new Hand();
		Hand hand3 = new Hand();
		Discard myPile = new Discard();
		
		myGame.newDeck(); // creates new deck
		myGame.shuffelDeck(); // shuffels the decck twice
		
		System.out.println("deck size is " + myGame.deckSize()); // prints the size of the deck
		System.out.println("hand size is " + myHand.handSize()); // prints the size of my hand
		
		myHand.draw(myGame.drawCard());  // EX: 1 of a draw method this draws 1
		myHand.draw(myGame.getDeck(), 4); // EX: 2 of a draw method this draws multiple
		hand2.draw(myGame.getDeck(), 5); // draw 5 cards for hand 2
		hand3.draw(myGame.getDeck(), 5);// draw 5 cards for hand 3
		
		System.out.println("deck size is " + myGame.deckSize());
		System.out.println("my hand size is " + myHand.handSize());
		System.out.println("hand 2 size is " + hand2.handSize());
		System.out.println("hand 2 size is " + hand3.handSize());
		
		
		myHand.play(myPile.getPile(),0); // plays first card in my hand [by index]
		hand2.play(myPile.getPile(),0); // plays first card in hand 2
		hand3.play(myPile.getPile(), 0); // plays first card in hand 3
		
		//System.out.println(myPile.viewTop());
		System.out.println("");
		System.out.println("deck size is " + myGame.deckSize());
		System.out.println("my hand size is " + myHand.handSize());
		System.out.println("hand 2 size is " + hand2.handSize());
		System.out.println("hand 3 size is " + hand3.handSize());
		System.out.println("pile size is " + myPile.pileSize());
		
		System.out.println("pile top is " + myPile.viewTop());
		
		// prints out the hand
		Iterator<Cards> it = myHand.getHand().iterator();
		int i = 0;
		while(it.hasNext()) {
			System.out.println(myHand.viewHand(i));	
			if(it.hasNext()){
			i++;}
			if(i == myHand.handSize()){
				break ;}
		}
		
//		for(int j = 0; i < myHand.handSize() ; j++){
//			System.out.println("Card # "+ j +" "+ myHand.viewHand(j));
//		}
		
	}
	
  }
