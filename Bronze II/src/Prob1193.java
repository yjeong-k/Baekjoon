import java.util.Scanner;

public class Prob1193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int seq;

        for(seq=1; num>seq; seq++) // not num>=seq
            num -= seq;

        int divisor = seq+1-num;
        if(seq%2==0){
            System.out.println(num+"/"+divisor);
        } else{
            System.out.println(divisor+"/"+num);
        }
        sc.close();
    }
}

