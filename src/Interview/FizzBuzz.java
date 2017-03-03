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
        final String FIZZ = "Fizz";
        final String BUZZ = "Buzz";

        for (int i = 1; i <= 100; i++) {
            boolean fizz = (i % 3 == 0);
            boolean buzz = (i % 5 == 0);

            if (fizz && buzz) System.out.println(i + " " + FIZZ + BUZZ);
            else if (fizz) System.out.println(i + " " + FIZZ);
            else if (buzz) System.out.println(i + " " + BUZZ);
            else System.out.println(i);
        }
    }
}
