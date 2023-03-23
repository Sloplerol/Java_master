package number;

import java.math.BigDecimal;

public class BigDecimalTest01 {
    public static void main(String[] args) {
        //定义精度极高的数据
        BigDecimal a = new BigDecimal(2);
        BigDecimal b = new BigDecimal(2);
        BigDecimal sum = a.add(b);
        System.out.println(sum);

    }
}
