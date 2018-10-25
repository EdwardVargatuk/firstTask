//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Random;
//
//public class GuessCharfinal {
//
//    String latinChars = "abcdefghijklmnopqrstuvwxyz";
//    Random rand = new Random();
//   static int indexOfCharFromPlayer;
//   static int attempts = 0;
//
//    public GuessCharfinal() {
//
//    }
//
//    public char getRandomChar() {
//        char randomChar = latinChars.charAt(rand.nextInt(latinChars.length()));
//
//         System.out.println(randomChar);
//            return  randomChar;
//    }
//
//    public void readFromConsole()throws IOException, IndexOutOfBoundsException{
//
//            try {
//                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//                char charFromPlayer = reader.readLine().toLowerCase().charAt(0);
//
//                indexOfCharFromPlayer = latinChars.indexOf(charFromPlayer);
//                System.out.println("You entered: " + charFromPlayer);
//                attempts++;
//
//            } catch (IndexOutOfBoundsException e) {
//                throw new IndexOutOfBoundsException("\nPlease enter something\n");
//            }
//            catch (IOException e) {
//                throw new IOException("exception"+e);
//            }
//        }
//
//public void compareChar(int a, int b){
//    if (a < b & a >= 0)
//        System.out.println("Too low!" + " Plese enter another one");
//    else if (a > b & a < 26)
//        System.out.println("Too high!" + " Plese enter another one");
//    else if (a != b)
//        System.out.println("Please enter latin letter");
//}
//    public static void main(String[] args) throws IOException {
//
//
//        GuessCharfinal guessChar = new GuessCharfinal();
//        System.out.println("Please guess the latin letter from a to z");
//
////        int a = guessChar.getRandomChar();
//        int indexOfCharFromRandom = guessChar.latinChars.indexOf(guessChar.getRandomChar());
//        do {
//
//            guessChar.readFromConsole();
//    guessChar.compareChar(indexOfCharFromPlayer, indexOfCharFromRandom);
////            if (indexOfCharFromPlayer < indexOfCharFromRandom & indexOfCharFromPlayer >= 0)
////                System.out.println("Too low!" + " Plese enter another one");
////            else if (indexOfCharFromPlayer > indexOfCharFromRandom & indexOfCharFromPlayer < 26)
////                System.out.println("Too high!" + " Plese enter another one");
////            else if (indexOfCharFromPlayer != indexOfCharFromRandom)
////                System.out.println("Please enter latin letter");
//
//
//
//        }
//        while (indexOfCharFromPlayer != indexOfCharFromRandom);
//        System.out.println("congratulation, you guess the letter from the " + attempts + " attempts");
//
//
//    }
//
//}