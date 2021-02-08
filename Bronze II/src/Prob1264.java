import java.util.Scanner;

public class Prob1264 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            String input = sc.nextLine().toLowerCase(); // if lowered, no need to check the capital vowels
            int vowel =0;
            if(input.equals("#"))
                break;

            for(int i=0; i<input.length(); i++){
                char ch = input.charAt(i);
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                    vowel++;
            }
            System.out.println(vowel);
        }
    }
}
