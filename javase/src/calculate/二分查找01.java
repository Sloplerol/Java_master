package calculate;

public class 二分查找01 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};


        int index = ArraySearch(arr,3);
        System.out.println(index == -1 ? "不存在该元素" : "存在钙元素下标为"+index);
    }

    public static int ArraySearch(int[] arr, int i) {
        for(int j = 0;j<arr.length;j++){
            if(arr[j] == i){

                return j;
            }
        }
        return -1;
    }
}

