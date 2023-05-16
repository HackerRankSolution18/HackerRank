import java.util.HashMap;
import java.util.Scanner;

public class Map1 {
    public static void main(String[] args) {
        HashMap<String, Integer> hash = new HashMap<String, Integer>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            hash.put(name, phone);
            in.nextLine();
        }
        while (in.hasNext()) {
            String s = in.nextLine();
            if (hash.containsKey(s)) {
                System.out.println(s + "=" + hash.get(s));
            } else {
                System.out.println("Not found");
            }
        }
    }
}
