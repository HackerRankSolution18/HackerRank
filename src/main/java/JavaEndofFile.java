import java.util.Scanner;

public class JavaEndofFile {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String line;
        int i=1;
        while(scan.hasNext()){
            line = scan.nextLine();
            System.out.println(i+" "+line);
            i++;
        }
    }
}
