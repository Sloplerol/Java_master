package MapTest;

import java.util.*;

public class Test03 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"123");
        map.put(2,"123");
        map.put(3,"123");
        //keySet获取全部key，通过key来获取value
        Set<Integer> keys = map.keySet();

        //通过迭代器方式去获取所有的value值
        //创建迭代器对象
        Iterator<Integer> it = keys.iterator();

        while(it.hasNext()){
            Integer key = it.next();
            System.out.println(key + "=" + map.get(key));
        }
        //通过foreach来获取所有的值
        for(Integer key : keys){
            System.out.println(map.get(key));
        }

        //第二种方法去获取
        Set<Map.Entry<Integer,String>> set = map.entrySet();
        Iterator<Map.Entry<Integer,String>> it1 = set.iterator();
        while(it1.hasNext()){
            Map.Entry<Integer,String> node = it1.next();
            System.out.println(node.getKey());
            System.out.println(node.getValue());
        }

        for(Map.Entry<Integer,String> node1 : set){
            System.out.println(node1.getKey() + "----->" + node1.getValue());
        }




    }
}
