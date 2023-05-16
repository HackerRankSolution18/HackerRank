import java.util.Scanner;

public class oneDarraypart2 {
    public static boolean canWin(int leap, int[] game) {
        VirtualPlayer v=new VirtualPlayer(leap, game);
        v.tick();
        return v.winnable;
        // Return true if you can win the game; otherwise, return false.
    }
    static class VirtualPlayer{
        private int pos =0;
        private int Ip;
        private int[] map;
        boolean winnable = false;
        public VirtualPlayer(int Ip, int[] map){
            this.Ip=Ip;
            this.map=map;
        }
        private void moveup(){
            if(map[pos+1]==0){
                pos++;
                tick();
            }
        }
        private void movedown(){
            if((pos-1)>=0 && map[pos-1]==0){
                map[pos]=1;
                pos--;
                tick();
            }
        }
        private void jump(){
            if((pos+Ip)<map.length){
                if(map[pos+Ip]==0){
                    int posoId=pos;
                    pos=pos+Ip;
                    tick();
                    pos=posoId;
                }
            }
        }
        void tick(){
            if(pos==(map.length-1)||((pos+Ip)>=map.length)){
                winnable=true;
            }else{
                this.moveup();
                if(Ip!=0){
                    this.jump();
                }
                this.movedown();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
