package homework;

public class MystackTest {
    public static void main(String[] args) {
        Mystack ms = new Mystack();
        //输出引用自动调用toString方法
        ms.push(new Object());
        ms.push(new Object());
        ms.push(new Object());
        ms.push(new Object());
        System.out.println(ms.pop());
    }
}
