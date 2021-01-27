import java.util.Scanner;
import java.util.StringTokenizer;

public class Prob1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringTokenizer str = new StringTokenizer(input, " ");
        System.out.println(str.countTokens());
        sc.close();
    }
}
