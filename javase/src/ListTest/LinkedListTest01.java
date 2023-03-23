package ListTest;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest01 {
    public static void main(String[] args) {
        List a = new LinkedList();
        a.add(1);
        a.add(2);
        a.add(3);
        for(int i = 0;i<a.size();i++){
            System.out.println(a.get(i));
        }
    }
}
