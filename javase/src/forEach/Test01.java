package forEach;

public class Test01 {
    public static void main(String[] args) {
        int[] arr = {1,23,4,5};
        //普通for循环
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        //增强for循环
        for(int data : arr){
            System.out.println(data);
        }
    }
}
