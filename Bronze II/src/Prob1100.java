import java.util.Scanner;

public class Prob1100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] board = new char[8][8];
        int result = 0;

        for(int i=0; i<8; i++){
            String chess = sc.nextLine();
            for(int j=0; j<8; j++){
                board[i][j] = chess.charAt(j);
            }
        }
        sc.close();

        for(int i=0; i<8; i++){
            if(i%2==0){
                for(int j=0; j<8; j+=2){
                    if(board[i][j]=='F')
                        result++;
                }
            } else{
                for(int j=1; j<8; j+=2){
                    if(board[i][j]=='F')
                        result++;
                }
            }
        }

        System.out.println(result);
    }
}
