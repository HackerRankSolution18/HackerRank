import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int N =scan.nextInt();
        List<Integer> L=new ArrayList<Integer>(N);
        for(int i=0;i<N;i++){
            L.add(scan.nextInt());
        }
        int Q=scan.nextInt();
        for(int i=0;i<Q;i++){
            String operation=scan.next();
            if(operation.equals("Insert")){
                int index=scan.nextInt();
                int value=scan.nextInt();
                L.add(index,value);
            }else if(operation.equals("Delete")){
                int index=scan.nextInt();
                L.remove(index);
            }
        }
        for(int element: L){
            System.out.print(element+" ");
        }
    }
}
