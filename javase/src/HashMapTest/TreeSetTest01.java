package HashMapTest;

import java.util.TreeSet;

public class TreeSetTest01 {
    public static void main(String[] args) {
        //创建一个TreeSet集合
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("hello");
        treeSet.add("aello");
        treeSet.add("bello");
        //按照字典大小依次进行排序
        for(String s : treeSet){
            System.out.println(s);
        }
    }
}
