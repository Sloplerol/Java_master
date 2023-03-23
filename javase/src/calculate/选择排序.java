package calculate;

public class 选择排序 {
    public static void main(String[] args) {
        int[] arr = {2,3,1,4};
        int min;
        int tmp = 0;
        int count = 0;
        for(int i = 0;i< arr.length-1;i++){
            min = i;
            for(int j = i+1;j<arr.length;j++){
                count++;
                //判断首条数据和后面的所有数据大小
                if(arr[min] > arr[j]){
                    min = j;
                }

            }
            //当min发生改变当时候需要交换位置
            if(min != i){
                tmp = arr[min];
                arr[min] = arr[i];
                arr[i] = tmp;
            }

        }
        //相比于冒泡排序效率高了很多
        System.out.println("循环的次数为"+count);
        for(int h = 0;h<arr.length;h++){
            System.out.println(arr[h]);
        }
    }
}
