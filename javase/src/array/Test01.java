package array;

public class Test01 {
    public static void main(String[] args) {
        String[] name;
        //初始化一个元素有3个的数组，每一个元素默认为0
        int[] age = new int[3];

        int[] num = {1,2,3,4};
        System.out.println(num.length);
        for(int i = 0;i<num.length;i++){
            System.out.println(num[i]);
        }

        int[] a = new int[3];
        for(int j = 0;j<a.length;j++){
            System.out.println(a[j]);
        }
    }
}
