package array;

public class Test02 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        Arrlength(arr);
        String []str = {"a","b","c"};
        Stringlength(str);
        //动态初始化的数据可以直接传入
        Arrlength(new int[3]);
        //静态需要加上new 类型[]
        Arrlength(new int[]{1,2,3});
    }

    public static void Arrlength(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void Stringlength(String[] args){
        for (int i = 0;i< args.length;i++){
            System.out.println(args[i]);
        }
    }
}
