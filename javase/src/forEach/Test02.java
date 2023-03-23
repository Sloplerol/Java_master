package forEach;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test02 {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();
        ls.add("1");
        ls.add("2");
        ls.add("3");
        Iterator<String> it = ls.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
            //for
            for(int i = 0;i<ls.size();i++){
                System.out.println(ls.get(i));
            }
            //foreach
            for(String data : ls){
                System.out.println(data);
            }
        }
    }
}
