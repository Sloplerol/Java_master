import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n = scanner.nextInt();
        int sum = 0;
        for(int i = 0;i<n;i++){
            if(i == 8){
                i = 1;
            }
            if(i<6){
                sum += 250;
            }
        }
        System.out.println(sum);


    }

}