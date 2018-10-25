//import java.io.IOException;
//import java.util.Random;
//
//public class GuessChar111 {
//
//
//    char[] values = {'a','b','c','d', 'e','f','g','h','i','j'};
//
////    private char ch;
////    int i = 0;
////    public char setAlphabet() {
////        for (char ch = 'a'; ch <= 'z'; ++ch)
//////            values[i++] = ch;
////        System.out.println(ch);
////        return ch;
////    }
//
//    public int getChar() {
//        Random r = new Random();
//
//        int randomChar = r.nextInt(values.length);
//        System.out.println(randomChar);
//        System.out.println(values.toString().charAt(randomChar));
////        String s = values.toString().charAt(5);
//
////char str = (char)String.valueOf(values[randomChar]);
////                (char) Character.getType(values.toString().indexOf(randomChar));
//
//        return  randomChar;
//    }
//
//    public GuessChar111() {
//
//    }
//
//    public static void main(String[] args) throws IOException {
//
//        GuessChar111 gc = new GuessChar111();
////        System.out.println(gc.setAlphabet());
//        System.out.println(gc.getChar());
//
////        int num = gc.getChar().indexOf(gc.values);
////        int f;
////        int count = 0;
////        System.out.println("Please guess the latin letter from a to z");
////
////        try {
////            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
////
////            do {
////                char s = reader.readLine().toLowerCase().charAt(0);
////                f = gc.values.indexOf(s);
////                System.out.println("You entered: " + s);
////                count++;
////                if (f < num & f >= 0)
////                    System.out.println("Too low!" + " Plese enter another one");
////                else if (f > num & f < 26) System.out.println("Too high!" + " Plese enter another one");
////                else if (f != num) System.out.println("Please enter latin letter");
////            } while (f != num);
////            System.out.println("congratulation, you guess the letter from the " + count + " attempts");
////
////        } catch (IOException e) {
////            throw new IOException("Please enter letter", e);
////        }
//
//    }
//
//}
