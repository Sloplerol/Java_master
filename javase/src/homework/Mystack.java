package homework;

public class Mystack {
    //所有对象都继承了Object相当于数组如果定义了Object类就可以访问到所有到数据类型
    //字符串不需要new也是一个对象
    private Object[] elements;

    private int index;

    public Mystack() {
        //设置默认初始容量
        this.elements = new Object[10];
        this.index =  -1;
    }

    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }

    public void push(Object obj){
        if(index >= elements.length - 1){
            System.out.println("栈满了");
            return;
        }
        this.index++;
        this.elements[index] = obj;
        System.out.println("压栈成功"+elements[index]+"栈顶指向"+index);
    }

    public Object pop(){
        if(index - 1 < 0) {
            System.out.println("栈已经空了无法进行弹栈操作");
            return null;
        }
        String s1 = "弹栈成功"+elements[index]+"栈顶指向"+(index-1);
        return s1;
    }
}




