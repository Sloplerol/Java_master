package calculate;

public class 冒泡 {
    public static void main(String[] args) {
        int[] arr = {3,4,1,2,5,6,7};
        int tmp = 0;
        int count = 0;
        for(int i = arr.length-1;i>0;i--){
            for(int j = 0;j < i;j++){
                count++;
                if(arr[j] > arr[j+1]){
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;

                }

            }
        }
        System.out.println("比较次数为"+count);
        for(int i = 0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
