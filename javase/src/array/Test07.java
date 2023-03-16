package array;

public class Test07 {
    public static void main(String[] args) {
        //一维数组
        int[] arr = {1,2,3,4};
        //二维数组
        int[][] arr1 = {{1,2,3},{1,2,3},{2,3,4}};
        System.out.println(arr1.length);

        int[][] s1 = {{1,2,3},{2,3,4},{3,4,5}};

        int[] s2 = s1[0];
        int s3 = s2[0];
        System.out.println(s3);

        //以上三行代码相当于
        System.out.println(s1[0][0]);

        //遍历二维数组
        for(int i = 0;i<s1.length;i++){
            for(int j = 0;j<s1[i].length;j++){
                System.out.println(s1[i][j]);
            }
        }


    }
}
