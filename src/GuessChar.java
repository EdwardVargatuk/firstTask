import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class GuessChar {

    Random rand = new Random();
    static int attempts = 0;

    public char getRandomChar() {
        char randomChar = (char) (rand.nextInt(26) + 'a');
        System.out.println(randomChar);
        return randomChar;
    }

    public char readFromConsole() throws IOException, IndexOutOfBoundsException {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            char charFromPlayer = reader.readLine().toLowerCase().charAt(0);
            System.out.println("You entered: " + charFromPlayer);
            attempts++;
            return charFromPlayer;
        } catch (IndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException("\nPlease enter something\n");
        } catch (IOException e) {
            throw new IOException("exception" + e);
        }
    }

    public void outputFromCompareChar(int i) {
        switch (i) {
            case 1:
                System.out.println("Too low!" + " Plese enter another one");
                break;
            case 2:
                System.out.println("Too high!" + " Plese enter another one");
                break;
            case 3:
                System.out.println("Please enter latin letter");
                break;
                default:
                    break;

        }
    }

    public int compareChar(char chrPlayer, char chrRandom) {
        if (chrPlayer < chrRandom && chrPlayer >= 'a')
            return 1;
        else if (chrPlayer > chrRandom && chrPlayer <= 'z')
            return 2;
        else if (chrPlayer != chrRandom)
            return 3;
        else return 0;
    }

    public static void main(String[] args) throws IOException {
        GuessChar guessChar = new GuessChar();
        System.out.println("Please guess the latin letter from a to z");
        char randChr = guessChar.getRandomChar();
        char playChr;
        do {
            playChr = guessChar.readFromConsole();
            guessChar.outputFromCompareChar(guessChar.compareChar(playChr, randChr));
        }
        while (playChr != randChr);
        System.out.println("congratulation, you guess the letter from the " + attempts + " attempts");
    }
}