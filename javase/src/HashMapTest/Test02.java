package HashMapTest;

import java.util.*;

public class Test02 {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<String>();
        ls.add("hello");
        ls.add("hello1");

        for(String data : ls){
            System.out.println(data);
        }
    }
}

class School{
    private String name;

    public School() {
    }

    public School(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return Objects.equals(name, school.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
