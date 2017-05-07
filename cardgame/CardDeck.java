package cardgame;
import java.util.*;




public class CardDeck {
private int players; // initialize a players integer



// card objects created below
// red cards
Number_Cards r0 = new Number_Cards(0,1);
Number_Cards r1 = new Number_Cards(1,1);
Number_Cards r2 = new Number_Cards(2,1);
Number_Cards r3 = new Number_Cards(3,1);
Number_Cards r4 = new Number_Cards(4,1);
Number_Cards r5 = new Number_Cards(5,1);
Number_Cards r6 = new Number_Cards(6,1);
Number_Cards r7 = new Number_Cards(7,1);
Number_Cards r8 = new Number_Cards(8,1);
Number_Cards r9 = new Number_Cards(9,1);
// second set of red cards
Number_Cards r00 = new Number_Cards(0,1);
Number_Cards r11 = new Number_Cards(1,1);
Number_Cards r22 = new Number_Cards(2,1);
Number_Cards r33 = new Number_Cards(3,1);
Number_Cards r44 = new Number_Cards(4,1);
Number_Cards r55 = new Number_Cards(5,1);
Number_Cards r66 = new Number_Cards(6,1);
Number_Cards r77 = new Number_Cards(7,1);
Number_Cards r88 = new Number_Cards(8,1);
Number_Cards r99 = new Number_Cards(9,1);


// green cards
Number_Cards g0 = new Number_Cards(0,2);
Number_Cards g1 = new Number_Cards(1,2);
Number_Cards g2 = new Number_Cards(2,2);
Number_Cards g3 = new Number_Cards(3,2);
Number_Cards g4 = new Number_Cards(4,2);
Number_Cards g5 = new Number_Cards(5,2);
Number_Cards g6 = new Number_Cards(6,2);
Number_Cards g7 = new Number_Cards(7,2);
Number_Cards g8 = new Number_Cards(8,2);
Number_Cards g9 = new Number_Cards(9,2);
//second set of green cards
Number_Cards g00 = new Number_Cards(0,2);
Number_Cards g11 = new Number_Cards(1,2);
Number_Cards g22 = new Number_Cards(2,2);
Number_Cards g33 = new Number_Cards(3,2);
Number_Cards g44 = new Number_Cards(4,2);
Number_Cards g55 = new Number_Cards(5,2);
Number_Cards g66 = new Number_Cards(6,2);
Number_Cards g77 = new Number_Cards(7,2);
Number_Cards g88 = new Number_Cards(8,2);
Number_Cards g99 = new Number_Cards(9,2);

// yellow cards
Number_Cards y0 = new Number_Cards(0,3);
Number_Cards y1 = new Number_Cards(1,3);
Number_Cards y2 = new Number_Cards(2,3);
Number_Cards y3 = new Number_Cards(3,3);
Number_Cards y4 = new Number_Cards(4,3);
Number_Cards y5 = new Number_Cards(5,3);
Number_Cards y6 = new Number_Cards(6,3);
Number_Cards y7 = new Number_Cards(7,3);
Number_Cards y8 = new Number_Cards(8,3);
Number_Cards y9 = new Number_Cards(9,3);
// second set of yellow cards
Number_Cards y00 = new Number_Cards(0,3);
Number_Cards y11 = new Number_Cards(1,3);
Number_Cards y22 = new Number_Cards(2,3);
Number_Cards y33 = new Number_Cards(3,3);
Number_Cards y44 = new Number_Cards(4,3);
Number_Cards y55 = new Number_Cards(5,3);
Number_Cards y66 = new Number_Cards(6,3);
Number_Cards y77 = new Number_Cards(7,3);
Number_Cards y88 = new Number_Cards(8,3);
Number_Cards y99 = new Number_Cards(9,3);

// blue cards
Number_Cards b0 = new Number_Cards(0,4);
Number_Cards b1 = new Number_Cards(1,4);
Number_Cards b2 = new Number_Cards(2,4);
Number_Cards b3 = new Number_Cards(3,4);
Number_Cards b4 = new Number_Cards(4,4);
Number_Cards b5 = new Number_Cards(5,4);
Number_Cards b6 = new Number_Cards(6,4);
Number_Cards b7 = new Number_Cards(7,4);
Number_Cards b8 = new Number_Cards(8,4);
Number_Cards b9 = new Number_Cards(9,4);
// second set of blue cards
Number_Cards b00 = new Number_Cards(0,4);
Number_Cards b11 = new Number_Cards(1,4);
Number_Cards b22 = new Number_Cards(2,4);
Number_Cards b33 = new Number_Cards(3,4);
Number_Cards b44 = new Number_Cards(4,4);
Number_Cards b55 = new Number_Cards(5,4);
Number_Cards b66 = new Number_Cards(6,4);
Number_Cards b77 = new Number_Cards(7,4);
Number_Cards b88 = new Number_Cards(8,4);
Number_Cards b99 = new Number_Cards(9,4);

// action cards are created
Action_Cards redSkip = new Action_Cards(1,1);
Action_Cards redReverse = new Action_Cards(2,1);
Action_Cards redDrawTwo = new Action_Cards(3,1);

Action_Cards greenSkip = new Action_Cards(1,2);
Action_Cards greenReverse = new Action_Cards(2,2);
Action_Cards greenDrawTwo = new Action_Cards(3,2);

Action_Cards yellowSkip = new Action_Cards(1,3);
Action_Cards yellowReverse = new Action_Cards(2,3);
Action_Cards yellowDrawTwo = new Action_Cards(3,3);

Action_Cards blueSkip = new Action_Cards(1,4);
Action_Cards blueReverse = new Action_Cards(2,4);
Action_Cards blueDrawTwo = new Action_Cards(3,4);

Action_Cards w1 = new Action_Cards(4,5);
Action_Cards w2 = new Action_Cards(4,5);
Action_Cards w3 = new Action_Cards(4,5);
Action_Cards w4 = new Action_Cards(4,5);

Action_Cards d1 = new Action_Cards(5,5);
Action_Cards d2 = new Action_Cards(5,5);
Action_Cards d3 = new Action_Cards(5,5);
Action_Cards d4 = new Action_Cards(5,5);




	
    	
    
    // method that will fill an array list with cards in order
    public void fillDeck(ArrayList<Cards> myDeck){
    	
    	myDeck.add(r0); myDeck.add(r1); myDeck.add(r2); myDeck.add(r3); myDeck.add(r4);
    	myDeck.add(r5); myDeck.add(r6); myDeck.add(r7); myDeck.add(r8); myDeck.add(r9);

    	myDeck.add(r00); myDeck.add(r11); myDeck.add(r22); myDeck.add(r33); myDeck.add(r44);
    	myDeck.add(r55); myDeck.add(r66); myDeck.add(r77); myDeck.add(r88); myDeck.add(r99);

    	myDeck.add(g0); myDeck.add(g1); myDeck.add(g2); myDeck.add(g3); myDeck.add(g4);
    	myDeck.add(g5); myDeck.add(g6); myDeck.add(g7); myDeck.add(g8); myDeck.add(g9);

    	myDeck.add(g00); myDeck.add(g11); myDeck.add(g22); myDeck.add(g33); myDeck.add(g44);
    	myDeck.add(g55); myDeck.add(g66); myDeck.add(g77); myDeck.add(g88); myDeck.add(g99);

    	myDeck.add(y0); myDeck.add(y1); myDeck.add(y2); myDeck.add(y3); myDeck.add(y4);
    	myDeck.add(y5); myDeck.add(y6); myDeck.add(y7); myDeck.add(y8); myDeck.add(y9);

    	myDeck.add(y00); myDeck.add(y11); myDeck.add(y22); myDeck.add(y33); myDeck.add(y44);
    	myDeck.add(y55); myDeck.add(y66); myDeck.add(y77); myDeck.add(y88); myDeck.add(y99);

    	myDeck.add(b0); myDeck.add(b1); myDeck.add(b2); myDeck.add(b3); myDeck.add(b4);
    	myDeck.add(b5); myDeck.add(b6); myDeck.add(b7); myDeck.add(b8); myDeck.add(b9);

    	myDeck.add(b00); myDeck.add(b11); myDeck.add(b22); myDeck.add(b33); myDeck.add(b44);
    	myDeck.add(b55); myDeck.add(b66); myDeck.add(b77); myDeck.add(b88); myDeck.add(b99);

    	myDeck.add(redSkip); myDeck.add(redReverse); myDeck.add(redDrawTwo);
    	myDeck.add(greenSkip); myDeck.add(greenReverse); myDeck.add(greenDrawTwo);
    	myDeck.add(yellowSkip); myDeck.add(yellowReverse); myDeck.add(yellowDrawTwo);
    	myDeck.add(blueSkip); myDeck.add(blueReverse); myDeck.add(blueDrawTwo);
    		
    	myDeck.add(w1); myDeck.add(w2); myDeck.add(w3); myDeck.add(w4);
    	myDeck.add(d1); myDeck.add(d2); myDeck.add(d3); myDeck.add(d4);
    }
    
    
    
    public boolean shuffle = false;
    
    /*
     * @param ArrayList<Cards> T array list of cards
     */
    public void shuffle(ArrayList<Cards> T){
    	Collections.shuffle(T);
    	shuffle = true;
 	 }
    /*
     * is a boolean method 
     * @return true if is shuffled
     * @return fals if not
     */
     public boolean isShuffled(){
    	 if(shuffle){return true;}
    	 else{return false;}
     }
     
     /*
      *  return deck of cards this does nothing will most likely be deleted
      *  this most likely does nothing
      */
     public ArrayList<Cards> getDeck(ArrayList<Cards> deck){
    	 return deck;
    	 
     }
     /*
      * returns the number of players
      * @return # of players as an integer
      */
     public int getPlayers(){
    	 return players;
     }
     
     /*
      * sets the number of players
      */
     public void setPlayers(int p){
    	 this.players = p;
     }
}
