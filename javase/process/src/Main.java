import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 1;i<=100;i++){
            //小值代表每天增加的钱数
            for(int j = 100;j>=1;j--){
                //首先获取大值首天的钱数
                if((21 * i + 7 * j) * 52 == n){
                    System.out.println(j);
                    System.out.println(i);
                    return;
                }
            }
        }
    }










}
