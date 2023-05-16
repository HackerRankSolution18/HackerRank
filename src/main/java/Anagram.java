import java.util.Locale;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.nextLine();
        String B = scanner.nextLine();
        boolean ret = isAnagram(A, B);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");

    }

    public static boolean isAnagram(String A, String B) {
        A = A.toUpperCase();
        B = B.toUpperCase();
        boolean ret = false;
        StringBuilder c = new StringBuilder(B);
        if (A.length() == B.length()) {
            for (int i = 0; i < A.length(); i++) {
                for (int j = 0; j < c.length(); j++) {
                    if (A.charAt(i) == c.charAt(j)) {
                        c.deleteCharAt(j);
                        if (i == A.length() - 1 && c.length() == 0) {
                            ret = true;
                            break;
                        }
                        break;
                    }
                }
            }

        }
        return ret;
    }
}