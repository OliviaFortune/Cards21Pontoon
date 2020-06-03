package blackjack;
import java.util.Scanner;
import java.util.Random;
public class blackjack {
public static void main(String[] args) {
	       
	      
	        //Set scanner on 
		    Scanner input = new Scanner(System.in);
		    // Set the arrays for numbers, types and suits 
		    int cards[] = {2,3,4,5,6,7,8,9,10};
		    String card[] = {"Hearts", "Diamonds", "Clubs", "Spades"};
		    String suit[] = {"A","K","Q","J"};
		    //System.out.println(cards[2]);
		    //Generate random dealer and customer cards 
		    Random random = new Random();
		    int Dealercard1value =  cards[random.nextInt(cards.length)];
		    String Dealercard1type  =  card[random.nextInt(card.length)];
		    
		    Random random1 = new Random();
		    int Customer1value =  cards[random1.nextInt(cards.length)];
		    String Customer1type  =  card[random1.nextInt(card.length)];
		    
		    Random random3 = new Random();
		    int Dealercard2value =  cards[random3.nextInt(cards.length)];
		    String Dealercard2type  =  card[random3.nextInt(card.length)];
		    
		    Random random4 = new Random();
		    int Customer2value =  cards[random4.nextInt(cards.length)];
		    String Customer2type  =  card[random4.nextInt(card.length)];
		    
		    //Print the cards 
		    
		    System.out.println("My Dealers card is this " + "Card one is "  + Dealercard1value + " " + Dealercard1type);
		    System.out.println("My Dealers card is this " + "Card Two is "  + Dealercard2value + " " + Dealercard2type);
		    System.out.println("My Customers card is this " + "Card one is "  + Customer1value + " " + Customer1type);
		    System.out.println("My Customer card is this " + "Card Two is "  + Customer2value + " " + Customer2type);
		}
		
	}

 