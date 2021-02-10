import java.util.Scanner;

public class Prob1371 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] alphabet = new int[26];

        while(sc.hasNextLine()){ // crucial method for this prob
            String input = sc.nextLine();
            for(int i=0; i<input.length(); i++){
                char ch = input.charAt(i);
                if(ch>='a' && ch<='z')
                    alphabet[ch-'a']++;
            }
        }

        int maxIndex=0;
        for(int i=1; i< alphabet.length; i++){
            if(alphabet[maxIndex]<alphabet[i])
                maxIndex=i;
        }

        for(int i=0; i< alphabet.length; i++){
            if(alphabet[i]==alphabet[maxIndex])
                System.out.print((char)(i+'a'));
        }
        sc.close();
    }
}
