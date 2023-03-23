package 泛型;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test02 {
    public static void main(String[] args) {
        //通过泛型为List指定类型
        List<Animal> ls = new ArrayList<Animal>();
        Chick c = new Chick();
        Dog d = new Dog();
        ls.add(c);
        ls.add(d);
        //表示迭代器迭代的Animal类型
        Iterator<Animal> it = ls.iterator();
        while(it.hasNext()){
            Animal a = it.next();
            if(a instanceof Chick){
                Chick ci = (Chick)a;
                ci.eat();
            }
        }
    }
}

class Animal{
    public void move(){
        System.out.println("我能移动");
    }
}

class Chick extends Animal{
    public void eat(){
        System.out.println("我能吃");
    }
}

class Dog extends Animal{
    public void bark(){
        System.out.println("我能叫");
    }
}
