package array;

public class Test08 {
    public static void main(String[] args) {
        //创建一个3行4列的二维数组
        int[][] arr = new int[3][4];
        twoarr(arr);

        //直接传入二维数组
        twoarr(new int[][] {{1,2,3},{1,2,3}});

    }

    public static void twoarr(int[][] arr){
        for(int i = 0;i<arr.length;i++){
            for (int j = 0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
