package calculate;

public class 二分查找02 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        int index = ElementSearch(arr,3);
        System.out.println(index == -1 ? "没有找到该元素" : "找到该元素了下标为"+index);
    }

    public static int ElementSearch(int[] arr, int i) {
        int begin = 0;
        int end = arr.length-1;
        int center = (begin+end)/2;
        while(begin<=end){
            if(arr[center] > i){
                end = center - 1;
            }else if(arr[center] < i){
                begin = center + 1;
            }else {
                return center;

            }

        }
        return -1;
    }
}
