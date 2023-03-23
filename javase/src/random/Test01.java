package random;

import java.util.Arrays;
import java.util.Random;

public class Test01 {
    public static void main(String[] args) {
        Random rd = new Random();
        //产生int范围内的随机数字
        int result = rd.nextInt();
        System.out.println(result);

        //随机产生0-100内的随机整数
        int result1 = rd.nextInt(100);
        System.out.println(result1);

        //随机产生5个不重复的数字放到数组内
        Random rd1 = new Random();
        int[] arr = new int[5];
        for(int a = 0;a<arr.length;a++){
            arr[a] = -1;
        }

        for(int i = 0;i<arr.length;){
            int num = rd1.nextInt(5);

            if(!judge(arr,num)){
                arr[i++] = num;
            }
        }
        for(int j = 0;j<arr.length;j++){
            System.out.println(arr[j]);
        }

    }
    //在进行某条语句判断的时候尽量将其当作方法抽离出来
    public static boolean judge(int[] arr,int num){
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == num){
                return true;
            }
        }
        return false;
    }
}
