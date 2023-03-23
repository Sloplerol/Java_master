package CollectiveTest;

import java.util.ArrayList;
import java.util.Collection;

public class Test05 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        User u1 = new User("hello");
        c.add(u1);
        User u2 = new User("hello");
        //由于方法进行了重写现在比较的是存储池里的内容
        System.out.println(c.contains(u2));

        Integer x1 = new Integer(1000);
        Integer x2 = new Integer(1000);
        //Integer重写的equals方法
        System.out.println(x1.equals(x2));
    }
}

class User{
    private String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }
    //对equals方法进行重写
    public boolean equals(Object o){
        if(o == null && !(o instanceof User)) return false;
        if(o == this) return true;
        //将传入对o对象进行强制转换
        User u = (User)o;
//        比较User内对属性和外部传进来的属性
        return u.name.equals(this.name);
    }
}
