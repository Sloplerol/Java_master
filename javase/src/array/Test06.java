package array;

public class Test06 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] arr1 = new int[20];
        System.arraycopy(arr,1,arr1,3,2);

        for(int i = 0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }

        Object[] obj = {new Object(),new Object(),new Object()};
        Object[] obj1 = new Object[20];
        System.arraycopy(obj,0,obj1,0,3);
        for (int i = 0;i<obj1.length;i++){
            System.out.println(obj1[i]);
        }
    }
}
