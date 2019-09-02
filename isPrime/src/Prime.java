import java.util.Scanner;

public class Prime {
    public static void main (String [] key) {
        if (isPrime(n) == true) {
            System.out.println("This is Prime.");
        }
        return;
    }
    public static boolean isPrime(String[] p) {
        Scanner n = new Scanner(System.in);
        if (n < 2) {
            return false;
        } else {
            for (int i = 2; i*i <= n; i++) {
                if (n % i == 0) {
                    return false;
                }

            }
            return true;
        }
    }
}
