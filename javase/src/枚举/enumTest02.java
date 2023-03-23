package 枚举;

public class enumTest02 {
    public static void main(String[] args) {

        System.out.println(divide(10 ,0) == Result.SUCCESS ? "计算正常" : "计算失败");
    }

    public static Result divide(int a,int b){
        try{
            int c = a / b;
            return Result.SUCCESS;
        }catch(Exception e) {
            return Result.FALSE;
        }
    }


}
//当计算结果多于两种的话可以使用枚举来解决问题
enum Result{
    SUCCESS,FALSE;
}
