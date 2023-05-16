import java.util.Scanner;

public class staticintializer {
    static int B, H;
    static boolean flag;

    static {
        Scanner scan = new Scanner(System.in);
        B = scan.nextInt();
        H = scan.nextInt();
        if (B > 0 && H > 0) {
            flag = true;
        } else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static int calculateArea() {
        if (flag) {
            int area = B * H;
            return area;
        }
        return -1; // or any other appropriate value to indicate an error
    }

    public static void main(String[] args) {
        int area = calculateArea();
        if (area != -1) {
            System.out.println(area);
        }
    }
}
