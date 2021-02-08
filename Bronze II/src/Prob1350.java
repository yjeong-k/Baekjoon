import java.util.Scanner;

public class Prob1350 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fileNum = sc.nextInt();
        int[] files = new int[fileNum];
        long result = 0;

        for(int i=0; i<fileNum; i++){
            files[i] = sc.nextInt();
        }

        int cluster = sc.nextInt();

        for(int i=0; i<fileNum; i++){
            if(files[i]!=0){ // two cases
                if(files[i]%cluster==0){
                    result += (files[i]/cluster);
                } else{
                    result += (files[i]/cluster)+1;
                }
            }
        }

        System.out.println(result*cluster);
        sc.close();

    }
}
