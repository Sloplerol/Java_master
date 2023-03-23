package 泛型;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test03 {
    public static void main(String[] args) {
        //<>里可以不传数据，会自动判断
        List li = new ArrayList<>();
        Animal a = new Animal();
        parrot p = new parrot();
        lion l = new lion();
        li.add(a);
        li.add(p);
        li.add(l);

        List<String> lt = new ArrayList<>();
        lt.add("hello");
        lt.add("world");
        Iterator<String> it = lt.iterator();
        while(it.hasNext()){
            String str = it.next();
            String str1 = str.substring(3);
            System.out.println(str1);
        }
    }
}

class parrot extends Animal{
    public void eat(){
        System.out.println("我能吃");
    }
}

class lion extends Animal{
    public void bark(){
        System.out.println("我能叫");
    }
}
