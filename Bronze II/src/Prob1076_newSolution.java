import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Prob1076_newSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long result =0;
        List<String> color = new ArrayList<>(
                Arrays.asList("black", "brown", "red", "orange", "yellow", "green", "blue",
                        "violet", "grey", "white"));
        // OR I could use enum

        String first = sc.nextLine();
        String second = sc.nextLine();
        String third = sc.nextLine();
        sc.close();

        result += color.indexOf(first)*10; // If I used enum named Color, Color.valueOf(first).ordinal()
        result += color.indexOf(second);
        result *= Math.pow(10, color.indexOf(third));

        System.out.println(result);

    }
}
