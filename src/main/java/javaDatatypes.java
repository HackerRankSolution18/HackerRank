import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class javaDatatypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {
            try
            {
                long x=sc.nextLong();
                List<String> dataTypes = getDataTypes(x);
                System.out.println(x+" can be fitted in:");
                for (String dataType : dataTypes) {
                    System.out.println("* " + dataType);
                }
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        }
    }

    public static List<String> getDataTypes(long x) {
        List<String> dataTypes = new ArrayList<>();
        if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) {
            dataTypes.add("byte");
        }
        if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) {
            dataTypes.add("short");
        }
        if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) {
            dataTypes.add("int");
        }
        if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) {
            dataTypes.add("long");
        }
        return dataTypes;
    }
}
