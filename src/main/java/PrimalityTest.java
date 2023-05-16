import java.math.BigInteger;
import java.util.Scanner;

public class PrimalityTest {
    public static void main(String[] args) {
        Scanner bufferedReader = new Scanner(System.in);

        BigInteger n = bufferedReader.nextBigInteger();

        bufferedReader.close();
        System.out.println(n. isProbablePrime(10)? "prime" : "not prime");
    }
}
