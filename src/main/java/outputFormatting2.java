import java.util.Scanner;

public class outputFormatting2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int N= Integer.parseInt(scanner.nextLine().trim());
        String result = multiple(N);
        System.out.println(result);
    }
    public static String multiple(int N){
        StringBuilder sb= new StringBuilder();
        for(int i=1;i<=10;i++){
            int result = N*i;
            sb.append(N).append(" x ").append(i).append(" = ").append(result).append("\n");

        }
        return sb.toString();
    }
}
