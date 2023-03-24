package HashMapTest;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest04 {
    public static void main(String[] args) {
        //通过比较器的方式对TreeSet里传入对象参数大小进行比较
        //这种方法需要给构造方法传递比较器
        TreeSet<Lion> treeSet = new TreeSet<>(new Lion());
        treeSet.add(new Lion(1));
        treeSet.add(new Lion(3));
        treeSet.add(new Lion(2));

        for(Lion num : treeSet){
            System.out.println(num);
        }
    }
}

class Lion implements Comparator<Lion> {

    int age;

    public Lion() {
    }

    public Lion(int age) {
        this.age = age;
    }

    public String toString(){
        return "[你的年龄是]"+this.age;
    }
    public int compare(Lion o1, Lion o2) {
        return o1.age - o2.age;
    }

}
