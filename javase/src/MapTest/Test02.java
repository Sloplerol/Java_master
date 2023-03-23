package MapTest;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Test02 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        //向map里面添加key和value
        map.put(1,"hello");
        map.put(2,"hello");
        map.put(3,"hello");
        map.put(4,"hello");

        //通过key来获取value
        map.get(3);

        //获取键值对的数量
        map.size();

        //通过key来删除value
        map.remove(3);

        //判断是否包含某个key
        map.containsKey(3);

        //判断是否包含某个value
        map.containsValue("hello");

        //清空集合
        map.clear();

        //判断是否为空
        map.isEmpty();

        //获取里面的所有value
        Collection<String> values = map.values();
        for(String str : values){
            System.out.println(str);
        }

        map.put(1,"hello");
        map.remove(1);
        System.out.println(map.size());
    }
}
