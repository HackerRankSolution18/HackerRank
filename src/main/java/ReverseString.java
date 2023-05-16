import java.util.Scanner;

public class ReverseString {
    public static String reverseString(String input) {
        String reversed = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            reversed = c + reversed;
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.nextLine();
        String reversedString = reverseString(A);
        System.out.println(reversedString);
    }
}
