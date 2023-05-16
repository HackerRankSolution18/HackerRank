import java.util.Scanner;

public class JavaifElse2 {
    public static void main(String[] args) {
           /* Scanner in = new Scanner(System.in);
            int t=in.nextInt();
            for(int i=0;i<t;i++){
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();
                int res = a;
                for(int j=0;j<n;j++){
                    res +=(int)(Math.pow(2, j)*b);
                    System.out.print(Integer.toString(res) +' ');
                }
                System.out.print('\n');

            }
            in.close();*/

        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int[] aArray = new int[t];
        int[] bArray = new int[t];
        int[] nArray = new int[t];
        for(int i=0;i<t;i++){
            aArray[i] = in.nextInt();
            bArray[i] = in.nextInt();
            nArray[i] = in.nextInt();
        }
        in.close();

        int[] resultArray = calculateValues(t, aArray, bArray, nArray);
        for(int i=0;i<t;i++){
            System.out.print(Integer.toString(resultArray[i]) +' ');
        }
        System.out.print('\n');
    }
    public static int[] calculateValues(int t, int[] aArray, int[] bArray, int[] nArray) {
        int[] resultArray = new int[t];
        for(int i=0;i<t;i++){
            int a = aArray[i];
            int b = bArray[i];
            int n = nArray[i];
            int res = a;
            for(int j=0;j<n;j++){
                res +=(int)(Math.pow(2, j)*b);
                resultArray[i] = res;
            }
        }
        return resultArray;
    }

    }
