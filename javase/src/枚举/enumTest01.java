package 枚举;

public class enumTest01 {
    public static void main(String[] args) {
         boolean isTrue = divide(10,0);
        System.out.println(isTrue);
    }

    public static boolean divide(int a,int b){

        try{
            int c = a/b;
            return true;
        }catch(Exception e) {
            return false;
        }
    }

}
