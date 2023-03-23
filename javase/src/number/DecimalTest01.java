package number;

import java.text.DecimalFormat;

public class DecimalTest01 {
    public static void main(String[] args) {
        //#代表任意数字
        //，代表千分位
        //. 代表小数点
        //0 代表补零
        DecimalFormat df = new DecimalFormat("##,##.###");
        String s = df.format(1234.123);
        System.out.println(s);

        DecimalFormat df1 = new DecimalFormat("##,###.0000");
        String s2 = df1.format(2123.34);
        System.out.println(s2); //2,123.3400
    }
}
