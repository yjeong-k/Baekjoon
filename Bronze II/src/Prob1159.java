import java.util.Scanner;

public class Prob1159 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean print = false;
        int players = sc.nextInt();
        char[] alphabet = new char[26];

        for(int i=0; i<players; i++){
            alphabet[sc.next().charAt(0)-'a']++;
        }

        for(int i=0; i< alphabet.length; i++){
            if(alphabet[i]>=5) {
                System.out.print((char)(i+'a'));
                print = true;
            }
        }

        if(!print)
            System.out.println("PREDAJA");

        sc.close();
    }
}
