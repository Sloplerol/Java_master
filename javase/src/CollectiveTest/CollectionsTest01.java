package CollectiveTest;

import java.util.*;

public class CollectionsTest01 {
    public static void main(String[] args) {
        //ArrayList是非线程安全的
        List<String> list = new ArrayList<>();
        //调用synchronizedList来转化成线程安全的
        Collections.synchronizedList(list);
        list.add("abc");
        list.add("zzzz");
        list.add("bca");
        //排序方法
        Collections.sort(list);
        for(String data : list){
            System.out.println(data);
        }


        List<Potato> ls = new ArrayList<>();
        ls.add(new Potato(2));
        ls.add(new Potato(3));
        ls.add(new Potato(5));
        //需要实现Comparable接口来实现排序
        Collections.sort(ls);
        for(Potato data : ls){
            System.out.println(data);
        }

        //如果想要对set集合进行排序通过将list集合转化为set集合
        Set<String> set = new HashSet<>();
        set.add("hello");
        set.add("hello1");
        set.add("hello2");
        List<String> list1 = new ArrayList<>(set);
        Collections.sort(list1);
        for(String data : list1){
            System.out.println(data);
        }

    }
}

class Potato implements Comparable<Potato>{
    int age = 10;

    public Potato() {
    }

    public Potato(int age) {
        this.age = age;
    }

    public int compareTo(Potato potato){
        return potato.age - this.age;
    }
    public String toString(){
        return "土豆今年的岁数是:"+this.age;
    }


}
