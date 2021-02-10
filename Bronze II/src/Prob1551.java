import java.util.Scanner;

public class Prob1551 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String input = sc.next();

        String[] split = input.split(",");
        int[] seq = new int[split.length];
        for(int i=0; i< split.length; i++){
            seq[i] = Integer.parseInt(split[i]);
        }

        for(int i=0; i<k; i++){
            for(int j=1; j<seq.length-i; j++) {
                seq[j - 1] = seq[j] - seq[j - 1];
            }
        }

        for(int i=0; i< n-k-1 ; i++){
            System.out.print(seq[i]+",");
        }
        System.out.println(seq[n-k-1]);


    }
}
