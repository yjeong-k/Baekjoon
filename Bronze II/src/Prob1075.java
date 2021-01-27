import java.util.Scanner;

public class Prob1075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = sc.nextInt();

        for(int i=(n/100)*100; i<((n/100)+1)*100; i++){
            if(i%f==0){
                System.out.printf("%02d%n", i%100);
                return;
            }
        }

    }
}
