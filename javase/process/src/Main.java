import java.util.Arrays;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[3];
        int[] arr1 = new int[3];
        int tmpSum = 0;
        int num = 0;
        for(int i = 0;i<N;i++){
            int sum = 0;
            for(int j = 0;j<3;j++){
                arr1[j] = scanner.nextInt();
                sum += arr1[j];
                if(i == 1 && arr1[j] - arr[j] <= 5 && sum - tmpSum <= 10){
                    num++;
                }
            }
            arr = arr1;
            tmpSum = sum;
        }
    }


}



