import java.util.Scanner;
import java.util.StringTokenizer;

public class Prob1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringTokenizer str = new StringTokenizer(input, " ");
        System.out.println(str.countTokens());
        sc.close();

        // trim()을 사용하면 문자열 앞뒤의 공백 제거
        // tokenizer 대신 split(" ").length 사용 가능

    }
}
