import java.util.Scanner;

public class Prob1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] conversion = new int[3];

        for(int i=0; i<3; i++){
            String color = sc.nextLine();
            switch(color){
                case "black":
                    conversion[i] = 0;
                    break;
                case "brown":
                    conversion[i] = 1;
                    break;
                case "red":
                    conversion[i] = 2;
                    break;
                case "orange":
                    conversion[i] = 3;
                    break;
                case "yellow":
                    conversion[i] = 4;
                    break;
                case "green":
                    conversion[i] = 5;
                    break;
                case "blue":
                    conversion[i] = 6;
                    break;
                case "violet":
                    conversion[i] = 7;
                    break;
                case "grey":
                    conversion[i] = 8;
                    break;
                case "white":
                    conversion[i] = 9;
                    break;
                default:
                    System.out.println("input error");
                    return;
            }
        }
        sc.close();

        double result = (conversion[0]*10+conversion[1])*Math.pow(10, conversion[2]);
        System.out.println((long)result); // cannot use (int) conversion b/c some results exceed the range of int.
    }
}
