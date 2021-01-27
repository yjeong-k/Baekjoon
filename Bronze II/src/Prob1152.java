import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Prob1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringTokenizer str = new StringTokenizer(input, " ");
        ArrayList<String> tokenized = new ArrayList<>();
        while(str.hasMoreTokens())
            tokenized.add(str.nextToken());
        sc.close();

        System.out.println(tokenized.size());
    }
}
