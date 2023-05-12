import java.util.Scanner;

public class JavaIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String result = checkNumber(N);
        System.out.println(result);
    }

    public static String checkNumber(int N) {
        if (N % 2 != 0) {
            return "Weird";
        } else {
            if (N >= 2 && N <= 5) {
                return "Not Weird";
            } else {
                if (N >= 6 && N <= 20) {
                    return "Weird";
                } else {
                    return "Not Weird";
                }
            }
        }
    }
}


