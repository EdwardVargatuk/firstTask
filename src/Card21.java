/*
 * loading the standard java libraries for various things
 */
import java.util.Random;//random number generator
import java.util.ArrayList;//Array lists
import java.util.Scanner;//Input, either from a file or user input.
import java.util.Calendar; //dates and times.

public class Card21 {

    static Calendar cal = Calendar.getInstance();//getting the current system time.
    static Random r = new Random(cal.getTimeInMillis());//creating a new random number generator using the time since epoch as a seed.
    static Scanner s = new Scanner(System.in);//create a reader to take user input.

    public static void main(String args[])//"main" is the method run by default when the program runs.
    {
        /*
         * An ArrayList is simply an array with a non-fixed size.
         * In this case, it's actually created in the "drawCards() method from the helper functions block.
         */
        ArrayList<Integer> cards = drawTwo();

        /*
         * Get the first card from the list,
         * the second card from the list,
         * and then get the total of them from the cardsTotal() method.
         */
        System.out.println("You drew " + cards.get(0) + " and " + cards.get(1) + " giving you a current score of " + cardsTotal(cards));

        /*
         * Check if the total of the cards list equals 21.
         * If it does, print a message and leave the program.
         */
        if(cardsTotal(cards) == 21)
        {
            System.out.println("Congratulations, you got 21!");
            return;//Return will always end the current method. If the current function is main, it will end the program.
        }

        System.out.println("Press 1 to draw another card. Press 2 to stand");
        playCards(cards);//start the playCards() method, passing it the "cards" list.
    }

    /*
     * The playCards method just asks for input and then
     * runs the appropriate steps.
     * If you press one the method calls itself, to keep playing.
     */
    public static void playCards(ArrayList<Integer> cards)
    {
        int choice = getChoice();//The getChoice method is in the helper methods block.

        if(choice == 1)//The the players choice is 1
        {
            int newCard = drawCard();//draw a card with the "drawCard()" method
            cards.add(newCard);//add it to the list.
            System.out.println("You drew a " + newCard + ".");//print what you drew
            if(cardsTotal(cards) == 21)//and then check if you have 21 or more.
            {
                System.out.println("Congratulations, you got 21!");
                return;
            }
            else if(cardsTotal(cards) > 21)
            {
                System.out.println("Whoops, you have too many points");
                return;
            }
            else {//if you don't have 21 or more, it continues.
                System.out.println("You currently have " + cardsTotal(cards) + " cards. Press 1 or 2 again");
                playCards(cards);//call this method again. This is known as recursion.
            }
        }

        else {//If the user doesn't choose 1
            System.out.println("Your final score is " + cardsTotal(cards));//print the final score
            return;//and break out of the loop.
        }
    }

    /*
     * The drawCard method generates a random int
     * makes it an appropriate "card" value
     * and then returns the int to whatever method called it.
     */

    public static int drawCard()
    {
        int card = r.nextInt(13) + 1;//gets the next random int, >= 0 and < 13, and then adds one to make sure we get a non-0 number.
        if( card == 1)//if it was an ace it should be worth 11
        {
            card = 11;
        }
        else if( card > 10) //if it wasn't 1 and it's more then 10 it should be worth 10.
        {
            card = 10;
        }
        return card;//return the card to the calling method.
    }


    /*
     * Methods below here are helper methods.
     * They do various tasks needed in generating a hand,
     * taking and validating user input, and
     * calculating how many points a set of cards are worth.
     */

    public static ArrayList<Integer> drawTwo()
    {
        ArrayList<Integer> cards = new ArrayList<Integer>();
        for(int i = 0; i < 2; i++)
        {
            cards.add(drawCard());
        }
        return cards;
    }

    public static int cardsTotal(ArrayList<Integer> cards)
    {
        int total = 0;
        for(int card :cards)
        {
            total += card;
        }
        return total;
    }

    public static int getChoice()
    {
        int choice = 0;
        while(choice != 1 && choice != 2)
        {
            String next = s.next();
            try{
                choice = Integer.parseInt(next);
            }
            catch(Exception e)
            {
                System.out.println("That was not a valid input");
            }
        }
        return choice;
    }

}
