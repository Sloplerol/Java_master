package HashMapTest;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Test01 {
    public static void main(String[] args) {
        Student s1 = new Student("123");
        Student s2 = new Student("123");
        System.out.println(s1.equals(s2));
        //由于hashcode默认返回的值是内存地址
        System.out.println(s1.hashCode() == s2.hashCode());

        Set<Student> stu = new HashSet<Student>();
        stu.add(s1);
        stu.add(s2);
        System.out.println(stu.size()); //长度为2因为没有重写hashCode方法
    }


}

class Student{
    private String name;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

//    public boolean equals(Object obj){
//        if(obj == null || !(obj instanceof Student)) return false;
//        if(obj == this) return true;
//        Student stu = (Student)obj;
//        return this.name == stu.name;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
