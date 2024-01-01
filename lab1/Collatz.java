/** Class that prints the Collatz sequence starting from a given number.
 *  @author Gang Hu
 */
public class Collatz {

    /** Buggy implementation of nextNumber! */
    public static int nextNumber(int n)
    {
        // The last one
        if (n == 1) {
            return 1;
        }
        // Even number
        else if (n % 2 == 0) {
            return n/2;
        }
        // Odd number
        else{
            return 3 * n + 1;
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.print(n + " ");
        while (n != 1) {
            n = nextNumber(n);
            System.out.print(n + " ");
        }
        System.out.println();
    }
}

