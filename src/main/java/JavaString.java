import java.util.Scanner;

public class JavaString {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());
        System.out.println(A.compareTo(B)>0?"Yes" : "No");
        System.out.println(capFirstLetter(A)+" "+capFirstLetter(B));
    }
    public static  String capFirstLetter(String str) {
        if (str == null || str.length() == 0) {
            return "";
        } else {
            return str.substring(0, 1).toUpperCase() + str.substring(1);

        }
    }
}
