import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String ISBN = s.next().replace("-","");
        char[] arr = new char[10];
        int mod11 = 0;
        for(int i = 0;i<ISBN.length();i++){
            //length 10

            arr[i] = ISBN.charAt(i);
        }

        for(int j = 0;j<arr.length;j++){
            System.out.println(arr[j]);
        }

        System.out.println(Integer.valueOf('1'));
        char c = '2';
        int n = c - '0';
        System.out.println(n);

    }


}