package Interview;

/**
 * FizzBuzz prints "Fizz" if num is a multiple of three
 * prints "Buzz" if num is a multiple of five
 * prints "FizzBuzz" if both a multiple of three and five
 *
 * @author Justin
 * @version 1.0.0
 */
public class FizzBuzz {

    /**
     * Drives the program.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) System.out.println(i + " FizzBuzz");
            else if (i % 3 == 0) System.out.println(i + " Fizz");
            else if (i % 5 == 0) System.out.println(i + " Buzz");
            else System.out.println(i + "");
        }
    }
}
