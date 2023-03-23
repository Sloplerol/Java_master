package 泛型;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test01 {
    public static void main(String[] args) {
        List l = new ArrayList();
        Cat c = new Cat();
        Mouse m = new Mouse();
        l.add(c);
        l.add(m);
        Iterator it = l.iterator();
        while(it.hasNext()){
            Object obj = it.next();
            if(obj instanceof Cat){
                Cat c1 = (Cat)obj;
                c1.jump();
            }
        }
    }
}

class Cat extends Test01{
    public void jump(){
        System.out.println("我能条约");
    }
}

class Mouse extends Test01{
    public void dip(){
        System.out.println("我能钻地");
    }
}
